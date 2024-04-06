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

// Non-terminal expression for setting a variable
public class SetVariableExpression implements Expression {
    private final String name;
    private final String value;

    public SetVariableExpression(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void interpret(TestContext context) {
        context.setVariable(name, value);
    }
}
