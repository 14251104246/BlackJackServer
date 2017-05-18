package org.game.enums;

/**
 * Created by yp on 2017/5/18.
 */
public enum Action {

    FAIL(-1, "失败"),
    SUCCESS(0, "成功"),
    CREATE(1, "创建游戏"),
    JOIN(2, "加入游戏"),
    START(3, "开始游戏"),
    WANTCARD(4, "要牌"),
    REJECTCARD(5, "不要牌"),
    GETRESULT(6, "得到游戏结果"),
    END(7, "结束游戏");

    /*CREATE(0),
    JOIN(1),
    START(2),
    WANTCARD(3),
    REJECTCARD(4),
    GETRESULT(5),
    END(6);*/

    int action;

    String value;

    Action(int action) {
        this.action = action;
    }

    Action(int action, String value) {
        this.action = action;
        this.value = value;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
