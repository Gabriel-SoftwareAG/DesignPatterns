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


import ai.verisoft.behavioral.state.FeatureDisabledState;
import ai.verisoft.behavioral.state.FeatureTestContext;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void testState() {
        // Simulate feature flag status. This would typically be retrieved from a feature management system.
        boolean isNewUserExperienceEnabled = true; // Change to false to simulate the feature being disabled.

        // Initialize the context based on the feature flag status
        FeatureTestContext testContext = new FeatureTestContext(isNewUserExperienceEnabled);

        // Execute tests based on the current state
        testContext.executeStep();

        // Example of switching state, if required, for further tests
        testContext.setState(new FeatureDisabledState());
        testContext.executeStep();
    }
}
