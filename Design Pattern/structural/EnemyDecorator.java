// src/structural/EnemyDecorator.java
package structural;

import behavioral.Character;

public abstract class EnemyDecorator extends Character {
    protected Character decoratedEnemy;

    public EnemyDecorator(Character decoratedEnemy) {
        this.decoratedEnemy = decoratedEnemy;
    }

    @Override
    public void attack(Character target) {
        decoratedEnemy.attack(target);
    }

    @Override
    public void receiveDamage(int damage) {
        decoratedEnemy.receiveDamage(damage);
    }

    @Override
    public String getName() {
        return decoratedEnemy.getName();
    }
}