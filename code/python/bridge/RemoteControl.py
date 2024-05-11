from Device import Device


class RemoteControl(Device):
    def __init__(self, device):
        self.device = device

    def power_on(self):
        self.device.power_on()

    def power_off(self):
        self.device.power_off()

    def adjust_volume(self, volume):
        self.device.adjust_volume(volume)

    def change_channel(self, channel):
        self.device.change_channel(channel)
