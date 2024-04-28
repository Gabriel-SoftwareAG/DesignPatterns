package state;

class TrafficLight {
    private State currentState;

    public TrafficLight(State state) {
        this.currentState = state;
    }

    public void perform() {
        currentState.handleRequest();
        // Logic to change the current state
    }

    public void setState(State state) {
        this.currentState = state;
    }
}
