package org.game.service.impl;

import org.game.service.GameManageService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yp on 2017/5/9.
 */
public class GameManageServiceImplTest {

    GameManageService gameManageService = new GameManageServiceImpl();

    @Test
    public void createGame() throws Exception {
        gameManageService.createGame("dealer1");
    }

    @Test
    public void joinGame() throws Exception {
        createGame();
        gameManageService.joinGame("player1");
        gameManageService.joinGame("player2");
    }

    @Test
    public void startGame() throws Exception {
        joinGame();
        gameManageService.startGame();
    }

    @Test
    public void getCard() throws Exception {
        startGame();
        System.out.println("getCard:"+gameManageService.getCard("player1"));
    }

    @Test
    public void rejectCard() throws Exception {
    }

    @Test
    public void endRound() throws Exception {
    }

    @Test
    public void endGame() throws Exception {
    }

}