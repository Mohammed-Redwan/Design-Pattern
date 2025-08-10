/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder_Pattern;

/**
 *
 * @author abdullah
 */
public class Program {
    public static void main(String[] args)
    {
        Enemy.Builder enemyBuilder = new Enemy.Builder();
        enemyBuilder.setName("BetterFly");
        enemyBuilder.setType("Walker");
        enemyBuilder.setDamage(10);
        enemyBuilder.setLevel(3);
        enemyBuilder.setHealth(1000);
        
        Enemy spider = enemyBuilder.BuildEnemy();
        System.out.println(spider.getName() + spider.getHealth());
    }
}
