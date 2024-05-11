from abc import ABC, abstractmethod


class Mediator(ABC):
    @abstractmethod
    def request(self, message, colleague):
        pass

    @abstractmethod
    def response(self, message, colleague):
        pass
