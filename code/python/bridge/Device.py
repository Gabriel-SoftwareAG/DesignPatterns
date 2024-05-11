from abc import ABC, abstractmethod


class Device(ABC):
    @abstractmethod
    def power_on(self):
        pass

    @abstractmethod
    def power_off(self):
        pass

    @abstractmethod
    def adjust_volume(self, volume):
        pass

    @abstractmethod
    def change_channel(self, channel):
        pass
