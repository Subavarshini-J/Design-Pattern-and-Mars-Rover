// src/structural/ArmoredEnemy.java
package structural;

import behavioral.Character;

public class ArmoredEnemy extends EnemyDecorator {
    public ArmoredEnemy(Character decoratedEnemy) {
        super(decoratedEnemy);
    }

    @Override
    public void receiveDamage(int damage) {
        int reducedDamage = damage / 2; // Reduce damage by half
        decoratedEnemy.receiveDamage(reducedDamage);
        System.out.println("Armor reduced damage from " + damage + " to " + reducedDamage);
    }

    @Override
    public String getName() {
        return "Armored " + decoratedEnemy.getName();
    }
}