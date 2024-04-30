using System;

namespace Bridge
{
    public class BridgeClient
    {
        public static void BridgeExample()
        {
            // Creating a television device
            Device tv = new Television();

            // Using a basic remote control for the television
            RemoteControl remoteControl = new RegularRemoteControl(tv);

            // Powering on the TV and changing the channel
            remoteControl.PowerOn();
            remoteControl.ChangeChannel(5);

            // Creating a sound system device
            Device soundSystem = new SoundSystem();

            // Using an advanced remote control for the sound system
            AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(soundSystem);

            // Powering on the sound system, adjusting volume, and muting
            advancedRemoteControl.PowerOn();
            advancedRemoteControl.AdjustVolume(20);
            advancedRemoteControl.Mute();
        }
    }
}
