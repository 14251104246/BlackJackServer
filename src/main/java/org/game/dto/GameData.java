package org.game.dto;

import org.game.enums.Action;

import java.io.Serializable;

public class GameData implements Serializable{

	//private String type;

	private Action action;

	private Object body;

	private String userId;

	public GameData(){}

	public GameData(Action action) {
		this.action = action;
	}

	public GameData(Action action, Object body) {
		this.action = action;
		this.body = body;
	}

	public GameData(Action action, Object body, String userId) {
		this.action = action;
		this.body = body;
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "GameData{" +
				"action=" + action +
				", body=" + body +
				", userId='" + userId + '\'' +
				'}';
	}
}
