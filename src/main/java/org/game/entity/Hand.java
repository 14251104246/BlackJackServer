package org.game.entity;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	//加入userid是为了游戏结束时直接返回此hand数据给用户
	private String userId;
	
	private List<Card> cards = new ArrayList<Card>(){
		@Override
		public boolean add(Card card) {
			//TODO sum
			return super.add(card);
		}
	};
	
	private int sum;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public Hand(String userId) {
		this.userId = userId;
	}

	public Hand() {
	}
}
