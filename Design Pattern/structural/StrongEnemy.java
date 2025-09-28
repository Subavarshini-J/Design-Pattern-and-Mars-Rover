package structural;

public class StrongEnemy extends EnemyDecorator 
{
    public StrongEnemy(Enemy enemy) 
    {
        super(enemy);
    }

    @Override
    public void attack() 
    {
        super.attack();
        System.out.println("This enemy is stronger!");
    }

    @Override
    public int getDamage() 
    {
        return super.getDamage() + 10;
    }
}
