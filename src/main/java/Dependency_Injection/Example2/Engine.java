/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependency_Injection.Example2;

import com.google.inject.Inject;

/**
 *
 * @author abdullah
 */
public class Engine {
    private Cylinder cylinder;
    
    @Inject
    public Engine(Cylinder cylinder)
    {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Normal Engine , with cylinder :" + cylinder; //To change body of generated methods, choose Tools | Templates.
    }
    
}
