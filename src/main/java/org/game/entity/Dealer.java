package org.game.entity;

public class Dealer implements Gamer{

	private User user;

	private Hand hand;

	public Dealer(User user, Hand hand) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return user.getUserId();
	}

}
