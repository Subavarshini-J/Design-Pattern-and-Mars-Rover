// src/creational/WeaponInventory.java
package creational;

import java.util.HashMap;
import java.util.Map;

public class WeaponInventory {
    private Map<String, Weapon> weapons = new HashMap<>();

    public WeaponInventory() {
        weapons.put("sword", new Weapon("Sword", 10));
        weapons.put("bow", new Weapon("Bow", 5));
    }

    public Weapon getWeapon(String weaponName) {
        return weapons.get(weaponName);
    }
}