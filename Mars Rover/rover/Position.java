package rover;

public class Position
{
    private int x;
    private int y;

    public Position(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public Position move(int dx, int dy)
    {
        return new Position(x + dx, y + dy);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Position))
            return false;
        Position other  = (Position) obj;
        return this.x == other.x && this.y == other.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

