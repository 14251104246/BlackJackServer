package org.game.entity;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	private List<Card> cards = new ArrayList<Card>(){
		@Override
		public boolean add(Card card) {
			//TODO sum
			return super.add(card);
		}
	};
	
	private int sum;

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
