/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Pattern;

/**
 *
 * @author abdullah
 */
public class FireAttack implements AttackAction{
    @Override
    public void attack() {
        System.out.println("Fire Attack");
    }
}
