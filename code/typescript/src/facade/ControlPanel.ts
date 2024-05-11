import { AdaptiveCruiseControlSystem } from "./AdaptiveCruiseControlSystem";
import { AutomaticParkingSystem } from "./AutomaticParkingSystem";
import { CollisionAvoidanceSystem } from "./CollisionAvoidanceSystem";

export class ControlPanel {
    private parkingSystem: AutomaticParkingSystem = new AutomaticParkingSystem();
    private cruiseControlSystem: AdaptiveCruiseControlSystem = new AdaptiveCruiseControlSystem();
    private collisionSystem: CollisionAvoidanceSystem = new CollisionAvoidanceSystem();

    park(): void {
        this.parkingSystem.park();
    }

    activateCruiseControl(): void {
        this.cruiseControlSystem.activate();
    }

    avoidCollision(): void {
        this.collisionSystem.avoid();
    }

    driveToHomeAndPark(): void {
        console.log("Taking you home...");
        this.activateCruiseControl();
        this.avoidCollision();
        this.park();
    }
}
