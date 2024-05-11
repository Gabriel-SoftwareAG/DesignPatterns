from Mediator import Mediator


class ScrumMaster(Mediator):
    def __init__(self):
        self.developer = None
        self.tester = None

    def set_developer(self, developer):
        self.developer = developer

    def set_tester(self, tester):
        self.tester = tester

    def request(self, message, colleague):
        if colleague == self.developer:
            self.tester.receive(message)
        elif colleague == self.tester:
            self.developer.receive(message)

    def response(self, message, colleague):
        print(f"Scrum Master handling response: {message}")
