
from Expression import Expression

class NonterminalExpression(Expression):
    def __init__(self, expression):
        self.expression = expression

    def interpret(self, context):
        return f"Translation of complex expression: {self.expression}"
