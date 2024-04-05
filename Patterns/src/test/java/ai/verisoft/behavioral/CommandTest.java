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

import ai.verisoft.behavioral.command.*;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void testCommand() {
        TestWorkflow workflow = new TestWorkflow();

        // Simulate dynamic conditions
        boolean userIsLoggedIn = true; // This would typically be determined at runtime
        double cartTotal = 150.00; // This would be calculated based on cart contents
        double discountThreshold = 100.00;

        if (userIsLoggedIn) {
            workflow.addCommand(new SearchProductCommand());
            workflow.addCommand(new AddToCartCommand());

            if (cartTotal > discountThreshold) {
                workflow.addCommand(new ApplyDiscountCommand());
            }
        } else {
            workflow.addCommand(new LoginCommand());
            // Additional commands for non-logged-in users
        }

        workflow.executeWorkflow();
    }
}

