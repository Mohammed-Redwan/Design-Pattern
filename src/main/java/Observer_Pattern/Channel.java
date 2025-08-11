/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdullah
 */
public class Channel {
    private ArrayList<Observer> observers = new ArrayList<>();
    
    public void subsicribe(Observer observer)
    {
        if (!this.observers.contains(observer))
            observers.add(observer);
    }
    public void unsubsicribe(Observer observer)
    {
        if (this.observers.contains(observer))
            this.observers.remove(observer);
    }
    
    public void sendNotificatoin(String msg)
    {
        System.out.println("Channel sent notification");
        for (Observer observer: observers)
            observer.getNotity(msg);
    }
}
