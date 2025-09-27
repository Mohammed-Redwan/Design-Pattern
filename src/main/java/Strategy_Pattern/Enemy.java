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
public class Enemy {
    private float health;
    private float damage;
    private AttackAction attackAction;
    public Enemy(float health, float damage, AttackAction attackAction)
    {
        this.health = health;
        this.damage = damage;
        this.attackAction = attackAction;
    }
    
    public void attack()
    {   
        attackAction.attack();
    }   
    public void setAttackAction(AttackAction attackAction)
    {
        this.attackAction = attackAction;
    }
    
}