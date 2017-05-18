package org.game.service;

import org.game.entity.Card;
import org.game.entity.Hand;

import java.util.List;

/**
 * Created by yp on 2017/5/5.
 */
public interface GameService {

    /**
     * 创建游戏
     * @param dealerId 庄家id
     */
    void createGame(String dealerId);

    /**玩家调用的方法
     * 加入游戏
     * @param userId 玩家id
     */
    void joinGame(String userId);

    /**轮询
     * 庄家玩家同时都调用
     * 开始游戏
     */
    void startGame();

    /**轮询
     * 要牌
     * @param playerId
     * @return
     */
    Card getCard(String playerId);

    /**
     * 不要牌
     * @param playerId
     */
    void rejectCard(String playerId);

    /**
     * 轮询
     * 不要牌的庄玩家调用
     * 获得结果
     */
    List<Hand> getResult();

    void endGame();

}
