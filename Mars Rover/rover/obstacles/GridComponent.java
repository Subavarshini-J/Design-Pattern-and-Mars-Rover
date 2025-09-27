package rover.obstacles;

import rover.Position;

public interface GridComponent {

    boolean isBlocked(Position pos);
}