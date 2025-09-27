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
public class ChaseState implements EnemyState{

    @Override
    public void doAction() {
        System.out.println("Chasing the Player");
    }
    
}
