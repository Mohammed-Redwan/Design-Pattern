/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Bus_Pattern;

import Data_Bus_Pattern.DataBus.Subscriber;

/**
 *
 * @author abdullah
 */
public class Subscriber1 extends DataBus.Subscriber {

    @Override
    public void resieveMassage(DataBus.Massage massage) {
        System.out.println("Subscriber1 resieved data " + massage.getMassage() + " From " + massage.getSender().getClass().getName());

    }

//    @Override
//    public void resieveMassage(DataBus.Massage massage) {
//        System.out.println("Subscriber 1 Resieved massage " + massage.getMassage() + "From " + massage.getClass().getName());
//    }
//
//    @Override
//    public <T> void sendMassage(T massage) {
//        DataBus.Massage msg = new DataBus.Massage<>(this, massage);
//        DataBus.getInstance().sendData(msg);
//    }
}
