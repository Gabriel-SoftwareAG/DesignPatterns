namespace Interpreter
{
    public class NonterminalExpression : IExpression
    {
        private string _expression;

        public NonterminalExpression(string expression)
        {
            _expression = expression;
        }

        public string Interpret(Context context)
        {
            // Here would be logic for interpreting based on context
            return $"Translation of complex expression: {_expression}";
        }
    }
}
