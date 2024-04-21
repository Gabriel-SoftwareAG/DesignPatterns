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

import ai.verisoft.behavioral.mediator.TestEnvironmentMediator;
import ai.verisoft.behavioral.mediator.WebAppTestEnvironmentMediator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    private static TestEnvironmentMediator mediator;

    @BeforeAll
    public static void setup() {
        mediator = new WebAppTestEnvironmentMediator();
    }


    @BeforeEach
    public void beforeEach() {
        configureEnvironment();
    }


    @AfterEach
    public void afterEach() {
        cleanupEnvironment();
    }


    @Test
    public void test1() {
        System.out.println("Running the test...");
        // Test logic here.
        System.out.println("Test completed.");
    }


    private static void configureEnvironment() {
        mediator.configureEnvironment();
    }


    private static void cleanupEnvironment() {
        mediator.cleanupEnvironment();
    }
}
