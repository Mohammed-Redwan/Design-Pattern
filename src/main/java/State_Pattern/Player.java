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
public class Player {

    private AbstractState state;

    public Player() {
        this.state = new Idle(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void walk() {
        state.walk();
    }

    public void jump() {
        state.jump();
    }

    public void enterWater() {
        state.enterWater();
    }

    public void exitWater() {
        state.exitWater();
    }
    public void swim()
    {
        state.swim();
    }
    public void stop()
    {
        state.stop();
    }
}
