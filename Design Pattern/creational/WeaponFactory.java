package creational;

import java.util.Scanner;

public class WeaponFactory 
{
    public static Weapon chooseWeapon() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose weapon: 1. Sword  2. Bow");
        int choice = sc.nextInt();

        if (choice == 1) 
            return new Weapon("Sword", 20);
        else 
            return new Weapon("Bow", 15);
    }
}
