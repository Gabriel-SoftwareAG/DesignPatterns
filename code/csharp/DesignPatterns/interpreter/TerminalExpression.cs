namespace Interpreter;

class TerminalExpression : IExpression
{
    private string _translation;

    public TerminalExpression(string translation)
    {
        _translation = translation;
    }

    public string Interpret(Context context)
    {
        return _translation;
    }
}
