package org.game.entity;

import java.util.ArrayList;
import java.util.List;


public class Round {
	
	private String roundId;
	
	private Dealer dealer;
	
	private List<Player> players = new ArrayList<Player>();
	
	/**
	 * 这句游戏的状态：等待，进行，结束
	 */
	private int state;

	public String getRoundId() {
		return roundId;
	}

	public void setRoundId(String roundId) {
		this.roundId = roundId;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}


	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Round(String roundId, Dealer dealer) {
		super();
		this.roundId = roundId;
		this.dealer = dealer;
	}

	public Round(Dealer dealer) {
		super();
		this.dealer = dealer;
	}
	
	public Round() {}
	
}
