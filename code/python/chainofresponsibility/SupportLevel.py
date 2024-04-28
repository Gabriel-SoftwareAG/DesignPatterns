from abc import ABC, abstractmethod

class SupportLevel(ABC):
    @abstractmethod
    def set_next(self, next):
        pass

    @abstractmethod
    def handle_request(self, ticket):
        pass
