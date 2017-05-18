package org.game.controller;

import io.netty.channel.ChannelHandlerContext;
import org.game.dto.GameData;
import org.game.enums.Action;
import org.game.service.GameManageService;
import org.game.service.impl.GameManageServiceImpl;

/**
 * Created by yp on 2017/5/7.
 */
public class DataController implements GameController{

    private GameData reponseData;

    private GameData data;

    private GameManageService gameService = new GameManageServiceImpl();

    GameControllerFinish gameControllerFinish;

    ChannelHandlerContext context;

    public DataController(GameControllerFinish gameControllerFinish, ChannelHandlerContext context, Object data){
        this.gameControllerFinish = gameControllerFinish;
        this.context = context;
        if(data instanceof GameData) {
            System.out.println("flag:it is GameData");
            this.data = (GameData) data;
        }
        else{
            System.out.println("flag:it's not GameData");
            this.data = new GameData(Action.FAIL);
        }
    }

    private void parseData() {
        switch (data.getAction()){
            case CREATE: reponseData = new GameData(Action.CREATE, gameService.createGame(data.getUserId()));break;
            case JOIN: reponseData = new GameData(Action.JOIN, gameService.joinGame(data.getUserId()));break;
            case START: gameService.startGame();break;
            case WANTCARD: reponseData = new GameData(Action.WANTCARD, gameService.getCard(data.getUserId()));break;
            case REJECTCARD: reponseData = new GameData(Action.REJECTCARD);gameService.rejectCard(data.getUserId());
            case GETRESULT: reponseData = new GameData(Action.GETRESULT, gameService.getResult());break;
            case END: reponseData = new GameData(Action.END); gameService.endGame();break;
        }
        gameControllerFinish.finish(reponseData, context);
    }

//    public DataController doAction() {
//        switch (data.getType()){
//            case "msg":break;
//            case "0" : gameService.createGame(data.getUserId());break;
//            case "1" : gameService.joinGame(data.getUserId());break;
//            case "2" : gameService.startGame();break;
//            case "3" : reponseData = new GameData("3", gameService.getCard(data.getUserId()));break;
//            case "4" : reponseData = new GameData("4", gameService.getResult());break;
//            case "5" : gameService.endGame();break;
//        }
//        gameControllerFinish.finish(reponseData);
//        return this;
//    }

    public void doGameService(int method){}

    @Override
    public GameData doAction() {
        parseData();
        if(reponseData == null){
            reponseData = new GameData(Action.FAIL);
        }
        return reponseData;
    }

    public interface GameControllerFinish{
        void finish(GameData gameData, ChannelHandlerContext context);
    }

}
