/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependancy_Injection.Example2;

import com.google.inject.AbstractModule;
//import com.google.inject.Binder;
//import com.google.inject.Inject;
//import com.google.inject.Module;
//import com.google.inject.Provides;
//import javax.inject.Provider;

/**
 *
 * @author abdullah
 */
public class CarModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Cylinder.class).toProvider(CylinderProvider.class);
        bind(Tire.class).toProvider(TireProvider.class);
    }




}
