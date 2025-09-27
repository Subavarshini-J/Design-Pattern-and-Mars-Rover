package rover;

public interface Direction
{
    Direction turnLeft();
    Direction turnRight();
    Position moveForward(Position position);
    String getName();
}