package org.game.service.impl;


import org.game.dto.GameData;
import org.game.service.GameManageService;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yp on 2017/5/9.
 */
public class GameManageServiceImplTest {

//    GameManageService gameManageService = new GameManageServiceImpl();
//
//    @Test
//    public void createGame() throws Exception {
//        Jedis jedis = new Jedis("192.168.26.145", 6379);
//        jedis.hset("key1", "field1", "value1");
//        System.out.println(jedis.hget("key1", "field1"));
//        //gameManageService.createGame("dealer1");
//    }
//
//    @Test
//    public void joinGame() throws Exception {
//        createGame();
//        gameManageService.joinGame("player1");
//        gameManageService.joinGame("player2");
//    }
//
//    @Test
//    public void startGame() throws Exception {
//        joinGame();
//        gameManageService.startGame();
//    }
//
//    @Test
//    public void getCard() throws Exception {
//        startGame();
//        System.out.println("getCard:"+gameManageService.getCard("player1"));
//    }
//
//    @Test
//    public void rejectCard() throws Exception {
//    }
//
//    @Test
//    public void endRound() throws Exception {
//    }
//
//    @Test
//    public void endGame() throws Exception {
//    }
//
//    @Test
//    public void test(){
//        String url = "192.168.26.145:2181";
//        try {
//            ZooKeeper zooKeeper = new ZooKeeper(url, 2000, null);
//
//            //-1默认是删除所有版本的该路径节点
//            Stat stat = zooKeeper.exists("/root", false);
//            if(stat == null){
//                zooKeeper.create("/root", "root data".getBytes(),
//                        ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//            }
//            else if (stat != null){
//               System.out.println("存在root节点");
//               Stat stat1 = new Stat();
//               byte[] data = zooKeeper.getData("/root", false, stat1);
//               System.out.println(new String(data));
//               zooKeeper.create("/root/service1", "service1 data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//               zooKeeper.create("/root/service2", "service2 data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//            }
//            /*zooKeeper.delete("/root", -1);
//
//            Stat stat2 = zooKeeper.exists("/root", false);
//            if (stat2 == null){
//                System.out.println("不存在root节点");
//            }*/
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testZkClient(){
//        String url = "192.168.26.145:2181";
//        ZkClient zkClient = new ZkClient(url);
//        List<String>root = zkClient.getChildren("/root");
//        //System.out.println(zkClient.readData("/root/service2/Ephemeral"));
//        zkClient.createEphemeral("/root/service2/Ephemeral", new GameData("mehod", "result"));
//        System.out.println(zkClient.readData("/root/service2/Ephemeral"));
//    }

}