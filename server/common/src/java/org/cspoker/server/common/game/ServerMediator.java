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

package org.cspoker.server.common.game;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.cspoker.common.eventlisteners.EventListener;
import org.cspoker.common.eventlisteners.server.AllServerEventsListener;
import org.cspoker.common.eventlisteners.server.ServerMessageListener;
import org.cspoker.common.eventlisteners.server.TableCreatedListener;
import org.cspoker.common.events.Event;
import org.cspoker.common.events.serverevents.ServerMessageEvent;
import org.cspoker.common.events.serverevents.TableCreatedEvent;
import org.cspoker.common.player.PlayerId;

public class ServerMediator {

	public ServerMediator() {

	}


	/**
	 * Inform all subscribed table created listeners a table created event has
	 * occurred.
	 * 
	 * Each subscribed table created listener is updated by calling their
	 * onTableCreatedEvent() method.
	 * 
	 */
	public synchronized void publishTableCreatedEvent(TableCreatedEvent event) {
		for (TableCreatedListener listener : tableCreatedListeners) {
			listener.onTableCreatedEvent(event);
		}
		publishServerEvent(event);
	}

	/**
	 * Subscribe the given table created listener for table created events.
	 * 
	 * @param listener
	 *            The listener to subscribe.
	 */
	public void subscribeTableCreatedListener(TableCreatedListener listener) {
		tableCreatedListeners.add(listener);
	}

	/**
	 * Unsubscribe the given table created listener for table created events.
	 * 
	 * @param listener
	 *            The listener to unsubscribe.
	 */
	public void unsubscribeTableCreatedListener(TableCreatedListener listener) {
		tableCreatedListeners.remove(listener);
	}

	/**
	 * This list contains all table created listeners that should be alerted on
	 * a table created.
	 */
	private final List<TableCreatedListener> tableCreatedListeners = new CopyOnWriteArrayList<TableCreatedListener>();


	/**
	 * Inform all subscribed message listeners a message event has occurred.
	 * 
	 * Each subscribed message listener is updated by calling their
	 * onMessageEvent() method.
	 * 
	 */
	public synchronized void publishServerMessageEvent(ServerMessageEvent event) {
		for (ServerMessageListener listener : serverMessageListeners) {
			listener.onServerMessageEvent(event);
		}
		publishServerEvent(event);
	}

	/**
	 * Subscribe the given message listener for message events.
	 * 
	 * @param listener
	 *            The listener to subscribe.
	 */
	public void subscribeServerMessageListener(ServerMessageListener listener) {
		serverMessageListeners.add(listener);
	}

	/**
	 * Unsubscribe the given message listener for message events.
	 * 
	 * @param listener
	 *            The listener to unsubscribe.
	 */
	public void unsubscribeServerMessageListener(ServerMessageListener listener) {
		serverMessageListeners.remove(listener);
	}

	/**
	 * This list contains all message listeners that should be alerted on a
	 * message.
	 */
	private final List<ServerMessageListener> serverMessageListeners = new CopyOnWriteArrayList<ServerMessageListener>();

	/***************************************************************************
	 * Server Events
	 **************************************************************************/

	/**
	 * Inform all subscribed server event listeners a server event has occurred.
	 * 
	 * Each subscribed server event listener is updated by calling their
	 * onEvent() method.
	 * 
	 */
	private synchronized void publishServerEvent(Event event) {
		for (EventListener listener : serverEventListeners) {
			listener.onEvent(event);
		}
	}

	/**
	 * Subscribe the given server event listener for server events.
	 * 
	 * @param listener
	 *            The listener to subscribe.
	 */
	public void subscribeServerEventListener(EventListener listener) {
		serverEventListeners.add(listener);
	}

	/**
	 * Unsubscribe the given server event listener for server events.
	 * 
	 * @param listener
	 *            The listener to unsubscribe.
	 */
	public void unsubscribeServerEventListener(EventListener listener) {
		serverEventListeners.remove(listener);
	}

	/**
	 * This list contains all server event listeners that should be alerted on a
	 * server event.
	 */
	private final List<EventListener> serverEventListeners = new CopyOnWriteArrayList<EventListener>();

	public void subscribeAllServerEventsListener(PlayerId id,
			AllServerEventsListener listener) {
		subscribeServerMessageListener(listener);
		subscribeTableCreatedListener(listener);
	}

	public void unsubscribeAllServerEventsListener(PlayerId id,
			AllServerEventsListener listener) {
		unsubscribeServerMessageListener(listener);
		unsubscribeTableCreatedListener(listener);
	}
}
