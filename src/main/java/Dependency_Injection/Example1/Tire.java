/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependency_Injection.Example1;

import com.google.inject.Inject;

/**
 *
 * @author abdullah
 */
public class Tire {

    @Inject
    public Tire() {

    }

    @Override
    public String toString() {
        return "Normal Tire";//To change body of generated methods, choose Tools | Templates.
    }

}
