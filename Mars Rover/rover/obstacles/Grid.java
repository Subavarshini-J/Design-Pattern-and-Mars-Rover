package rover.obstacles;

import rover.Position;
import java.util.*;

public class Grid implements GridComponent
{
    private static Grid instance;
    private final int width;
    private final int height;
    private final List<GridComponent> components = new ArrayList<>();

    public Grid(int width, int height)
    {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Grid width and height must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    public static Grid getInstance(int width, int height)
    {
        if(instance == null)
        {
            instance = new Grid(width,height);
        }
        return instance;
    }

    public void add(GridComponent component)
    {
      
        if (component == null) {
            throw new IllegalArgumentException("GridComponent cannot be null.");
        }
        components.add(component);
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

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public List<GridComponent> gComponents()
    {
        return Collections.unmodifiableList(components);
    }
     
}
