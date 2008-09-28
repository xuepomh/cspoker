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
package org.cspoker.client.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.cspoker.common.api.lobby.holdemtable.context.ForwardingRemoteHoldemTableContext;
import org.cspoker.common.api.lobby.holdemtable.context.RemoteHoldemTableContext;
import org.cspoker.common.api.lobby.holdemtable.holdemplayer.context.RemoteHoldemPlayerContext;
import org.cspoker.common.api.lobby.holdemtable.listener.HoldemTableListener;

public class HoldemTableContextStub extends ForwardingRemoteHoldemTableContext{

	private HoldemPlayerContextStub playerContext;

	public HoldemTableContextStub(RemoteHoldemTableContext context)
			throws RemoteException {
		super(context);
		this.playerContext = new HoldemPlayerContextStub(super.getHoldemPlayerContext());
	}
	
	@Override
	public HoldemTableListener wrapListener(HoldemTableListener listener) throws RemoteException {
		return (HoldemTableListener) UnicastRemoteObject.exportObject(listener, 0);
	}

	@Override
	public RemoteHoldemPlayerContext getHoldemPlayerContext() {
		return playerContext;
	}
}