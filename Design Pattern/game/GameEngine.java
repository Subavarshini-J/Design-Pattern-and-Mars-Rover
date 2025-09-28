package game;

import creational.Hero;
import creational.HeroFactory;
import structural.BasicEnemy;
import structural.Enemy;
import structural.StrongEnemy;
import structural.ShieldedEnemy;
import behavioral.*;
import java.util.Scanner;

public class GameEngine 
{
    public void start() 
    {
        Hero hero = HeroFactory.createHero();
        hero.addObserver(new HealthObserver(hero.getName()));

        // enemy with decorator patterns
        Enemy enemy = new StrongEnemy(new ShieldedEnemy(new BasicEnemy()));
        int enemyHealth = 80;

        CommandInvoker invoker = new CommandInvoker();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBattle begins!");

        while (hero.getHealth() > 0 && enemyHealth > 0) 
        {
            System.out.println("\nYour Health: " + hero.getHealth() + " | Enemy Health: " + enemyHealth);
            System.out.println("Choose Action: 1. Attack  2. Defend");
            int choice = sc.nextInt();

            if (choice == 1) 
            {
                invoker.setCommand(new AttackCommand());
                invoker.execute(hero, enemy);
                enemy.attack();
                enemyHealth -= hero.getWeapon().getDamage();
                System.out.println("Enemy health now: " + enemyHealth);
            } 
            else 
            {
                invoker.setCommand(new DefendCommand());
                invoker.execute(hero, enemy);
                hero.reduceHealth(enemy.getDamage() / 2);
            }

            // enemy counterattack if still alive
            if (enemyHealth > 0) 
            {
                System.out.println("Enemy counterattacks!");
                hero.reduceHealth(enemy.getDamage());
            }
        }

        if (hero.getHealth() <= 0) 
        {
            System.out.println("\n" + hero.getName() + " has fallen. GAME OVER!");
        } 
        else if (enemyHealth <= 0) 
        {
            System.out.println("\n" + hero.getName() + " defeated the enemy. YOU WIN!");
        }
    }
}
