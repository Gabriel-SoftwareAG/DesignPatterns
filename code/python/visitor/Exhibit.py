from abc import ABC, abstractmethod


class Exhibit(ABC):
    @abstractmethod
    def accept(self, visitor):
        pass
