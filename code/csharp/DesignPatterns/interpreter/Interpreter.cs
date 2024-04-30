namespace Interpreter;
using System.Collections.Generic;

class Interpreter
{
    private Dictionary<string, IExpression> _expressions;

    public Interpreter()
    {
        _expressions = new Dictionary<string, IExpression>();
        _expressions.Add("Hello", new TerminalExpression("Bonjour"));
        // Add more expressions as needed
    }

    public void Interpret(string expression, Context context)
    {
        if (_expressions.ContainsKey(expression))
        {
            string translation = _expressions[expression].Interpret(context);
            System.Console
            .WriteLine($"Interpreter: Translated expression - {translation}");
        }
        else
        {
            System.Console.WriteLine("Interpreter: Expression not recognized");
        }
    }
}
