from abc import ABC, abstractmethod


class Colleague(ABC):
    def __init__(self, mediator):
        self.mediator = mediator

    @abstractmethod
    def send(self, message):
        pass

    @abstractmethod
    def receive(self, message):
        pass
