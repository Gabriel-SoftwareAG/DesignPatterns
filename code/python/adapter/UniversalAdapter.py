from adapter.ElectricalOutlet import ElectricalOutlet


class UniversalAdapter(ElectricalOutlet):
    def __init__(self, device):
        self.device = device

    def request(self):
        print("Converting electrical power to device")
        self.device.specific_request()