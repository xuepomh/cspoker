/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package org.cspoker.server.rmi.unremote;

import java.rmi.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

import org.cspoker.common.api.lobby.context.ForwardingLobbyContext;
import org.cspoker.common.api.lobby.context.LobbyContext;
import org.cspoker.common.api.lobby.event.TableCreatedEvent;
import org.cspoker.common.api.lobby.event.TableRemovedEvent;
import org.cspoker.common.api.lobby.holdemtable.context.HoldemTableContext;
import org.cspoker.common.api.lobby.listener.LobbyListener;
import org.cspoker.common.api.lobby.listener.RemoteLobbyListener;
import org.cspoker.common.api.shared.Killable;
import org.cspoker.common.api.shared.listener.ForwardingListener;
import org.cspoker.common.util.SimpleWrapper;

public class UnremoteLobbyContext extends ForwardingLobbyContext implements
LobbyContext {

	private final Killable connection;
	private UnremoteLobbyListener remoteListener;
	protected ConcurrentHashMap<Long, SimpleWrapper<HoldemTableContext>> wrappedContexts = new ConcurrentHashMap<Long, SimpleWrapper<HoldemTableContext>>();
	

	public UnremoteLobbyContext(Killable connection, LobbyContext chatContext) {
		super(chatContext);
		this.connection = connection;
	}

	@Override
	public LobbyListener wrapListener(LobbyListener listener) {
		remoteListener = new UnremoteLobbyListener();
		remoteListener.subscribe(listener);
		return remoteListener;
	}
	
	@Override
	public HoldemTableContext getHoldemTableContext(final long tableId) {
		wrappedContexts.putIfAbsent(tableId, new SimpleWrapper<HoldemTableContext>(){

			private HoldemTableContext content = null;
			
			public synchronized HoldemTableContext getContent() {
				if(content == null){
					content = new UnremoteHoldemTableContext(connection, lobbyContext.getHoldemTableContext(tableId));
				}
				return content;
			}
			
		});
		return wrappedContexts.get(tableId).getContent();
	}

	public void subscribe(RemoteLobbyListener chatListener) {
		remoteListener.subscribe(chatListener);
	}

	public void unSubscribe(RemoteLobbyListener chatListener) {
		remoteListener.unSubscribe(chatListener);
	}

	public class UnremoteLobbyListener extends ForwardingListener<RemoteLobbyListener> implements LobbyListener{

		public void onTableCreated(TableCreatedEvent tableCreatedEvent) {
			try {
				for (RemoteLobbyListener listener : listeners) {
					listener.onTableCreated(tableCreatedEvent);
				}
			} catch (Exception exception) {
				connection.die();
			}
		}

		public void onTableRemoved(TableRemovedEvent tableRemovedEvent) {
			try {
				for (RemoteLobbyListener listener : listeners) {
					listener.onTableRemoved(tableRemovedEvent);
				}
			} catch (Exception exception) {
				connection.die();
			}
		}

	}

}