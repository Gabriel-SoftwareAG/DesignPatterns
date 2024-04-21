package memento;

class Player {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public GameState saveStateToMemento() {
        return new GameState(state);
    }

    public void getStateFromMemento(GameState gameState) {
        state = gameState.getState();
    }
}
