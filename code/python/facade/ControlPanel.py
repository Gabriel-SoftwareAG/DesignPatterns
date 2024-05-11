from AdaptiveCruiseControlSystem import AdaptiveCruiseControlSystem
from AutomaticParkingSystem import AutomaticParkingSystem
from CollisionAvoidanceSystem import CollisionAvoidanceSystem


class ControlPanel:
    def __init__(self):
        self.parkingSystem = AutomaticParkingSystem()
        self.cruiseControlSystem = AdaptiveCruiseControlSystem()
        self.collisionSystem = CollisionAvoidanceSystem()

    def park(self):
        self.parkingSystem.park()

    def activate_cruise_control(self):
        self.cruiseControlSystem.activate()

    def avoid_collision(self):
        self.collisionSystem.avoid()

    def drive_to_home_and_park(self):
        print("Taking you home...")
        self.activate_cruise_control()
        self.avoid_collision()
        self.park()
