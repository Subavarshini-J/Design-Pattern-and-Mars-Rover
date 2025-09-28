package game;

import creational.Hero;
import structural.Enemy;

public class BattleArena 
{
    private Hero hero;
    private Enemy enemy;

    public BattleArena(Hero hero, Enemy enemy) 
    {
        this.hero = hero;
        this.enemy = enemy;
    }
    public Hero getHero() 
    {
         return hero;
    }
    public Enemy getEnemy() 
    { 
        return enemy; 
    }
}
