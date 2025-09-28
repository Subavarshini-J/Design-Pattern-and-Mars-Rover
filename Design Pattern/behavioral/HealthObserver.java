package behavioral;

public class HealthObserver implements Observer 
{
    private String heroName;

    public HealthObserver(String heroName) 
    {
        this.heroName = heroName;
    }

    @Override
    public void update(int health) 
    {
        if (health <= 30) 
        {
            System.out.println("Warning: " + heroName + "'s health is very low (" + health + ")");
        }
    }
}
