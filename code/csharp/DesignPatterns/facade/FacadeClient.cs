public class FacadeClient
{
    public static void Facade()
    {
        ControlPanel controlPanel = new ControlPanel();

        controlPanel.DriveToHomeAndPark();
    }
}
