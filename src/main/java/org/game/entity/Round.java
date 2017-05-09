package org.game.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 一盘游戏
 */
public class Round {
	
	private String roundId;
	
	private Dealer dealer;
	
	//private List<Player> players = new ArrayList<Player>();

	private List<Gamer> gamers = new ArrayList<Gamer>();

	/**
	 * 这局游戏的状态：等待，进行，结束
	 */
	private int state;

	private Deck deck;

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

	/*public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}*/

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public List<Gamer> getGamers() {
		return gamers;
	}

	public void setGamers(List<Gamer> gamers) {
		this.gamers = gamers;
	}

	public Round(String roundId, Dealer dealer) {
		super();
		this.roundId = roundId;
		this.dealer = dealer;
	}

	public Round(Dealer dealer) {
		super();
		this.dealer = dealer;
		gamers.add(dealer);
	}

	public  Gamer getGamer(String id){
		/*if (dealer.getId().equals(id))
			return dealer;
		for(Player player : players){
			if(player.getId().equals(id)){
				return player;
			}
		}*/
		for(Gamer gamer : gamers){
			if(gamer.getId().equals(id)){
				return gamer;
			}
		}
		return null;
	}

	public void addGamer(Gamer gamer){
		gamers.add(gamer);
	}

	public Round() {}
	
}
