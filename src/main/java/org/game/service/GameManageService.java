package org.game.service;

import org.game.entity.Card;
import org.game.entity.Hand;

public interface GameManageService {

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

    /**
     * 庄家调用
     * 开始游戏
     */
    void startGame();

    /**
     * 庄玩家调用
     * 要牌：按照顺序从第一个player到最终dealer
     * @param playerId
     * @return
     */
    Card getCard(String playerId);

    /**
     * 庄玩家调用
     * 不要牌
     * @param playerId
     */
    void rejectCard(String playerId);

    /**
     *
     * 结束一轮游戏并返回没人手里的牌
     *
     */
    Hand[] endRound();

    void endGame();

}
