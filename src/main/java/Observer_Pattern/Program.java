/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_Pattern;

import java.util.ArrayList;

/**
 *
 * @author abdullah
 */
public class Program {

    public static void main(String[] args) {
        ArrayList<Subsicriber1> o1 = new ArrayList<Subsicriber1>();
        ArrayList<Subsicriber2> o2 = new ArrayList<Subsicriber2>();
        ArrayList<Subsicriber3> o3 = new ArrayList<Subsicriber3>();

        Channel c = new Channel();
        for (int i = 0; i < 20; i++) {
            o1.add(new Subsicriber1());
            o2.add(new Subsicriber2());
            o3.add(new Subsicriber3());

            c.subsicribe(o1.get(i));
            c.subsicribe(o2.get(i));
            c.subsicribe(o3.get(i));

        }
        c.sendNotificatoin("First Notification");
        c.sendNotificatoin("Second Notification");
    }
}
