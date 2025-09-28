# :rocket: Mars Rover Simulation

## I. Overview
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
    - Main.java   
- rover/
    - Rover.java        
    - Direction.java    
    - Position.java
- commands/
    - Command.java      
    - MoveCommand.java  
    - LeftCommand.java   
    - RightCommand.java  
- obstacles/
    - GridComponent.java   
    - Cell.java          
    - Obstacle.java        
    - Grid.java            

## VI. Compilation and Execution
- cd marsrover
- javac rover/obstacles/*.java
- javac rover/commands/*.java
- javac rover/*.java
- javac Main.java
- java Main

## VII. Example Run

- Sample testcase 1: <br>
Enter grid width: 10 <br>
Enter grid height: 10 <br>
Enter number of obstacles: 2 <br>
Enter obstacle position (x,y): 2 2 <br>
Enter obstacle position (x,y): 3 5 <br>
Enter starting position (x y): 0 0 <br>
Enter starting direction (N/S/E/W): N <br>
Enter commands (M=move, L=Left, R=Right): MMLMRM <br>
Obstacle or boundary detected! Staying at (0, 2) <br>
Status Report: Rover is at (0, 3) facing North <br>

- Sample testcase 2: <br>
Enter grid width: 10 <br>
Enter grid height: 10 <br>
Enter number of obstacles: 3 <br>
Enter obstacle position (x,y): 1 1 <br>
Enter obstacle position (x,y): 2 9 <br>
Enter obstacle position (x,y): 7 5 <br>
Enter starting position (x y): 0 0 <br>
Enter starting direction (N/S/E/W): E <br>
Enter commands (M=move, L=Left, R=Right): MLRM <br>
Status Report: Rover is at (2, 0) facing East <br>

## Contact
For any queries or further information, please reach out to subavarshini454@gmail.com

