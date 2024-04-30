namespace Interpreter
{
    public class Context
    {
        public string Language { get; }

        public Context(string language)
        {
            Language = language;
        }
    }
}
