// src/creational/GameFactory.java
package creational;

import behavioral.Character;
import behavioral.Hero;
import behavioral.Villain;

public class GameFactory {
    public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "hero":
                return new Hero();
            case "villain":
                return new Villain();
            default:
                return null;
        }
    }
}