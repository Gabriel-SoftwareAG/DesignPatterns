from abc import ABC, abstractmethod


class Product(ABC):
    @abstractmethod
    def serve(self):
        pass
