/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdullah
 */
public class Program {

    public static void main(String[] args) {

        List<Enemy> enemies = new ArrayList<Enemy>();

        Enemy e1 = new Enemy(100, 30);
        Enemy e2 = new Enemy(100, 25);

        enemies.add(e1);
        enemies.add(e2);

        e1.changeEnemyState(Enemy.State.attack);
        e1.changeEnemyState(Enemy.State.defence);

        for (Enemy enemy : enemies) {
            enemy.doAction();
        }

    }
}
