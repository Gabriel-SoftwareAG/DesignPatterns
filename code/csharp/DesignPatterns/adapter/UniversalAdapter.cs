namespace Adapter;
class UniversalAdapter : IElectricalOutlet
{
    private MobilePhone _device;

    public UniversalAdapter(MobilePhone device)
    {
        _device = device;
    }

    public void Request()
    {
        Console.WriteLine("Converting electrical power to device");
        _device.SpecificRequest();
    }
}
