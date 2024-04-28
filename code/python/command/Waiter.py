class Waiter:
    def __init__(self):
        self.command = None

    def set_command(self, command):
        self.command = command

    def execute_command(self):
        print(f"Waiter.executeCommand(): Delegating to Command.execute() for {type(self.command).__name__}")
        self.command.execute()
