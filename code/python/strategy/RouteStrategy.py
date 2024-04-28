from abc import ABC, abstractmethod

class RouteStrategy(ABC):
    @abstractmethod
    def calculate_route(self):
        pass
