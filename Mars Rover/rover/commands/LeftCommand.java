package rover.commands;

import rover.Rover;

public class LeftCommand implements Command
{
    @Override
    public void execute(Rover rover)
    {
        rover.turnLeft();
    }
     
}