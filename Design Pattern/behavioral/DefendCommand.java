package behavioral;

import creational.Hero;
import structural.Enemy;

public class DefendCommand implements Command 
{
    @Override
    public void execute(Hero hero, Enemy enemy) 
    {
        System.out.println(hero.getName() + " defends and reduces damage!");
    }
}
