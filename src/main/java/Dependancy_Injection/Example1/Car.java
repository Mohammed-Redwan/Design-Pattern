/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependancy_Injection.Example1;

import com.google.inject.Inject;

/**
 *
 * @author abdullah
 */
public class Car {

    private Wheel wheel;
    private Engine engine;

    @Inject
    public Car(Wheel wheel, Engine engine) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car : \n Wheel details : \n " + wheel + "\nEngine details \n " + engine;
    }

}
