package interpreter;

import java.util.HashMap;
import java.util.Map;

class Interpreter {
    private Map<String, TerminalExpression> expressions;

    public Interpreter() {
        expressions = new HashMap<>();
        expressions.put("Hello", new TerminalExpression("Bonjour"));
        // Add more expressions as needed
    }

    public void interpret(String expression, Context context) {
        if (expressions.containsKey(expression)) {
            TerminalExpression terminalExpression = expressions.get(expression);
            String translation = terminalExpression.interpret(context);
            System.out.println("Interpreter: Translated expression - " + translation);
        } else {
            System.out.println("Interpreter: Expression not recognized");
        }
    }
}
