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

import ai.verisoft.behavioral.interpreter.kdt.*;
import org.junit.jupiter.api.Test;

public class KdtInterpreterTest {

    @Test
    public void testKdt() {
        // Test script
        String script = "OpenBrowser; Navigate(URL='https://mail.google.com/'); " +
                "InputText(Locator='username', Text='user123'); " +
                "ClickElement(Locator='NextButton'); " +
                "InputText(Locator='password', Text='pass456'); " +
                "ClickElement(Locator='SignInButton'); " +
                "ClickElement(Locator='ComposeButton'); " +
                "InputText(Locator='ToField', Text='recipient@example.com'); " +
                "InputText(Locator='SubjectField', Text='Test Email'); " +
                "InputText(Locator='Body', Text='This is a test email.'); " +
                "ClickElement(Locator='SendButton');";

        // Parsing and executing the script
        TestContext context = new TestContext();
        String[] steps = script.split("; ");
        for (String step : steps) {
            String[] parts = step.split("\\(");
            String command = parts[0];
            if (parts.length > 1) {
                String argsStr = parts[1].substring(0, parts[1].length() - 1);
                String[] arguments = argsStr.split(", ");
                switch (command) {
                    case "OpenBrowser":
                        new OpenBrowserExpression().interpret(context);
                        break;
                    case "Navigate":
                        new SetVariableExpression(arguments[0].split("=")[0], arguments[0].split("=")[1]).interpret(context);
                        new NavigateExpression().interpret(context);
                        break;
                    case "InputText":
                        new InputTextExpression(arguments[0].split("=")[1], arguments[1].split("=")[1]).interpret(context);
                        break;
                    case "ClickElement":
                        new ClickElementExpression(arguments[0].split("=")[1]).interpret(context);
                        break;
                    default:
                        System.out.println("Unknown command: " + command);
                }
            } else {
                switch (command) {
                    case "OpenBrowser":
                        new OpenBrowserExpression().interpret(context);
                        break;
                    case "Navigate":
                        System.out.println("Navigate command requires URL argument");
                        break;
                    case "InputText":
                        System.out.println("InputText command requires Locator and Text arguments");
                        break;
                    case "ClickElement":
                        System.out.println("ClickElement command requires Locator argument");
                        break;
                    default:
                        System.out.println("Unknown command: " + command);
                }
            }
        }
    }
}
