/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Pattern;

import java.util.ArrayList;

/**
 *
 * @author abdullah
 */
public class Program {

    public static void main(String[] args) {
        Enemy e1 = new Enemy(100, 23, new IceAttack());
        Enemy e2 = new Enemy(100, 50, new FireAttack());
        Enemy e3 = new Enemy(100, 40, new WaterAttack());
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(e1);
        enemies.add(e2);
        enemies.add(e3);

        for (Enemy enemy : enemies) {
            enemy.attack();
        }
    }
}
