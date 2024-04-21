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
package ai.verisoft.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    // Simulate the web application's state.
    private final Map<String, String> formData = new HashMap<>();
    private String lastMessage = "";

    public void enterText(String fieldId, String value) {
        // Simulate entering text into a field.
        formData.put(fieldId, value);
        System.out.println("Entered '" + value + "' into " + fieldId);
    }

    public void clickButton(String buttonId) {
        // Simulate clicking a button and submitting the form.
        if ("Submit".equals(buttonId)) {
            // Pretend to submit form and set a success message.
            lastMessage = "Thank You";
            System.out.println("Clicked " + buttonId + " button. Form submitted.");
        }
    }

    public void assertMessage(String expectedMessage) {
        // Simulate checking for a message on the page.
        if (expectedMessage.equals(lastMessage)) {
            System.out.println("Assertion passed: Found expected message '" + expectedMessage + "'");
        } else {
            System.out.println("Assertion failed: Expected '" + expectedMessage + "', but found '" + lastMessage + "'");
        }
    }
}
