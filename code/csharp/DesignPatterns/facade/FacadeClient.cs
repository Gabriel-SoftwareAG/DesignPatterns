namespace facade;

class FacadeClient
{
    public static void FacadeExample()
    {
        ControlPanel controlPanel = new ControlPanel();

        controlPanel.DriveToHomeAndPark();
    }
}
