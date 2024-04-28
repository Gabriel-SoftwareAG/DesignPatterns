from abc import ABC, abstractmethod

class HouseBuilder(ABC):
    def build_house(self):
        self._lay_foundation()
        self.build_walls()
        self.install_roof()
        self.do_interior()

    def _lay_foundation(self):
        print("Laying the foundation with concrete and steel bars.")

    @abstractmethod
    def build_walls(self):
        pass

    @abstractmethod
    def install_roof(self):
        pass

    @abstractmethod
    def do_interior(self):
        pass
