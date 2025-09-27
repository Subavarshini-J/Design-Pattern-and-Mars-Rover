// src/Main.java
import creational.GameFactory;
import creational.Weapon;
import creational.WeaponInventory;
import behavioral.Character;
import behavioral.GamePhase;
import structural.Enemy;
import structural.ArmoredEnemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create game characters using the Game Factory
        System.out.print("Choose your character (hero/villain): ");
        String characterType = scanner.nextLine();
        Character playerCharacter = GameFactory.createCharacter(characterType);

        // Check if the player character is valid
        if (playerCharacter == null) {
            System.out.println("Invalid character choice. Exiting game...");
            return;
        }

        // Choose weapon
        System.out.print("Choose your weapon (sword/bow): ");
        String weaponName = scanner.nextLine();
        WeaponInventory weaponInventory = new WeaponInventory();
        Weapon selectedWeapon = weaponInventory.getWeapon(weaponName);

        // Validate selected weapon
        if (selectedWeapon != null) {
            System.out.println("You have equipped a " + selectedWeapon.getName() + " with damage: " + selectedWeapon.getDamage());
        } else {
            System.out.println("Weapon not found, defaulting to Sword.");
            selectedWeapon = weaponInventory.getWeapon("sword");
            System.out.println("You have equipped a " + selectedWeapon.getName() + " with damage: " + selectedWeapon.getDamage());
        }

        // Simulate Game State
        GamePhase gameState = new GamePhase();
        gameState.setState("Started");

        // Create an enemy to fight
        Enemy genericEnemy = new Enemy();
        ArmoredEnemy armoredEnemy = new ArmoredEnemy(genericEnemy);
        
        // Perform a single action
        System.out.print("Choose an action (attack/quit): ");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("attack")) {
            playerCharacter.attack(armoredEnemy);
            armoredEnemy.attack(playerCharacter);

            // Check if either character has fallen
            if (playerCharacter.health <= 0) {
                System.out.println("You have been defeated!");
            } else if (armoredEnemy.health <= 0) {
                System.out.println("You defeated the armored enemy!");
            } else {
                System.out.println("Combat continues, but this is a single run.");
                System.out.println("Your health: " + playerCharacter.health);
                System.out.println("Armored Enemy's health: " + armoredEnemy.health);
            }
        } else if (action.equalsIgnoreCase("quit")) {
            System.out.println("Exiting game...");
        } else {
            System.out.println("Invalid action. Please restart the game and choose 'attack' or 'quit'.");
        }

        scanner.close();
    }
}
