from Colleague import Colleague

class Developer(Colleague):
    def send(self, message):
        print(f"Developer sending message: {message}")
        self.mediator.request(message, self)

    def receive(self, message):
        print(f"Developer received task: {message}")
