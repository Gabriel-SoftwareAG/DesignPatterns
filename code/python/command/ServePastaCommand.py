from Command import Command


class ServePastaCommand(Command):
    def __init__(self, receiver):
        self.receiver = receiver

    def execute(self):
        print("ServePastaCommand.execute(): Delegating to Receiver.serve_pasta()")
        self.receiver.serve_pasta()
