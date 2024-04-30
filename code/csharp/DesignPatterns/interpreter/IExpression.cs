namespace Interpreter
{
    public interface IExpression
    {
        string Interpret(Context context);
    }
}
