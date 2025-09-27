import rover.*;
import rover.commands.*;
import rover.obstacles.*;

import java.util.*;

public class Main {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Grid Size

        System.out.println("Enter grid width: ");
        int width = sc.nextInt();
        System.out.println("Enter grid height: ");
        int height = sc.nextInt();
        Grid grid = new Grid(width, height);

        // Obstacles

        System.out.println("Enter number of obstacles: ");
        int numObstacles = sc.nextInt();
        for(int i=0;i< numObstacles; i++)
        {
            System.out.println("Enter obstacle position (x,y): ");
            int ox = sc.nextInt();
            int oy = sc.nextInt();
            grid.add(new Obstacle(new Position(ox, oy)));
        }

        // Starting position & direction
        System.out.println("Enter starting position (x y): ");
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        System.out.println("Enter starting direction (N/S/E/W): ");
        String dir = sc.next().toUpperCase();

        Direction direction;

        switch (dir) {
            case "N":
                direction = new North();
                break;
            case "S":
                direction = new South();
                break;
            case "E":
                direction = new East();
                break;
            case "W":
                direction = new West();
                break;
            default:
                throw new IllegalArgumentException("Invalid Direction!");
        }

        Rover rover = new Rover(new Position(startX, startY),direction,grid);
        
        // Command Mapping

        Map<Character, Command> commandMap = new HashMap<>();
        commandMap.put('M',new MoveCommand());
        commandMap.put('L',new LeftCommand());
        commandMap.put('R',new RightCommand());

        System.out.println("\nEnter commands (M=move, L=Left, R=Right) or 'exit' to quit: ");
        String commandStr = sc.next().toUpperCase();

        for(char c:commandStr.toCharArray())
        {
            Command cmd = commandMap.get(c);
            if(cmd!=null)
            {
                cmd.execute(rover);
            }
            else
            {
                System.out.println("Invalid command: "+c);
            }
        }

        // Final report after each set of commands
           
        System.out.println("Status Report: "+rover.report());
        
     }
}
