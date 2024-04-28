from Command import Command
from Receiver import Receiver

class PreparePizzaCommand(Command):
    def __init__(self, receiver):
        self.receiver = receiver

    def execute(self):
        print("PreparePizzaCommand.execute(): Delegating to Receiver.prepare_pizza()")
        self.receiver.prepare_pizza()
