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
        parkingSystem.park();
    }

    public void activateCruiseControl() {
        cruiseControlSystem.activate();
    }

    public void avoidCollision() {
        collisionSystem.avoid();
    }
}
