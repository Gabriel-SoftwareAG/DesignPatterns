package interpreter;

class TerminalExpression {
    private String translation;

    public TerminalExpression(String translation) {
        this.translation = translation;
    }

    public String interpret(Context context) {
        return translation;
    }
}
