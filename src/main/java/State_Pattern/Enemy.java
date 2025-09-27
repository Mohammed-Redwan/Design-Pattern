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
public class Enemy {

    private float health;
    private float damage;
    private EnemyState action;

    public Enemy(float health, float damage) {
        this.health = health;
        this.damage = damage;

        action = new WaitState();

    }

    public void changeEnemyState(State state) {
        if (state == State.attack) {
            action = new AttackState();
        } else if (state == State.wait) {
            action = new WaitState();
        } else if (state == State.defence) {
            action = new DefenceState();
        } else if (state == State.chase) {
            action = new ChaseState();
        }
    }

    public void doAction() {
        action.doAction();
    }

    public enum State {
        wait,
        attack,
        chase,
        defence,
    }
}
