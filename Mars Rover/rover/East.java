package rover;

public class East implements Direction
{
    @Override
    public Direction turnLeft()
    {
        return new North();
    }

    @Override
    public Direction turnRight()
    {
        return new South();
    }

    @Override
    public Position moveForward(Position pos)
    {
        return pos.move(1,0);
    }

    @Override
    public String getName()
    {
        return "East";
    }
}