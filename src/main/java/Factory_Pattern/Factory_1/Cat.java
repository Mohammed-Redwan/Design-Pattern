/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Pattern.Factory_1;

/**
 *
 * @author abdullah
 */
public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Cat Sound");
    }
    
}
