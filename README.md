# :rocket: Mars Rover Simulation

## I. Problem Statement
Welcome to the Mars Rover Simulation!<br>
Navigate a Rover across a grid-based terrain while avoiding obstacles and staying within boundaries. This application demonstrates OOP design, employs Command, Composite, and Singleton patterns, and follows SOLID principles for clean, scalable and maintainable code. Users can also generate real-time status reports of the Rover's position and direction.

## II. Features
- Navigation: Move the Rover forward, left or Right.
- Obstacle Detection: Avoid obstacles on the grid.
- Boundary Safety: Prevent the Rover from leaving the grid.
- Status Reporting: Display current position and direction.
- Command Flexibility: Execute sequences of commands easily.
- Scalable Design: Easily extendable using OOP and design patterns.
  
## III. Design Pattern and Principles Used
  - Command Pattern: Encapsulates rover commands (M,L,R) as objects for flexible execution.
  - Composite Pattern: Represents the grid and obstacles uniformly; Grid as composite, Cell and Obstacle as leaves.
  - Singleton Pattern: Ensure a single gird instance is shared across the simulation.
  - OOP Principles: Uses Encapsulation, Inheritance, and Polymorphism for clean, modular design.
  - SOLID Principles: Each class has a single responsibility, can be extended without modification, subclasses replace interfaces seamlessly, interfaces expose only necessary methods, and Rover depends on abstraction, not concretes.

## IV. Key Components
- Grid<br>
Manages the terrain layout, enforces boundaries, and tracks obstacles.
- Rover<br>
Controls movement and rotation, maintaining its current position and facing direction.
- Commands<br>
Encapsulates actions (Move, TurnLeft, TurnRight) as objects using the Command Pattern.
- Obstacles<br>
Models obstacles on the grid and ensures the Rover cannot move through them.

## V. Project Structure

- marsrover/
    - Main.java                         # Entry point for simulation
- rover/
    - Rover.java                        # Core rover logic (move, turn, report)
    - Direction.java                    # Direction interface (N, S, E, W)
    - Position.java                     # X-Y coordinate model
- commands/
    - Command.java                      # Command interface
    - MoveCommand.java                  # Encapsulates 'M'
    - LeftCommand.java                  # Encapsulates 'L'
    - RightCommand.java                 # Encapsulates 'R'
- obstacles/
    - GridComponent.java                # Composite base for grid/obstacles
    - Cell.java                         # Leaf node representing a cell
    - Obstacle.java                     # Represents an obstacle
    - Grid.java                         # Grid management & boundary checks

## VI. Compilation and Execution
- cd marsrover
- javac rover/obstacles/*.java
- javac rover/commands/*.java
- javac rover/*.java
- javac Main.java
- java Main

## VII. Example Run

- Sample testcase 1:

Enter grid width: <br>
10<br>
Enter grid height: <br>
10<br>
Enter number of obstacles: <br>
2<br>
Enter obstacle position (x,y): <br>
2 2<br>
Enter obstacle position (x,y): <br>
3 5<br>
Enter starting position (x y): <br>
0 0<br>
Enter starting direction (N/S/E/W): <br>
N<br>
<br>
Enter commands (M=move, L=Left, R=Right) or 'exit' to quit:<br>
MMRMM<br>
Obstacle or boundary detected! Staying at (1, 2)<br>
Status Report: Rover is at (1, 2) facing East<br>

- Sample testcase 2:

Enter grid width: <br>
10<br>
Enter grid height: <br>
10<br>
Enter number of obstacles: <br>
2<br>
Enter obstacle position (x,y):<br>
2 5<br>
Enter obstacle position (x,y):<br>
5 5<br>
Enter starting position (x y):<br>
0 0<br>
Enter starting direction (N/S/E/W):<br>
E<br>
<br>
Enter commands (M=move, L=Left, R=Right) or 'exit' to quit:<br>
MMLMMRMM<br>
Status Report: Rover is at (4, 2) facing East<br>

## Author
For any queries or further information, please reach out to subavarshini454@gmail.com

