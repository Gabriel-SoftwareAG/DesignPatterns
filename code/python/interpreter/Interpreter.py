
from TerminalExpression import TerminalExpression

class Interpreter:
    def __init__(self):
        self.expressions = {
            "Hello": TerminalExpression("Bonjour")  # Simple example for translating "Hello"
        }

    def interpret(self, expression, context):
        if expression in self.expressions:
            translation = self.expressions[expression].interpret(context)
            print(f"Interpreter: Translated expression - {translation}")
        else:
            print("Interpreter: Expression not recognized")
