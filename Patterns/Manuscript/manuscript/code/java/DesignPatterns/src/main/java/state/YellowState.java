package state;

class YellowState implements State {
    public void handleRequest() {
        System.out.println("Yellow light - Caution!");
        // Logic to switch to the red light
    }
}
