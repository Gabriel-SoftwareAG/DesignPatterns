package facade;

class Client {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();

        controlPanel.park();
        controlPanel.activateCruiseControl();
        controlPanel.avoidCollision();

        // Tie all actions together - take me home
        controlPanel.driveToHomeAndPark();
    }
}
