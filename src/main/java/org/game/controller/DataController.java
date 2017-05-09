package org.game.controller;

import org.game.dto.GameData;
import org.game.service.GameService;

/**
 * Created by yp on 2017/5/7.
 */
public class DataController {

    private GameData data;

    private GameService gameService;

    public DataController(Object data){
        if(data instanceof GameData)
            this.data = (GameData) data;
        else{
            data = new GameData(-1, "erro");
        }
    }

    public DataController parseData() {
        return this;
    }

    public DataController doAction() {
        switch (data.getType()){
            case -1:break;
            /*case 0 : gameService.createGame();break;
            case 1 : gameService.joinGame();break;
            case 2 : gameService.startGame();break;
            case 3 : gameService.getCard();break;
            case 4 : gameService.getResult();break;
            case 5 : gameService.endGame();break;*/

        }
        return this;
    }

    public GameData returnData() {
        return null;
    }
}
