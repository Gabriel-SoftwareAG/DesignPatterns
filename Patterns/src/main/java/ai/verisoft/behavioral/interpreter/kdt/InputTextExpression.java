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
package ai.verisoft.behavioral.interpreter.kdt;


// Terminal expression for inputting text
public class InputTextExpression implements Expression {
    private final String locator;
    private final String text;

    public InputTextExpression(String locator, String text) {
        this.locator = locator;
        this.text = text;
    }

    @Override
    public void interpret(TestContext context) {
        System.out.println("Inputting text '" + text + "' into locator: " + locator);
    }
}
