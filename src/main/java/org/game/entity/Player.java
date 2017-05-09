package org.game.entity;

public class Player implements Gamer{
	
	private User user;

	private Hand hand;

	private double betMoney;

	public Player(User user, Hand hand) {
		super();
		this.user = user;
		this.hand = hand;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public String getId() {
		return user.getUserId();
	}

}
