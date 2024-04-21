package interpreter;

class TerminalExpression implements Expression {
    private String translation;

    public TerminalExpression(String translation) {
        this.translation = translation;
    }

    @Override
    public String interpret(Context context) {
        return translation;
    }
}
