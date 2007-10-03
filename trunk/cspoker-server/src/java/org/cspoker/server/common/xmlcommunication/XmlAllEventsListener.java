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
package org.cspoker.server.common.xmlcommunication;

import java.io.StringWriter;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.cspoker.server.game.events.AllEventsListener;
import org.cspoker.server.game.events.Event;
import org.cspoker.server.game.events.gameEvents.GameMessageEvent;
import org.cspoker.server.game.events.gameEvents.NewCommunityCardsEvent;
import org.cspoker.server.game.events.gameEvents.NewDealEvent;
import org.cspoker.server.game.events.gameEvents.NewRoundEvent;
import org.cspoker.server.game.events.gameEvents.NextPlayerEvent;
import org.cspoker.server.game.events.gameEvents.PlayerJoinedGameEvent;
import org.cspoker.server.game.events.gameEvents.PlayerLeftTableEvent;
import org.cspoker.server.game.events.gameEvents.PotChangedEvent;
import org.cspoker.server.game.events.gameEvents.ShowHandEvent;
import org.cspoker.server.game.events.gameEvents.StackChangedEvent;
import org.cspoker.server.game.events.gameEvents.WinnerEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.AllInEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.BetEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.BigBlindEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.CallEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.CheckEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.DealEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.FoldEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.RaiseEvent;
import org.cspoker.server.game.events.gameEvents.playerActionEvents.SmallBlindEvent;
import org.cspoker.server.game.events.gameEvents.privateEvents.NewPocketCardsEvent;
import org.cspoker.server.game.events.serverEvents.PlayerJoinedEvent;
import org.cspoker.server.game.events.serverEvents.PlayerLeftEvent;
import org.cspoker.server.game.events.serverEvents.ServerMessageEvent;
import org.cspoker.server.game.events.serverEvents.TableCreatedEvent;
import org.xml.sax.SAXException;

public class XmlAllEventsListener implements AllEventsListener {

    private final static Logger logger = Logger.getLogger(XmlAllEventsListener.class);
    private final XmlEventCollector collector;

    public XmlAllEventsListener(XmlEventCollector collector) {
	this.collector = collector;
    }
    
    public void eventToCollector(Event event){
	try {
	    StringWriter xml = new StringWriter();
	    SAXTransformerFactory tf = (SAXTransformerFactory) TransformerFactory.newInstance();
	    TransformerHandler response = tf.newTransformerHandler();
	    response.setResult(new StreamResult(xml));
	    response.startDocument();
	    event.toXml(response);
	    response.endDocument();
	    collector.collect(xml.toString(), XmlEventType.NOTICE);
	} catch (TransformerConfigurationException e) {
	    logger.error("Can't send event.",e);
	    throw new IllegalStateException(e);
	} catch (TransformerFactoryConfigurationError e) {
	    logger.error("Can't send event.",e);
	    throw new IllegalStateException(e);
	} catch (SAXException e) {
	    logger.error("Can't send event.",e);
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

    public void onDealEvent(DealEvent event) {
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

    public void onPotChangedEvent(PotChangedEvent event) {
	eventToCollector(event);

    }

    public void onShowHandEvent(ShowHandEvent event) {
	eventToCollector(event);

    }

    public void onStackChangedEvent(StackChangedEvent event) {
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