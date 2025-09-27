package rover;

public class West implements Direction
{
    @Override
    public Direction turnLeft()
    {
        return new South();
    }

    @Override
    public Direction turnRight()
    {
        return new North();
    }

    @Override
    public Position moveForward(Position pos)
    {
        return pos.move(-1,0);
    }
    
    @Override
    public String getName()
    {
        return "West";
    }
}