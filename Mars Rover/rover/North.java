package rover;

public class North implements Direction
{
    @Override
    public Direction turnLeft()
    {
        return new West();
    }
    
    @Override
    public Direction turnRight()
    {
        return new East();
    }

    @Override
    public Position moveForward(Position pos)
    {
        return pos.move(0,1);
    }

    @Override
    public String getName()
    {
        return "North";
    }

   
}