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
public class Main {

    public static void main(String[] args) {

        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        Subscriber3 s3 = new Subscriber3();
        Subscriber4 s4 = new Subscriber4();
        
        DataBus dataBus = DataBus.getInstance();
        dataBus.subscribe(s1);
        dataBus.subscribe(s2);
        dataBus.subscribe(s3);
        dataBus.subscribe(s4);
        
        s1.sendMassage("First Massage From S1");
        System.out.println("\n \n");
        s3.sendMassage(234 + " this data from s3");
       
    }

}
