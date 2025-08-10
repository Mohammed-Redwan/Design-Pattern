/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependancy_Injection;

//import Dependancy_Injection.Example1.Car;

import Dependancy_Injection.Example2.Car;
import Dependancy_Injection.Example2.CarModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Stage;

/**
 *
 * @author abdullah
 */
public class Program {

    public static void main(String[] args) {

           // Example1 : semple example of injection no argument constructors no interfaces all constructor has @Inject
        
//        Injector carInjector = Guice.createInjector();
//        Car c1 = carInjector.getInstance(Car.class);
//        System.out.println(c1);
    
        
            // Example2 : more complex example of dependancy injection using module to control injection
            
        CarModule cm = new CarModule();
        Injector carInjector2 = Guice.createInjector(cm);
        
        Car car = carInjector2.getInstance(Car.class);
        System.out.println(car);



    }
}
