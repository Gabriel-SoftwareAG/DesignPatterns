using System;

namespace Interpreter
{
    public class InterpreterClient
    {
        public static void InterpreterExample()
        {
            Context context = new Context("English");
            Interpreter interpreter = new Interpreter();

            string expression = "Hello";
            Console.WriteLine($"Client: Sending expression - {expression}");
            interpreter.Interpret(expression, context);

            string complexExpression = "How are you?";
            Console.WriteLine($"Client: Sending expression - {complexExpression}");
            interpreter.Interpret(complexExpression, context);
        }
    }
}
