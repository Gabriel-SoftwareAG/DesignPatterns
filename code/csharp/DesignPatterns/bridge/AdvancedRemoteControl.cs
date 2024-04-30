using System;

namespace Bridge
{
    public class AdvancedRemoteControl : RemoteControl
    {
        public AdvancedRemoteControl(Device device) : base(device) { }

        public void Mute()
        {
            device.AdjustVolume(0);
        }
    }
}
