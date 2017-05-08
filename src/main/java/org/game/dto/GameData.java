package org.game.dto;

import java.io.Serializable;

public class GameData{
	
	private int type;
	
	private String result;
	
	public GameData(){}

	public GameData(int type, String result) {
		super();
		this.type = type;
		this.result = result;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "GameData{" +
				"type=" + type +
				", result='" + result + '\'' +
				'}';
	}

}
