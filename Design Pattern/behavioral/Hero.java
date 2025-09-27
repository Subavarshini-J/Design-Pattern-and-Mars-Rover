// src/behavioral/Hero.java
package behavioral;

public class Hero extends Character {
    public Hero() {
        this.name = "Hero";
        this.health = 100; // Initial health for the hero
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks!");
        target.receiveDamage(20); // Fixed damage amount
    }

    @Override
    public String getName() {
        return name; // Return the name of the hero
    }
}