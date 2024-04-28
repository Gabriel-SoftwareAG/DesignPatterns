
from abc import ABC, abstractmethod

class Book(ABC):
    @abstractmethod
    def borrow_book(self):
        pass

    @abstractmethod
    def return_book(self):
        pass

    @abstractmethod
    def is_available(self):
        pass

    @abstractmethod
    def get_id(self):
        pass
