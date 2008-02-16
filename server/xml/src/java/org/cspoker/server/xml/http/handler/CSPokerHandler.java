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
package org.cspoker.server.xml.http.handler;

import org.cspoker.server.common.game.session.PlayerKilledExcepion;
import org.cspoker.server.common.game.session.Session;
import org.cspoker.server.common.game.session.SessionManager;
import org.cspoker.server.xml.common.XmlPlayerCommunication;
import org.cspoker.server.xml.common.XmlPlayerCommunicationFactory;
import org.cspoker.server.xml.http.handler.abstracts.AbstractHttpHandlerImpl;
import org.cspoker.server.xml.http.handler.exception.HttpExceptionImpl;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.sun.net.httpserver.HttpExchange;


public class CSPokerHandler extends AbstractHttpHandlerImpl{

	private final XmlPlayerCommunicationFactory f = XmlPlayerCommunicationFactory.global_factory;
	
    @Override
    protected String getResponse(HttpExchange http) throws HttpExceptionImpl{
	
	    String username= AbstractHttpHandlerImpl.toPlayerName(http.getRequestHeaders());
	    Session session = SessionManager.global_session_manager.getSession(username);
	    try {
		XmlPlayerCommunication playerComm = f.getRegisteredXmlPlayerCommunication(session, null);
		try {
		    playerComm.handle(new InputSource(http.getRequestBody()));
		} catch (SAXException e) {
		    throw new HttpExceptionImpl(e, 400);
		}
		return playerComm.getAndFlushCache();
		
	    } catch (PlayerKilledExcepion e) {
		throw new HttpExceptionImpl(e, 400);
	    }
    }
    
    
   

}