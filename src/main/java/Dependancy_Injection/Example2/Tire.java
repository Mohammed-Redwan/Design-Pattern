/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependancy_Injection.Example2;

import com.google.inject.Inject;

/**
 *
 * @author abdullah
 */
public abstract class Tire {
    protected int size;
    
    @Inject
    public Tire(int size)
    {
        this.size = size;
    }

    
    @Override
    public abstract String toString();
    
    
            
}
