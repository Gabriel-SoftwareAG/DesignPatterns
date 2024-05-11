from abc import ABC, abstractmethod


class Blog(ABC):
    @abstractmethod
    def create_iterator(self):
        pass

    @abstractmethod
    def add_post(self, post):
        pass
