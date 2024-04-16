package facade;

class Client {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();

        // Driver uses the control panel to park the car
        controlPanel.park();

        // Driver activates adaptive cruise control
        controlPanel.activateCruiseControl();

        // Driver activates collision avoidance system
        controlPanel.avoidCollision();
    }
}
