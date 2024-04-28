from Device import Device

class Television(Device):
    def __init__(self):
        self.is_on = False
        self.volume = 50
        self.channel = 1

    def power_on(self):
        self.is_on = True
        print("Television powered on")

    def power_off(self):
        self.is_on = False
        print("Television powered off")

    def adjust_volume(self, volume):
        self.volume = volume
        print(f"Television volume set to {volume}")

    def change_channel(self, channel):
        self.channel = channel
        print(f"Television channel changed to {channel}")
