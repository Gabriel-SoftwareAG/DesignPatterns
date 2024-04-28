from LegalService import LegalService

class RealLegalService(LegalService):
    def request_legal_assistance(self):
        print("Real legal service is providing legal assistance.")

    def provide_legal_assistance(self):
        self.request_legal_assistance()
