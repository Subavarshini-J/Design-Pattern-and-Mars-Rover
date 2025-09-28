package creational;

import behavioral.Observer;
import behavioral.Subject;
import java.util.ArrayList;
import java.util.List;

public class Hero implements Subject 
{
    private String name;
    private String type;
    private int health = 100;
    private Weapon weapon;
    private List<Observer> observers = new ArrayList<>();

    public Hero(String name, String type, Weapon weapon) 
    {
        this.name = name;
        this.type = type;
        this.weapon = weapon;
    }

    public String getName() 
    {
         return name; 
    }
    public String getType() 
    {
         return type; 
    }
    public int getHealth() 
    {
         return health; 
    }
    public Weapon getWeapon() 
    {
         return weapon; 
    }
    public void reduceHealth(int damage) 
    {
        health -= damage;
        if (health < 0) health = 0;
        notifyObservers();
    }

    public void heal(int value) 
    {
        health += value;
        if (health > 100) health = 100;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) 
    {
         observers.add(o); 
    }

    @Override
    public void removeObserver(Observer o) 
    {
         observers.remove(o);
    }

    @Override
    public void notifyObservers() 
    {
        for (Observer o : observers) 
        {
            o.update(health);
        }
    }
}
