from abc import ABC, abstractmethod

class Visitor(ABC):
    @abstractmethod
    def visit_painting(self, painting):
        pass

    @abstractmethod
    def visit_sculpture(self, sculpture):
        pass
