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
public class Move implements Action{

    private Directions direction;
    private  PlayerActions playerActions;
    public Move(PlayerActions playerActions,Directions direction)
    {
        this.playerActions = playerActions;
        this.direction = direction;
    }
    @Override
    public void excute() {
        playerActions.move(direction);
    }
    
}
