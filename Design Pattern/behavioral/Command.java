package behavioral;

import creational.Hero;
import structural.Enemy;

public interface Command 
{
    void execute(Hero hero, Enemy enemy);
}

