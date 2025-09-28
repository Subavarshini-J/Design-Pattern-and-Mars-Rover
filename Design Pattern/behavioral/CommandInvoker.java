package behavioral;

import creational.Hero;
import structural.Enemy;

public class CommandInvoker 
{
    private Command command;

    public void setCommand(Command command) 
    {
        this.command = command;
    }

    public void execute(Hero hero, Enemy enemy) 
    {
        command.execute(hero, enemy);
    }
}
