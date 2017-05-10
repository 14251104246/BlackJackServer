package org.game.controller.Interface;

import java.util.Observable;
import java.util.Vector;

import org.game.controller.SendDataController;

/**
 * @author ZeHua
 *
 */
public class Subject {
    private boolean changed = false;
    protected Vector obs;


    public Subject() {
        obs = new Vector();
    }


    public synchronized void addListener(DataListener o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
            
        }
    }


    public synchronized void deleteListener(DataListener o) {
        obs.removeElement(o);
    }




    public void distributeData(Object data, SendDataController sendDataController) {

        Object[] arrLocal;

        synchronized (this) {

            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((DataListener)arrLocal[i]).whenReceiveData(sendDataController, data);
    }



    protected synchronized void setChanged() {
        changed = true;
    }


    protected synchronized void clearChanged() {
        changed = false;
    }


    public synchronized boolean hasChanged() {
        return changed;
    }


    public synchronized int countListeners() {
        return obs.size();
    }



}