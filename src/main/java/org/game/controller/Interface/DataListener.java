package org.game.controller.Interface;

import org.game.controller.SendDataController;

/**
 * @author ZeHua
 *
 */
public interface DataListener {
	/**
	 * 收到数据时的回掉函数
	 * @param o
	 * @param arg
	 */
	public void whenReceiveData(SendDataController SendContoller, Object data);
	/**
	 * 声明接收何种类型的gamedata
	 * @return
	 */
    public String getDataType();
	/**
	 * 声明接收何种类型的gamedata
	 * @param type
	 */
    public void setDataType(String type);
}