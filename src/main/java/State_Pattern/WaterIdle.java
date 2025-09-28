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
public class WaterIdle extends AbstractState {

    public WaterIdle(Player player) {
        super(player);
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
        player.setState(new Swim(player));
    }

    @Override
    public void stop() {
        System.out.println("Already Idle in Water");
    }

    @Override
    public void exitWater() {
        System.out.println("Exit Water.. return to Idle");
        player.setState(new Idle(player));
    }

    @Override
    public void enterWater() {
        System.out.println("Already in Water");
    }
}
