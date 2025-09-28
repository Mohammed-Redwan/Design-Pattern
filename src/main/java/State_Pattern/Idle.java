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
public class Idle extends AbstractState {

    public Idle(Player player) {
        super(player);
    }

    @Override
    public void stop() {
        System.out.println("Already Idle");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
        player.setState(new Walk(player));
    }

    @Override
    public void enterWater() {
        System.out.println("Entering Water.. idle in water");
        player.setState(new WaterIdle(player));
    }
    @Override
    public void jump()
    {
        System.out.println("jumping... return to idle");
    }
}
