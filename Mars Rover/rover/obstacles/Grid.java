package rover.obstacles;

import rover.Position;
import java.util.*;

public class Grid implements GridComponent
{
    private final int width;
    private final int height;
    private final List<GridComponent> components = new ArrayList<>();

    public Grid(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void add(GridComponent comp)
    {
        components.add(comp);
    }

    public boolean isBlocked(Position pos)
    {
        // check boundaries
        
        if(pos.getX() < 0 || pos.getY() < 0 || pos.getX() >= width || pos.getY() >= height)
        {
            return true;
        }

        for(GridComponent comp : components)
        {
            if(comp.isBlocked(pos))
                return true;
        }
        //could also check obstacle list here
        return false;
    }

     
}