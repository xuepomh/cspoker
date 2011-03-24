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
package org.cspoker.ai.bots.bot.gametree.rollout;

import java.util.EnumSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.cspoker.client.common.gamestate.GameState;
import org.cspoker.client.common.playerstate.PlayerState;
import org.cspoker.common.elements.cards.Card;
import org.cspoker.common.elements.player.PlayerId;
import org.cspoker.common.util.MutableDouble;

public abstract class AbstractDistributionRollout extends RollOutStrategy {

	private final static Logger logger = Logger.getLogger(AbstractDistributionRollout.class);

	public final int relPotSize;

	AbstractDistributionRollout(GameState gameState,PlayerId botId) {
		super(gameState,botId);
		this.relPotSize = gamePotSize
				/ (allPlayers.size() * gameState.getTableConfiguration()
						.getBigBlind());
	}
	
	public RolloutResult doRollOut(int nbCommunitySamples, int nbOpponentSamples) {
		boolean traceEnabled = logger.isTraceEnabled();

		double totalProb = 0;
		TreeSet<PlayerState> drawers = new TreeSet<PlayerState>(playerComparatorByInvestment);
		TreeMap<Integer, MutableDouble> values = new TreeMap<Integer, MutableDouble>();

		for (int i = 0; i < nbCommunitySamples; i++) {
			int communitySampleRank = fixedRank;
			EnumSet<Card> usedCommunityAndBotCards = EnumSet
					.copyOf(usedFixedCommunityAndBotCards);
			for (int j = 0; j < nbMissingCommunityCards; j++) {
				Card communityCard = drawNewCard(usedCommunityAndBotCards);
				if (traceEnabled) {
					logger.trace("Evaluating sampled community card "
							+ communityCard);
				}
				communitySampleRank = updateIntermediateRank(
						communitySampleRank, communityCard);
			}
			if (traceEnabled) {
				logger.trace("Evaluating bot cards " + botCard1 + " "
						+ botCard2);
			}
			int botRank = getFinalRank(communitySampleRank, botCard1, botCard2);
			for (int j = 0; j < nbOpponentSamples; j++) {
				EnumSet<Card> usedOpponentCards = EnumSet
						.copyOf(usedCommunityAndBotCards);
				double logProb = 0;
				int maxOpponentWin = 0;
				drawers.clear();
				for (PlayerState opponentThatCanWin : activeOpponents) {
					Card opponentCard1 = drawNewCard(usedOpponentCards);
					Card opponentCard2 = drawNewCard(usedOpponentCards);
					int opponentRank = getFinalRank(communitySampleRank,opponentCard1, opponentCard2);
					if (traceEnabled) {
						logger.trace("Evaluating sampled opponent cards "
								+ opponentCard1 + " " + opponentCard2);
					}
					if (opponentRank > botRank) {
						maxOpponentWin = Math.max(maxOpponentWin,
								opponentThatCanWin.getTotalInvestment());
					} else if (opponentRank == botRank) {
						drawers.add(opponentThatCanWin);
					}
					float opponentRankProb = getRelativeNearestProbability(opponentRank, relPotSize);
					logProb += Math.log(opponentRankProb);
				}
				double prob = Math.exp(logProb);
				int won = calcAmountWon(botState, maxOpponentWin, drawers,
						allPlayers);
				MutableDouble value = values.get(won);
				if (value == null) {
					values.put(won, new MutableDouble(prob));
				} else {
					value.add(prob);
				}
				totalProb += prob;
			}
		}
		return new RolloutResult(values, totalProb, (1-gameState.getTableConfiguration().getRake()));
	}
	
	protected float getRelativeNearestProbability(int rank, int relativePotSize){
		float prob = getRelativeProbability(rank, relPotSize);
		if(prob == 0){
			prob = getRelativeNearestProbability(rank-1, relativePotSize);
		}
		if(Float.isInfinite(prob) || Float.isNaN(prob) || prob==0){
			throw new IllegalStateException("Bad opponentRankProb: "+prob);
		}
		return prob;
	}
	
	protected abstract float getRelativeProbability(int rank,
			int relativePotSize);

	@Override
	public String toString() {
		return "Abstract Distribution Rollout";
	}
	
	public static interface Factory{
		
		AbstractDistributionRollout create(GameState gameState, PlayerId botId);
		
	}

}