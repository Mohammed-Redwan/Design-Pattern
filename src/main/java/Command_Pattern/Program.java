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
public class Program {
    public static void main(String[] args) {
        PlayerActions playerAction = new PlayerActions();
        ActionsManager actionManager = new ActionsManager();
        
        Enemy e1 = new Enemy("e1");
        Enemy e2 = new Enemy("e2");
        Enemy e3 = new Enemy("e3");
        
        Attack firstAttack = new Attack(playerAction, e1);
        Attack secondAttack = new Attack(playerAction, e3);
        Move move = new Move(playerAction, Directions.right);
        Move move2 = new Move(playerAction, Directions.down);
        TakeDamage firstHit = new TakeDamage(playerAction, e2);
        TakeDamage secondHit = new TakeDamage(playerAction, e1);
        
        actionManager.addAction(firstAttack);
        actionManager.addAction(secondAttack);
        actionManager.addAction(move);
        actionManager.addAction(move2);
        actionManager.addAction(firstHit);
        actionManager.addAction(secondHit);
        
        actionManager.excuteAll();
                
    }
}