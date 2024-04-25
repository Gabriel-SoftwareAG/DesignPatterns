package facade;

class ControlPanel {
    private AutomaticParkingSystem parkingSystem;
    private AdaptiveCruiseControlSystem cruiseControlSystem;
    private CollisionAvoidanceSystem collisionSystem;

    public ControlPanel() {
        this.parkingSystem = new AutomaticParkingSystem();
        this.cruiseControlSystem = new AdaptiveCruiseControlSystem();
        this.collisionSystem = new CollisionAvoidanceSystem();
    }

    public void park() {
        // Some more complicated logic to park the car
        parkingSystem.park();
    }

    public void activateCruiseControl() {
        // Need to control the speed of the car, the distance between cars, etc.
        cruiseControlSystem.activate();
    }

    public void avoidCollision() {
        // Need to control the speed of the car, the distance between cars, etc.
        collisionSystem.avoid();
    }

    public void driveToHomeAndPark() {
        activateCruiseControl();
        avoidCollision();
        park();
    }
}
