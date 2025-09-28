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
public class Walk extends AbstractState{
    
    public Walk(Player player) {
        super(player);
    }
    @Override
    public void stop()
    {
        System.out.println("return to Idle");
        player.setState(new Idle(player));
    }
    @Override
    public void enterWater()
    {
        System.out.println("Idle in Water");
        player.setState(new WaterIdle(player));
    }
    @Override
    public void swim()
    {
        System.out.println("Swimming");
        player.setState(new Swim(player));
    }
    @Override
    public void exitWater()
    {
        System.out.println("Exit Water");
        player.setState(new Idle(player));
    }
    @Override
    public void jump()
    {
        System.out.println("Jumping... walking");
    }
}
