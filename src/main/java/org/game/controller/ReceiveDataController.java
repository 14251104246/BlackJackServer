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
public class ReceiveDataController extends Subject{
	private static ReceiveDataController controller = new ReceiveDataController();
    
    /*
     * 根据Observer的datatype分发数据，
     * Observer的datatype为空则表示它接收所有数据
     * data的datatype为空则表示所有观察者都接收这个数据
     * @see org.game.controller.Interface.Subject#notifyObservers(java.lang.Object)
     */
	@Override
    public void distributeData(Object data, SendDataController sendDataController) {

        Object[] arrLocal;
        arrLocal = obs.toArray();


        for (int i = arrLocal.length-1; i>=0; i--){
        	/*String rDatatype = ((GameData)data).getType();
        	DataListener Listener = (DataListener)arrLocal[i];
        	if(rDatatype.equals(Listener.getDataType())||Listener.getDataType()==null||rDatatype==null)
        		Listener.whenReceiveData(sendDataController, data);*/
        }
            
    }	
    
    public static ReceiveDataController getReceiveDataContoller(){
    	
//    	synchronized (controller) {
//			if(controller==null){
//				controller=new ReceiveDataContoller();
//			}
//		}
		return controller;
    	
    }
    
    
}
