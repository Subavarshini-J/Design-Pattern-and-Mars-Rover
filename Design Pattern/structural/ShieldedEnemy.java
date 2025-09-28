package structural;

public class ShieldedEnemy extends EnemyDecorator 
{
    public ShieldedEnemy(Enemy enemy) 
    {
        super(enemy);
    }

    @Override
    public void attack() 
    {
        super.attack();
        System.out.println("This enemy is shielded, harder to damage!");
    }

    @Override
    public int getDamage() 
    {
        return super.getDamage();
    }
}
