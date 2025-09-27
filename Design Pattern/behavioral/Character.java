// src/behavioral/Character.java
package behavioral;

public abstract class Character {
    public int health;
    protected String name;

    public abstract void attack(Character target);
    
    public void receiveDamage(int damage) {
        health -= damage;
        System.out.println(name + " received " + damage + " damage. Health: " + health);
    }
    
    public abstract String getName();
}