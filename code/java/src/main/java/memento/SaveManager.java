package memento;

import java.util.ArrayList;
import java.util.List;

class SaveManager {
    private final List<GameState> savedStates = new ArrayList<>();

    public void add(GameState gameState) {
        savedStates.add(gameState);
    }

    public GameState get(int index) {
        return savedStates.get(index);
    }
}