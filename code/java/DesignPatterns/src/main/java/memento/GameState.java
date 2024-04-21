package memento;

class GameState {
    private final String state;

    public GameState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
