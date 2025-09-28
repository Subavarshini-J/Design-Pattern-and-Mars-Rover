package structural;

public class BasicEnemy implements Enemy 
{
    @Override
    public void attack() 
    {
        System.out.println("Enemy attacks with claws!");
    }

    @Override
    public int getDamage() 
    {
        return 10;
    }
}
