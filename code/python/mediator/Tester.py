from Colleague import Colleague


class Tester(Colleague):
    def send(self, message):
        print(f"Tester sending message: {message}")
        self.mediator.request(message, self)

    def receive(self, message):
        print(f"Tester received task: {message}")
