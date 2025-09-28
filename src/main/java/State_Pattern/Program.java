/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Pattern;

/**
 *
 * @author abdullah
 */
public class Program {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.walk();
        p1.stop();
        p1.jump();
        p1.enterWater();
        p1.jump();
        p1.swim();
        p1.exitWater();
        p1.stop();
        p1.jump();
    }
}
