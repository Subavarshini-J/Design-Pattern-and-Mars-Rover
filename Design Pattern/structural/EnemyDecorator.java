package structural;

public abstract class EnemyDecorator implements Enemy {
    protected Enemy decoratedEnemy;

    public EnemyDecorator(Enemy enemy) 
    {
        this.decoratedEnemy = enemy;
    }

    @Override
    public void attack() 
    {
        decoratedEnemy.attack();
    }

    @Override
    public int getDamage() 
    {
        return decoratedEnemy.getDamage();
    }
}
