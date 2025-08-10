/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependancy_Injection.Example2;

/**
 *
 * @author abdullah
 */
public class BigTire extends Tire {

    public BigTire(int size) {
        super(size);
    }

    @Override
    public String toString() {
        return "Big Tire With Size " + this.size;
    }

}
