from abc import ABC, abstractmethod

class Student(ABC):
    @abstractmethod
    def receive_update(self):
        pass
