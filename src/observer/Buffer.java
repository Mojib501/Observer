/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author masi
 * diese klasse ist der Subject in der Observer Konstelation
 */
public class Buffer {
    private int state;
    private List<Observer> observerList= new ArrayList<Observer>();
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public int getState(){
        return state;
    }
    public void printObserverName(){
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        for(Observer observer : observerList){
           //jeden observer mit Messadten füttern
           //es muss berücksichtigt werden dass nur gesedet wird wenn
           //Nachfrage besteht 
            observer.update();
        }
    }
}
