package org.game.entity;

import org.game.enums.CardEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 一副牌的管理者
 */
public class Deck {
	
	private List<Card> cards;
	
	private int totalAmount;
	
	private int restCount;

	public Deck(int totalAmount) {
		this.totalAmount = totalAmount;
		this.restCount = totalAmount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getRestCount() {
		return restCount;
	}

	public void setRestCount(int restCount) {
		this.restCount = restCount;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public Card getCard(int index){
		return cards.remove(index);
	}

}
