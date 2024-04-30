namespace Bridge;

abstract class RemoteControl
{
    protected Device device;

    public RemoteControl(Device device)
    {
        this.device = device;
    }

    public void PowerOn()
    {
        device.PowerOn();
    }

    public void PowerOff()
    {
        device.PowerOff();
    }

    public void AdjustVolume(int volume)
    {
        device.AdjustVolume(volume);
    }

    public void ChangeChannel(int channel)
    {
        device.ChangeChannel(channel);
    }
}
