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
public class TakeDamage implements Action{
    private PlayerActions playerActions;
    private Enemy enemy;
    
    public TakeDamage(PlayerActions playerAction, Enemy enemy)
    {
        this.enemy = enemy;
        this.playerActions = playerAction;
    }
            
    @Override
    public void excute() {
        playerActions.takeDamage(enemy);
    }
    
}
