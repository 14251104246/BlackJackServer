package org.game.service.impl;

import io.netty.channel.ChannelHandler;
import io.netty.channel.group.ChannelGroup;

import org.game.dto.GameData;
import org.game.entity.*;
import org.game.enums.CardEnum;
import org.game.service.GameManageService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManageServiceImpl implements GameManageService {
	
	private Round round;

	public void createGame(String dealerId) {
		round = new Round(new Dealer(new User(dealerId), new Hand()));
	}

	/**
	 * 加入游戏是否成功，失败则返回提示信息
	 * @param userId 玩家id
	 * @return
	 */
	public GameData joinGame(String userId) {
		if(round != null ){
			round.addGamer(new Player(new User(userId), new Hand()));
			return null;
		}
		return null;
	}

	/**
	 * 开始游戏，初始化Deck的卡牌，默认按照顺序排列
	 */
	public void startGame() {
		List<Card> cards = new ArrayList<Card>();
		Card card;
		for(CardEnum cardEnum : CardEnum.values()){
			for(int value=1; value<=13; value++){
				card = new Card(cardEnum.getSysmbol(), value);
				cards.add(card);
			}
		}
		Deck deck = new Deck(cards.size());
		deck.setCards(cards);
		round.setDeck(deck);
	}

	/**
	 * 取牌，deck的默认实现是remove后返回取得的牌
	 * @param playerId
	 * @return
	 */
	public Card getCard(String playerId) {
		Random random = new Random();
		Deck deck = round.getDeck();
		Card card = deck.getCard(random.nextInt(deck.getRestCount()));
		//找到对应的gamer后，把card加到ta的hand中
		round.getGamer(playerId).getHand().getCards().add(card);
		//ToDo 等服务器接收到对方接收到牌的回应，再计算hand的num

		return card;
	}

	public void rejectCard(String playerId) {

	}

	public List<Gamer> endRound() {
		// TODO Auto-generated method stub
		return round.getGamers();
	}

	public void endGame() {
		// TODO Auto-generated method stub
	}

}
