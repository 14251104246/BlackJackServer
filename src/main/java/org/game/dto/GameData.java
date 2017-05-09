package org.game.dto;

import java.io.Serializable;

public class GameData{
	
	private String type;
	
	private Object result;
	
	public GameData(){}

	public GameData(String type, Object result) {
		super();
		this.type = type;
		this.result = result;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getResult() {
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
