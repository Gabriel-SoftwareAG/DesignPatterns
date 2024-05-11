namespace Bridge;
using System;

public class Television : IDevice
{
    private bool _isOn;
    private int _volume;
    private int _channel;

    public Television()
    {
        this._isOn = false;
        this._volume = 50; // Default volume
        this._channel = 1; // Default channel
    }

    public void PowerOn()
    {
        _isOn = true;
        Console.WriteLine("Television powered on");
    }

    public void PowerOff()
    {
        _isOn = false;
        Console.WriteLine("Television powered off");
    }

    public void AdjustVolume(int volume)
    {
        this._volume = volume;
        Console.WriteLine("Adjusting television volume to " + volume);
    }

    public void ChangeChannel(int channel)
    {
        this._channel = channel;
        Console.WriteLine("Changing television channel to " + channel);
    }
}
