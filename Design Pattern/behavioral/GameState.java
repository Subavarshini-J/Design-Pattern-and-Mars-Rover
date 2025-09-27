// src/behavioral/GameState.java
package behavioral;

public class GameState {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Game State: " + state);
    }

    public String getState() {
        return state;
    }
}