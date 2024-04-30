public class ControlPanel
{
    private IAutomaticParkingSystem _parkingSystem = new AutomaticParkingSystem();
    private IAdaptiveCruiseControlSystem _cruiseControlSystem = new AdaptiveCruiseControlSystem();
    private ICollisionAvoidanceSystem _collisionSystem = new CollisionAvoidanceSystem();

    public void Park()
    {
        _parkingSystem.Park();
    }

    public void ActivateCruiseControl()
    {
        _cruiseControlSystem.Activate();
    }

    public void AvoidCollision()
    {
        _collisionSystem.Avoid();
    }

    public void DriveToHomeAndPark()
    {
        System.Console.WriteLine("Taking you home...");
        ActivateCruiseControl();
        AvoidCollision();
        Park();
    }
}
