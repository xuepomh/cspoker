package org.cspoker.ai.opponentmodels;

import java.util.concurrent.ConcurrentHashMap;

import org.cspoker.client.common.gamestate.GameState;

public class OpponentModelPool {
	
	private ConcurrentHashMap<Object, OpponentModel> pool = new ConcurrentHashMap<Object, OpponentModel>();
	
	private static OpponentModelPool instance;
	
	public static OpponentModelPool getInstance() {
		if (instance == null)
			instance = new OpponentModelPool();
		return instance;
	}
	
	public int size() {
		return pool.size();
	}
	
	public void addModel(Object player, OpponentModel model) {
		System.out.println("Adding model for player " + player + ":");
//		System.out.println(model);
		pool.put(player, model);
		System.out.println(pool.size() + " model(s) in pool!");
	}
	
	public OpponentModel getModel(Object player) {
		if (!pool.containsKey(player))
			return null;
		else {
			return pool.get(player);
		}
	}
	
	public Object getPlayer(OpponentModel model) {
	    for(Object o:pool.keySet()){
	        if(pool.get(o).equals(model)) {
	            return o;
	        }
	    }
	    return null;
	}
	
	public void assumePermanently(GameState gameState) {
		for (Object key : pool.keySet()) {
			pool.get(key).assumePermanently(gameState);
		}
	}

	public void assumeTemporarily(GameState gameState) {
		for (Object key : pool.keySet()) {
			pool.get(key).assumeTemporarily(gameState);
		}
	}

	public void forgetLastAssumption() {
		for (Object key : pool.keySet()) {
			pool.get(key).forgetLastAssumption();
		}
	}
}
