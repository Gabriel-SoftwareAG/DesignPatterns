package ai.verisoft.behavioral;

import ai.verisoft.behavioral.interpreter.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InterpreterTest {

    @Test
    public void testInterpreter() {
        String testScript = "EnterText Username JohnDoe\n" +
                "EnterText Email john@example.com\n" +
                "ClickButton Submit\n" +
                "AssertMessage Thank You";

        Context context = new Context();
        for (String command : testScript.split("\n")) {
            Expression expression = parseCommand(command);
            if (expression != null) {
                expression.interpret(context);
            }
        }
    }


    private static Expression parseCommand(String command) {
        String[] parts = command.split(" ");
        switch (parts[0]) {
            case "EnterText":
                return new EnterTextExpression(parts[1], parts[2]);
            case "ClickButton":
                return new ClickButtonExpression(parts[1]);
            case "AssertMessage":
                return new AssertMessageExpression(String.join(" ", Arrays.copyOfRange(parts, 1, parts.length)));
            default:
                System.out.println("Unknown command: " + command);
                return null;
        }
    }
}
