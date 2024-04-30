public class Television : Device
{
    private bool _isOn;
    private int _volume;
    private int _channel;

    public Television()
    {
        _isOn = false;
        _volume = 50; // Default volume
        _channel = 1; // Default channel
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
        _volume = volume;
        Console.WriteLine($"Adjusting television volume to {volume}");
    }

    public void ChangeChannel(int channel)
    {
        _channel = channel;
        Console.WriteLine($"Changing television channel to {channel}");
    }
}
