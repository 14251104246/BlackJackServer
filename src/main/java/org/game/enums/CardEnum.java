package org.game.enums;

/**
 * Created by yp on 2017/5/8.
 */
public enum CardEnum {
    DIAMOND(1,"方块"),
    CLUB(2,"梅花"),
    HEART(3, "红心"),
    SPADE(4, "黑桃");
    int num;
    String sysmbol;

    CardEnum(int num, String sysmbol) {
        this.num = num;
        this.sysmbol = sysmbol;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSysmbol() {
        return sysmbol;
    }

    public void setSysmbol(String sysmbol) {
        this.sysmbol = sysmbol;
    }
}
