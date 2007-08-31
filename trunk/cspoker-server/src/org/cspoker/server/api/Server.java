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
package org.cspoker.server.api;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.cspoker.server.api.authentication.HardCodedBasicAuthentication;
import org.cspoker.server.api.httphandler.AllInHandler;
import org.cspoker.server.api.httphandler.BetHandler;
import org.cspoker.server.api.httphandler.CallHandler;
import org.cspoker.server.api.httphandler.CheckHandler;
import org.cspoker.server.api.httphandler.CreateTableHandler;
import org.cspoker.server.api.httphandler.CrossDomain;
import org.cspoker.server.api.httphandler.DealHandler;
import org.cspoker.server.api.httphandler.FoldHandler;
import org.cspoker.server.api.httphandler.GameEventsAckHandler;
import org.cspoker.server.api.httphandler.GameEventsHandler;
import org.cspoker.server.api.httphandler.JoinTableHandler;
import org.cspoker.server.api.httphandler.LeaveTableHandler;
import org.cspoker.server.api.httphandler.ListTablesHandler;
import org.cspoker.server.api.httphandler.PingHandler;
import org.cspoker.server.api.httphandler.RaiseHandler;
import org.cspoker.server.api.httphandler.StartGameHandler;

import com.sun.net.httpserver.Authenticator;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;

/**
 * Creates a new web server and starts it.
 */
public class Server {

    public static void main(String[] args) throws NumberFormatException, IOException {

	if (args.length != 1) {
	    System.out.println("usage: java -jar cspoker-server.jar [portnumber]");
	    System.exit(0);
	}

	int port=0;
	try {
	    port=Integer.parseInt(args[0]);
	} catch (NumberFormatException e) {
	    System.out.println("usage: java -jar cspoker-server.jar [portnumber]");
	    System.exit(0);
	}

	Server server = new Server(port);
	server.start();
    }
    
    private Authenticator authenticator;

    /**
     * Variable holding the server object.
     */
    private HttpServer server;

    /**
     * Creates a new server at the given port.
     * 
     * @param port
     *        The port to listen at.
     * @throws IOException
     */
    public Server(int port) throws IOException {
	server = HttpServer.create(new InetSocketAddress(port), 0);

	authenticator = new HardCodedBasicAuthentication();
	
	loadContext();
	
	System.out.println("Server created for port " + port + ".");
    }
    
    protected void loadContext(){
	HttpContext pingContext = server.createContext("/ping/", new PingHandler());
	pingContext.setAuthenticator(authenticator);

	HttpContext listTableContext = server.createContext("/table/list/", new ListTablesHandler());
	listTableContext.setAuthenticator(authenticator);

	HttpContext createTableContext = server.createContext("/table/create/", new CreateTableHandler());
	createTableContext.setAuthenticator(authenticator);

	HttpContext joinTableContext = server.createContext("/table/join/", new JoinTableHandler());
	joinTableContext.setAuthenticator(authenticator);
	
	HttpContext leaveTableContext = server.createContext("/table/leave/", new LeaveTableHandler());
	leaveTableContext.setAuthenticator(authenticator);

	HttpContext gameEventsContext = server.createContext("/game/events/", new GameEventsHandler());
	gameEventsContext.setAuthenticator(authenticator);
	
	HttpContext gameEventsAckContext = server.createContext("/game/events/ack/", new GameEventsAckHandler());
	gameEventsAckContext.setAuthenticator(authenticator);
	
	HttpContext startGameContext = server.createContext("/game/start/", new StartGameHandler());
	startGameContext.setAuthenticator(authenticator);
	
	HttpContext dealContext = server.createContext("/game/deal/", new DealHandler());
	dealContext.setAuthenticator(authenticator);
	
	HttpContext callContext = server.createContext("/game/call/", new CallHandler());
	callContext.setAuthenticator(authenticator);
	
	HttpContext betContext = server.createContext("/game/bet/", new BetHandler());
	betContext.setAuthenticator(authenticator);
	
	HttpContext checkContext = server.createContext("/game/check/", new CheckHandler());
	checkContext.setAuthenticator(authenticator);
    
	HttpContext foldContext = server.createContext("/game/fold/", new FoldHandler());
	foldContext.setAuthenticator(authenticator);
	
	HttpContext raiseContext = server.createContext("/game/raise/", new RaiseHandler());
	raiseContext.setAuthenticator(authenticator);
	
	HttpContext allInContext = server.createContext("/game/allin/", new AllInHandler());
	allInContext.setAuthenticator(authenticator);
	
	HttpContext crossDomainContext = server.createContext("/", new CrossDomain());
	
    }

    /**
     * Starts this server.
     * 
     * @throws IOException
     *                 There was a problem opening this server's port.
     */
    public void start() throws IOException {
	server.start();
    }

}