/*
 * (C) Copyright 2024 VeriSoft (http://www.verisoft.co)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
