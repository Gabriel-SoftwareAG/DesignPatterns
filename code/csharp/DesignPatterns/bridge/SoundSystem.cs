using System;

namespace Bridge
{
    public class SoundSystem : Device
    {
        private bool isOn;
        private int volume;

        public SoundSystem()
        {
            this.isOn = false;
            this.volume = 50; // Default volume
        }

        public void PowerOn()
        {
            isOn = true;
            Console.WriteLine("Sound system powered on");
        }

        public void PowerOff()
        {
            isOn = false;
            Console.WriteLine("Sound system powered off");
        }

        public void AdjustVolume(int volume)
        {
            this.volume = volume;
            Console.WriteLine("Adjusting sound system volume to " + volume);
        }

        public void ChangeChannel(int channel)
        {
            // Sound system does not have channels
            Console.WriteLine("Sound system does not have channels");
        }
    }
}
