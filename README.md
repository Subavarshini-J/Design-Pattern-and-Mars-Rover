# Mars Rover Simulation

## I. Problem Statement: 
This project simulates a Mars Rover navigating a grid-based terrain. The Rover can move forward, turn left, and turn right, while avoiding both obstacles and grid boundaries.

## II. The implementation emphasizes: 
-Pure Object-Oriented Programming (OOP) in JAVA
-Design Patterns
  -Command Pattern -> Encapsulates rover commands (M,L,R)
  -Composite Pattern -> Represents the grid and obstacles
-SOLID principles and best coding practices.
-No if-else chains for direction handling (polymorphism used instead)

## III. Functional Requirements:
1. Initialize the Rover with:
      i) A starting position (x,y)
     ii) A direction (N,S,E,W)
2. Supported commands:
      i) M -> Move forward one step
     ii) L -> Turn Left (90° counterclockwise)
    iii) R -> Turn Right (90° clockwise)
3. The Rover must:
      i) Stay within grid boundaries
     ii) Avoid obstacles
4. Optional: Rover can send a status report with its current position and direction.

## IV. Project Structure:

marsrover/
 ├── Main.java                     # Entry point for simulation
 ├── rover/
 │    ├── Rover.java               # Core rover logic (move, turn, report)
 │    ├── Direction.java           # Direction interface (N, S, E, W)
 │    ├── Position.java            # X-Y coordinate model
 │    ├── commands/
 │    │      ├── Command.java      # Command interface
 │    │      ├── MoveCommand.java  # Encapsulates 'M'
 │    │      ├── LeftCommand.java  # Encapsulates 'L'
 │    │      └── RightCommand.java # Encapsulates 'R'
 │    └── obstacles/
 │           ├── GridComponent.java# Composite base for grid/obstacles
 │           ├── Cell.java         # Leaf node representing a cell
 │           ├── Obstacle.java     # Represents an obstacle
 │           └── Grid.java         # Grid management & boundary checks

## V. Compilation and Execution
cd marsrover
javac rover/obstacles/*.java
javac rover/commands/*.java
javac rover/*.java
javac Main.java
java Main

## VI. Example Run

*Sample testcase 1:

Enter grid width: 
10
Enter grid height: 
10
Enter number of obstacles: 
2
Enter obstacle position (x,y): 
2 2
Enter obstacle position (x,y): 
3 5
Enter starting position (x y): 
0 0
Enter starting direction (N/S/E/W): 
N

Enter commands (M=move, L=Left, R=Right) or 'exit' to quit:
MMRMM
Obstacle or boundary detected! Staying at (1, 2)
Status Report: Rover is at (1, 2) facing East

*Sample testcase 2:

Enter grid width: 
10
Enter grid height: 
10
Enter number of obstacles: 
2
Enter obstacle position (x,y):
2 5
Enter obstacle position (x,y):
5 5
Enter starting position (x y):
0 0
Enter starting direction (N/S/E/W):
E

Enter commands (M=move, L=Left, R=Right) or 'exit' to quit:
MMLMMRMM
Status Report: Rover is at (4, 2) facing East

## Author
Subavarshini J
  

