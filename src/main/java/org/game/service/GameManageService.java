package org.game.service;

import org.game.dto.GameData;
import org.game.entity.Card;
import org.game.entity.Gamer;
import org.game.entity.Hand;

import java.util.List;

public interface GameManageService {

    /**
     * 创建游戏
     * @param dealerId 庄家id
     */
    void createGame(String dealerId);

    /**玩家调用的方法
     * 加入游戏
     * @param userId 玩家id
     * @return 加入游戏是否成功
     */
     GameData joinGame(String userId);

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
    List<Gamer> endRound();

    void endGame();

}
