/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Pattern;

/**
 *
 * @author abdullah
 */
public class PlayerActions {
    public void move(Directions direction)
    {
        System.out.println("player moved to " + direction);
    }
    public void attack(Enemy enemy)
    {
        System.out.println("player attacked " + enemy.name);
    }
    public void takeDamage(Enemy enemy)
    {
        System.out.println("player took damage from " + enemy.name);
    }
}

