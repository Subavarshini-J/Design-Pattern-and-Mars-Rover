package creational;

public class BuilderHero 
{
    private String name;
    private String type;
    private Weapon weapon;

    public BuilderHero setName(String name) 
    {
        this.name = name;
        return this;
    }

    public BuilderHero setType(String type) 
    {
        this.type = type;
        return this;
    }

    public BuilderHero setWeapon(Weapon weapon) 
    {
        this.weapon = weapon;
        return this;
    }

    public Hero build() 
    {
        return new Hero(name, type, weapon);
    }
}
