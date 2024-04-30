using System;

public class BridgeClient
{
    public static void Bridge()
    {
        Device tv = new Television();
        tv.PowerOn();
        tv.AdjustVolume(30);
        tv.ChangeChannel(5);
        tv.PowerOff();
    }
}
