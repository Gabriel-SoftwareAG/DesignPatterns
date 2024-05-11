namespace Bridge;
using System;

class SoundSystem : IDevice
{
    private bool _isOn;
    private int _volume;

    public SoundSystem()
    {
        this._isOn = false;
        this._volume = 50; // Default volume
    }

    public void PowerOn()
    {
        _isOn = true;
        Console.WriteLine("Sound system powered on");
    }

    public void PowerOff()
    {
        _isOn = false;
        Console.WriteLine("Sound system powered off");
    }

    public void AdjustVolume(int volume)
    {
        this._volume = volume;
        Console.WriteLine("Adjusting sound system volume to " + volume);
    }

    public void ChangeChannel(int channel)
    {
        // Sound system does not have channels
        Console.WriteLine("Sound system does not have channels");
    }
}
