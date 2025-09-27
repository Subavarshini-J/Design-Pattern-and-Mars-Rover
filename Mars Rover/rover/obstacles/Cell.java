package rover.obstacles;

import rover.Position;

public class Cell implements GridComponent
{
    private final Position position;
    private final boolean isObstacle;

    public Cell(Position pos, boolean isObstacle)
    {
        this.position = pos;
        this.isObstacle = isObstacle;
    }

    @Override
    public boolean isBlocked(Position pos)
    {
        return isObstacle && position.equals(pos);
    }
}
