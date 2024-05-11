namespace Bridge;

abstract class RemoteControl
{
    protected IDevice _device;

    public RemoteControl(IDevice device)
    {
        this._device = device;
    }

    public void PowerOn()
    {
        _device.PowerOn();
    }

    public void PowerOff()
    {
        _device.PowerOff();
    }

    public void AdjustVolume(int volume)
    {
        _device.AdjustVolume(volume);
    }

    public void ChangeChannel(int channel)
    {
        _device.ChangeChannel(channel);
    }
}
