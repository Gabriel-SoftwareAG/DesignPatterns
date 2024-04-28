
from Expression import Expression

class TerminalExpression(Expression):
    def __init__(self, translation):
        self.translation = translation

    def interpret(self, context):
        return self.translation
