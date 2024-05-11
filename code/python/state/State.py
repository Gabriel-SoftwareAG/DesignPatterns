from abc import ABC, abstractmethod


class State(ABC):
    @abstractmethod
    def handle_request(self):
        pass
