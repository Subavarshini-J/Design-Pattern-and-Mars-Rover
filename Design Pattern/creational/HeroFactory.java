package creational;

import java.util.Scanner;

public class HeroFactory 
{
    public static Hero createHero() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hero name: ");
        String name = sc.nextLine();

        System.out.print("Choose Hero type (Warrior/Mage): ");
        String type = sc.nextLine();

        Weapon weapon = WeaponFactory.chooseWeapon();

        return new Hero(name, type, weapon);
    }
}
