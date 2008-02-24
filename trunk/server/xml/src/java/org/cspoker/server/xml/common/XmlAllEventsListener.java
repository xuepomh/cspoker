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
package org.cspoker.server.xml.common;

import java.io.StringWriter;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.cspoker.common.eventlisteners.AllEventsListener;
import org.cspoker.common.events.Event;
import org.cspoker.common.events.gameevents.GameMessageEvent;
import org.cspoker.common.events.gameevents.NewCommunityCardsEvent;
import org.cspoker.common.events.gameevents.NewDealEvent;
import org.cspoker.common.events.gameevents.NewRoundEvent;
import org.cspoker.common.events.gameevents.NextPlayerEvent;
import org.cspoker.common.events.gameevents.PlayerJoinedGameEvent;
import org.cspoker.common.events.gameevents.PlayerLeftTableEvent;
import org.cspoker.common.events.gameevents.ShowHandEvent;
import org.cspoker.common.events.gameevents.WinnerEvent;
import org.cspoker.common.events.gameevents.playeractionevents.AllInEvent;
import org.cspoker.common.events.gameevents.playeractionevents.BetEvent;
import org.cspoker.common.events.gameevents.playeractionevents.BigBlindEvent;
import org.cspoker.common.events.gameevents.playeractionevents.CallEvent;
import org.cspoker.common.events.gameevents.playeractionevents.CheckEvent;
import org.cspoker.common.events.gameevents.playeractionevents.FoldEvent;
import org.cspoker.common.events.gameevents.playeractionevents.RaiseEvent;
import org.cspoker.common.events.gameevents.playeractionevents.SmallBlindEvent;
import org.cspoker.common.events.gameevents.privateevents.NewPocketCardsEvent;
import org.cspoker.common.events.serverevents.PlayerJoinedEvent;
import org.cspoker.common.events.serverevents.PlayerLeftEvent;
import org.cspoker.common.events.serverevents.ServerMessageEvent;
import org.cspoker.common.events.serverevents.TableCreatedEvent;
import org.cspoker.common.xml.XmlEventListener;
import org.xml.sax.SAXException;

public class XmlAllEventsListener implements AllEventsListener {

	private final static Logger logger = Logger
			.getLogger(XmlAllEventsListener.class);
	private final XmlEventListener collector;

	public XmlAllEventsListener(XmlEventListener collector) {
		this.collector = collector;
	}

	public void eventToCollector(Event event) {
		try {
			StringWriter xml = new StringWriter();
			SAXTransformerFactory tf = (SAXTransformerFactory) TransformerFactory
					.newInstance();
			TransformerHandler response = tf.newTransformerHandler();
			response.setResult(new StreamResult(xml));
			response.startDocument();
			event.toXml(response);
			response.endDocument();
			collector.collect(xml.toString());
		} catch (TransformerConfigurationException e) {
			logger.error("Can't send event.", e);
			throw new IllegalStateException(e);
		} catch (TransformerFactoryConfigurationError e) {
			logger.error("Can't send event.", e);
			throw new IllegalStateException(e);
		} catch (SAXException e) {
			logger.error("Can't send event.", e);
			throw new IllegalStateException(e);
		}
	}

	public void onAllInEvent(AllInEvent event) {
		eventToCollector(event);
	}

	public void onBetEvent(BetEvent event) {
		eventToCollector(event);
	}

	public void onBigBlindEvent(BigBlindEvent event) {
		eventToCollector(event);
	}

	public void onCallEvent(CallEvent event) {
		eventToCollector(event);
	}

	public void onCheckEvent(CheckEvent event) {
		eventToCollector(event);
	}

	public void onFoldEvent(FoldEvent event) {
		eventToCollector(event);
	}

	public void onRaiseEvent(RaiseEvent event) {
		eventToCollector(event);
	}

	public void onSmallBlindEvent(SmallBlindEvent event) {
		eventToCollector(event);
	}

	public void onNewPocketCardsEvent(NewPocketCardsEvent event) {
		eventToCollector(event);
	}

	public void onNewCommunityCardsEvent(NewCommunityCardsEvent event) {
		eventToCollector(event);
	}

	public void onNewDealEvent(NewDealEvent event) {
		eventToCollector(event);

	}

	public void onNewRoundEvent(NewRoundEvent event) {
		eventToCollector(event);

	}

	public void onNextPlayerEvent(NextPlayerEvent event) {
		eventToCollector(event);

	}

	public void onPlayerJoinedGameEvent(PlayerJoinedGameEvent event) {
		eventToCollector(event);

	}

	public void onPlayerLeftTableEvent(PlayerLeftTableEvent event) {
		eventToCollector(event);

	}

	public void onShowHandEvent(ShowHandEvent event) {
		eventToCollector(event);

	}

	public void onWinnerEvent(WinnerEvent event) {
		eventToCollector(event);

	}

	public void onGameMessageEvent(GameMessageEvent event) {
		eventToCollector(event);

	}

	public void onPlayerJoinedEvent(PlayerJoinedEvent event) {
		eventToCollector(event);

	}

	public void onPlayerLeftEvent(PlayerLeftEvent event) {
		eventToCollector(event);

	}

	public void onTableCreatedEvent(TableCreatedEvent event) {
		eventToCollector(event);

	}

	public void onServerMessageEvent(ServerMessageEvent event) {
		eventToCollector(event);

	}

}