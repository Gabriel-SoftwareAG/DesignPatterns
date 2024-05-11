from RemoteControl import RemoteControl


class AdvancedRemoteControl(RemoteControl):
    def __init__(self, device):
        super().__init__(device)

    def mute(self):
        self.adjust_volume(0)
