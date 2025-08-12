/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_Pattern;

/**
 *
 * @author abdullah
 */
public class Subscriber3 implements Observer{

    @Override
    public void getNotity(String msg) {
        System.out.println("Subsicriber 3 resieved notify " + msg);
    }
    
}
