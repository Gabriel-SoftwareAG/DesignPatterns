from Device import Device


class SoundSystem(Device):
    def __init__(self):
        self.is_on = False
        self.volume = 50

    def power_on(self):
        self.is_on = True
        print("Sound system powered on")

    def power_off(self):
        self.is_on = False
        print("Sound system powered off")

    def adjust_volume(self, volume):
        self.volume = volume
        print(f"Adjusting sound system volume to {volume}")

    def change_channel(self, channel):
        print("Sound system does not have channels")
