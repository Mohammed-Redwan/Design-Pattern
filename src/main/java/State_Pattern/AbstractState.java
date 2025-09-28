/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Pattern;

/**
 *
 * @author abdullah
 */
public abstract class AbstractState {
    protected Player player;
    
    public AbstractState(Player player)
    {
        this.player = player;
    }

    public void walk()
    {
        System.out.println("Cant walk");
    }
    public void swim()
    {
        System.out.println("Cant swim");
    }
    public void stop()
    {
        System.out.println("stoped");
    }
    public void jump()
    {
        System.out.println("cant jump");
    }
    public void enterWater()
    {
        System.out.println("No Water to Enter");
    }
    public void exitWater()
    {
        System.out.println("No Land to Exit Water");
    }
}
