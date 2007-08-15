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

package org.cspoker.server.game.elements.player;

import org.cspoker.server.game.elements.cards.Card;
import org.cspoker.server.game.elements.cards.hand.Hand;
import org.cspoker.server.game.elements.cards.hand.HandEvaluator;
import org.cspoker.server.game.elements.cards.hand.HandTypeCalculator;
import org.cspoker.server.game.player.Player;
import org.cspoker.server.game.player.SavedShowdownPlayer;


/**
 * A class to represent a showdown player.
 * 
 * This class implements the comparable interface
 * to easily get the player(s) with the best hand
 * on top of the list.
 * 
 * @author Kenzo
 *
 */
public class ShowdownPlayer implements Comparable<ShowdownPlayer>{
	
	/**
	 * This variable contains the showdown player.
	 */
	private final Player player;
	
	/**
	 * This variable contains the showdown player's best hand.
	 */
	private final Hand bestHand;
	
	/**
	 * Construct a new showdown player with given player
	 * and given best hand.
	 * 
	 * @param 	player
	 * 			The player for this showdown player.
	 * @param 	bestHand
	 * 			The player's best hand.
	 */
	public ShowdownPlayer(Player player, Hand bestHand){
		this.player = player;
		this.bestHand = bestHand;

	}
	
	/**
	 * Returns the effective showdown player,
	 * as a player.
	 * 
	 * @return 	The effective showdown player,
	 * 			as a player.
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**
	 * Return the best hand.
	 * 
	 * @return The best hand.
	 */
	public Hand getBestHand(){
		return bestHand;
	}
	
	public SavedShowdownPlayer getSavedShowdownPlayer(){
		return new SavedShowdownPlayer(player.getSavedPlayer(), getBestHand());
	}
	
	/**
	 * Returns a textual representation of this showdown player.
	 */
	@Override
	public String toString(){
		String toReturn = player.getName()+" has a "+HandTypeCalculator.calculateHandType(getBestHand())+". His best hand: ";
		for(Card card:bestHand){
			toReturn+=card;
			toReturn+=", ";
		}
		return toReturn.substring(0, toReturn.length()-2)+".";
	}
	
	/**
	 * After sorting, the first player is the
	 * player with the best hand.
	 * 
	 * -1 = first hand is best, 1 = second hand is best, 0 = tie
	 */
	public int compareTo(ShowdownPlayer o) {
		return HandEvaluator.compareHands(o.getBestHand(),getBestHand());
	}
	/**
	 * 2 showdown players are equal if both their hands
	 * have the same value.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ShowdownPlayer other = (ShowdownPlayer) obj;
		if (bestHand == null)
			return other.bestHand == null;
		else
			return HandEvaluator.compareHands(getBestHand(), other.getBestHand())==0;
	}

}