package behavioral;

import creational.Hero;
import structural.Enemy;

public class AttackCommand implements Command 
{
    @Override
    public void execute(Hero hero, Enemy enemy) 
    {
        System.out.println(hero.getName() + " attacks with " + hero.getWeapon().getName());
    }
}
