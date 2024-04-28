from LegalService import LegalService
from RealLegalService import RealLegalService

class ProxyLegalService(LegalService):
    def __init__(self):
        self.real_legal_service = None

    def request_legal_assistance(self):
        if self.real_legal_service is None:
            self.real_legal_service = RealLegalService()

        print("Proxy legal service is requesting legal assistance.")
        self.real_legal_service.provide_legal_assistance()
