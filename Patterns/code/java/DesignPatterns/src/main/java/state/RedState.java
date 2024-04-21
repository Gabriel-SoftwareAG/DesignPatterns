package state;

class RedState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Red light - Stop!");
        // Logic to switch to the green light
    }
}
