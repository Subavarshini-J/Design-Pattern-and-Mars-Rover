package rover;

public class South implements Direction
{
    @Override
    public Direction turnLeft()
    {
        return new East();
    }

    @Override
    public Direction turnRight()
    {
        return new West();
    }

    @Override
    public Position moveForward(Position pos)
    {
        return pos.move(0,-1);
    }
    
    @Override
    public String getName()
    {
        return "south";
    }
}