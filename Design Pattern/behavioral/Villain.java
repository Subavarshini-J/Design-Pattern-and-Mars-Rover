package behavioral;



public class Villain extends Character {
    public Villain() {
        this.name = "Villain";
        this.health = 80; // Initial health for the villain
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " ambushes!");
        target.receiveDamage(15); // Fixed damage amount
    }

    @Override
    public String getName() {
        return name; // Return the name of the villain
    }
}