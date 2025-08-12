/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Bus_Pattern;

/**
 *
 * @author abdullah
 */
public class Subscriber2 extends DataBus.Subscriber {

    @Override
    public void resieveMassage(DataBus.Massage massage) {
        System.out.println("Subscriber2 resieved data " + massage.getMassage() + " From " + massage.getSender().getClass().getName());
    }

}
