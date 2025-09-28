package rover;

import rover.obstacles.Grid;

public class Rover {

    private Position position;
    private Direction direction;
    private final Grid grid;

    public Rover(Position position, Direction direction, Grid grid) 
    {
        if (position == null || direction == null || grid == null) 
        {
            throw new IllegalArgumentException("Position , Direction , and Grid cannot be null");
        }
        this.position = position;
        this.direction = direction;
        this.grid = grid;

    }

    public void move() {
        Position next = direction.moveForward(position);
        if (!grid.isBlocked(next)) 
        {
            this.position = next;

        } 
        else 
        {

            System.out.println("Obstacle or boundary detected! Staying at " + position);
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();

    }

    public void turnRight() {
        direction = direction.turnRight();

    }

    public String report() {

        return "Rover is at " + position.toString() + " facing " + direction.getName();
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

}
