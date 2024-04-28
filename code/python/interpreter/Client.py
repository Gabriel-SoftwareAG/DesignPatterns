
from Context import Context
from Interpreter import Interpreter

def main():
    context = Context("English")
    interpreter = Interpreter()

    expression = "Hello"
    print(f"Client: Sending expression - {expression}")
    interpreter.interpret(expression, context)

    complex_expression = "How are you?"
    print(f"Client: Sending expression - {complex_expression}")
    interpreter.interpret(complex_expression, context)

if __name__ == "__main__":
    main()
