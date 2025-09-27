package rover.commands;

import rover.Rover;

public class RightCommand implements Command
{
    @Override
    public void execute(Rover rover)
    {
        rover.turnRight();
    }
}