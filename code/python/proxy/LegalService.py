from abc import ABC, abstractmethod

class LegalService(ABC):
    @abstractmethod
    def request_legal_assistance(self):
        pass
