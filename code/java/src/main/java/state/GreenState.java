package state;

class GreenState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Green light - Go!");
        // Logic to switch to the yellow light
    }
}
