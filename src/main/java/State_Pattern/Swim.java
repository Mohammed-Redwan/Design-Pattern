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
public class Swim extends AbstractState{
    
    public Swim(Player player) {
        super(player);
    }
    @Override
    public void exitWater()
    {
        System.out.println("Exit Water");
        player.setState(new Idle(player));
    }
    @Override
    public void stop()
    {
        System.out.println("Stop Swimming");
        player.setState(new WaterIdle(player));
    }
}
