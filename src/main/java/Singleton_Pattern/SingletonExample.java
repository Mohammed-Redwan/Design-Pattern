/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton_Pattern;

/**
 *
 * @author abdullah
 */
public class SingletonExample {

    private static SingletonExample instance;
    
    
    private SingletonExample() {
        
    }
    public void testPattern()
    {
        System.out.println("Singleton Example");
    }
    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }

        return instance;
    }
}
