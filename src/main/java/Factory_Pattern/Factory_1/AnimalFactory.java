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
public class AnimalFactory {

    public static Animal creatAnimal(String name) {
        Animal animal;
        switch (name) {
            case "Dog":
                animal = new Dog();
                break;
            case "Cat":
                animal = new Cat();
                break;
            case "Cow":
                animal = new Cow();
                break;
            default:
                throw new UnsupportedOperationException("undefined animal");        
        }
        return animal;
    }
}
