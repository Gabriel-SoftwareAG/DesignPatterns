namespace Bridge;
using System;

public class Television : Device
{
    private bool isOn;
    private int volume;
    private int channel;

    public Television()
    {
        this.isOn = false;
        this.volume = 50; // Default volume
        this.channel = 1; // Default channel
    }

    public void PowerOn()
    {
        isOn = true;
        Console.WriteLine("Television powered on");
    }

    public void PowerOff()
    {
        isOn = false;
        Console.WriteLine("Television powered off");
    }

    public void AdjustVolume(int volume)
    {
        this.volume = volume;
        Console.WriteLine("Adjusting television volume to " + volume);
    }

    public void ChangeChannel(int channel)
    {
        this.channel = channel;
        Console.WriteLine("Changing television channel to " + channel);
    }
}
