package org.game.entity;

public class Card {
	
	private String cardId;
	
	private String symbol;
	
	private int value;
	
	private String filePath;

	public Card(String symbol, int value) {
		this.symbol = symbol;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Card{" +
				"cardId='" + cardId + '\'' +
				", symbol='" + symbol + '\'' +
				", value=" + value +
				", filePath='" + filePath + '\'' +
				'}';
	}
}
