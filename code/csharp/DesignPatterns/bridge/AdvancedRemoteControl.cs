namespace Bridge;
using System;

class AdvancedRemoteControl : RemoteControl
{
    public AdvancedRemoteControl(IDevice device) : base(device) { }

    public void Mute()
    {
        _device.AdjustVolume(0);
    }
}
