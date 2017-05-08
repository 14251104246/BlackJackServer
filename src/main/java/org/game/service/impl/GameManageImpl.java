package org.game.service.impl;

import io.netty.channel.ChannelHandler;
import io.netty.channel.group.ChannelGroup;

import org.game.entity.Card;
import org.game.entity.Dealer;
import org.game.entity.Hand;
import org.game.entity.Player;
import org.game.entity.Round;
import org.game.entity.User;
import org.game.service.GameManageService;

public class GameManageImpl implements GameManageService {
	
	private Round round;
	
	private ChannelHandler channelHandler;

	public void createGame(String dealerId) {
		
		round = new Round(new Dealer(new User(dealerId)));
	}

	public void joinGame(String userId) {
		round.getPlayers().add(new Player(new User(userId)));
	}

	public void startGame() {
		
	}

	public Card getCard(String playerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void rejectCard(String playerId) {
		// TODO Auto-generated method stub

	}

	public Hand[] endRound() {
		// TODO Auto-generated method stub
		return null;
	}

	public void endGame() {
		// TODO Auto-generated method stub

	}

}
