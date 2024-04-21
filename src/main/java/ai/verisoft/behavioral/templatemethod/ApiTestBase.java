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
package ai.verisoft.behavioral.templatemethod;

/**
 * The ApiTestBase class serves as the template for API tests.
 * It defines the skeleton of the testing process, including setup, sending a request,
 * validating the response, and teardown. Subclasses are expected to provide implementations
 * for the sendRequest and validateResponse methods, which are specific to each API endpoint being tested.
 */
public abstract class ApiTestBase {

    // The template method that defines the test structure
    public final void runTest() {
        setup();
        sendRequest();
        validateResponse();
        teardown();
    }

    // Common setup for all tests, can be overridden if needed
    protected void setup() {
        System.out.println("Setting up the test environment...");
        // Common setup logic like setting up API base URL and authentication
    }

    // Abstract method for sending request, to be implemented by subclasses
    protected abstract void sendRequest();

    // Abstract method for validating the response, to be implemented by subclasses
    protected abstract void validateResponse();

    // Common teardown for all tests, can be overridden if needed
    protected void teardown() {
        System.out.println("Cleaning up after the test...");
        // Common cleanup logic
    }
}
