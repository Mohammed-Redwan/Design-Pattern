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
public class Enemy {

    private String name;
    private String type;
    private int level;
    private float damage;
    private float health;

    public Enemy(String name, String type, int level, float damage, float health) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.damage = damage;
        this.health = health;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the damage
     */
    public float getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(float damage) {
        this.damage = damage;
    }

    /**
     * @return the health
     */
    public float getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(float health) {
        this.health = health;
    }

    public static class Builder {

        private String name;
        private String type;
        private int level;
        private float damage;
        private float health;

        public Enemy BuildEnemy() {
            if (name == null || type == null || level <= 0 || damage <= 0| health <= 0)
                throw new IllegalArgumentException("The enemy attribute is invalid");
            return new Enemy(name, type, level, damage, health);
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @param type the type to set
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * @param level the level to set
         */
        public void setLevel(int level) {
            this.level = level;
        }

        /**
         * @param damage the damage to set
         */
        public void setDamage(float damage) {
            this.damage = damage;
        }

        /**
         * @param health the health to set
         */
        public void setHealth(float health) {
            this.health = health;
        }
    }
}
