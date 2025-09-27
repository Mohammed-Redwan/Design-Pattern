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
public class Attack implements Action {

    private PlayerActions playerActions;
    private Enemy enemy;

    public Attack(PlayerActions playerAction, Enemy enemy) {
        this.playerActions = playerAction;
        this.enemy = enemy;
    }

    @Override
    public void excute() {
        playerActions.attack(enemy);
    }
}
