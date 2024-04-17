package interpreter;

class NonterminalExpression implements Expression {
    private String expression;

    public NonterminalExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String interpret(Context context) {
        // Implementation of interpretation logic for nonterminal expressions
        // Example: Translate a complex expression based on context
        return "Translation of complex expression: " + expression;
    }
}
