/**
 * 
 */
package org.game.controller;

import org.game.controller.Interface.DataListener;
import org.game.controller.Interface.Subject;
import org.game.dto.GameData;

/**
 * @author ZeHua
 *
 */
public class TestCallBack implements DataListener{
	
	/**
	 * 
	 */
	public TestCallBack() {
		ReceiveDataController.getReceiveDataContoller().addListener(this);
	}

	/* (non-Javadoc)
	 * @see org.game.controller.Interface.DataListener#whenReceiveData(org.game.controller.Interface.Subject, java.lang.Object)
	 */
	@Override
	public void whenReceiveData(SendDataController sendContoller, Object data) {
		System.out.println("hallo,i am callback.");
		System.out.println("hi,i am "+data.toString());
		
		
		sendContoller.sendData((GameData)data);
		sendContoller.sendData(new GameData("sendmsg","send"));
		
	}

	/* (non-Javadoc)
	 * @see org.game.controller.Interface.DataListener#getDataType()
	 */
	@Override
	public String getDataType() {
		// TODO Auto-generated method stub
		return "msg";
	}

	/* (non-Javadoc)
	 * @see org.game.controller.Interface.DataListener#setDataType(java.lang.String)
	 */
	@Override
	public void setDataType(String type) {
		// TODO Auto-generated method stub
		
	}

}
