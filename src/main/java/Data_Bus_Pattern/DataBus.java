/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Bus_Pattern;

import java.util.ArrayList;

/**
 *
 * @author abdullah
 */
public class DataBus {

    private static DataBus instance;

    private ArrayList<Subscriber> observers;

    public static DataBus getInstance() {
        if (instance == null) {
            instance = new DataBus();
        }
        return instance;
    }

    private DataBus() {
        observers = new ArrayList<>();
    }

    public void subscribe(Subscriber observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unsubscribe(Subscriber observer) {
        observers.remove(observer);
    }

    public void sendData(Massage massage) {
        for (Subscriber observer : observers) {
            if (massage.sender != observer) {
                observer.resieveMassage(massage);
            }
        }
    }

    public static abstract class Subscriber {

        public abstract void resieveMassage(Massage massage);

        public <T> void sendMassage(T massage) {
            DataBus.Massage msg = new DataBus.Massage<>(this, massage);
            DataBus.getInstance().sendData(msg);
        }
    }

    public static class Massage<T> {

        private Subscriber sender;
        private T massage;

        public Massage(Subscriber sender, T massage) {
            this.massage = massage;
            this.sender = sender;
        }

        public Subscriber getSender() {
            return sender;
        }

        public void setSender(Subscriber sender) {
            this.sender = sender;
        }

        public T getMassage() {
            return massage;
        }

        public void setMassage(T massage) {
            this.massage = massage;
        }

    }
}
