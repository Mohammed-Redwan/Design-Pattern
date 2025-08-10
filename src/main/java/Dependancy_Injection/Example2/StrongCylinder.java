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
public class StrongCylinder extends Cylinder{

    public StrongCylinder(String serialNo) {
        super(serialNo);
    }

    @Override
    public String toString() {
        return "Strong Cylindern and it's serial_no is " + serialNo;
    }
    
}
