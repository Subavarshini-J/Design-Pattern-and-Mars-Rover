// src/structural/Enemy.java
package structural;

import behavioral.Character;

public class Enemy extends Character {
    public Enemy() {
        this.name = "Generic Enemy";
        this.health = 50;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks!");
        target.receiveDamage(10); // Fixed damage amount
    }

    @Override
    public String getName() {
        return name; // Return name of the enemy
    }
}
