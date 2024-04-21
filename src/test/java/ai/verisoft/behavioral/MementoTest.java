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

import ai.verisoft.behavioral.memento.ApplicationOriginator;
import ai.verisoft.behavioral.memento.Caretaker;
import ai.verisoft.behavioral.memento.State;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MementoTest {

    /**
     * This step would typically involve Selenium WebDriver to interact with the web application.
     * However, for simplicity and to focus on the design pattern,
     * this example will simulate the interactions.
     */
    @Test
    public void testMemento(){
        ApplicationOriginator originator = new ApplicationOriginator();
        Caretaker caretaker = new Caretaker();

        // Initial state with one item
        originator.setState(new State(List.of("Item1"), ""));
        caretaker.addMemento(originator.saveStateToMemento());

        // State with an additional item
        originator.setState(new State(Arrays.asList("Item1", "Item2"), ""));
        caretaker.addMemento(originator.saveStateToMemento());

        // Apply a discount code
        originator.setState(new State(Arrays.asList("Item1", "Item2"), "DISCOUNT10"));
        caretaker.addMemento(originator.saveStateToMemento());

        // Simulate needing to revert to just having two items without a discount
        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("Restored State: " + originator.saveStateToMemento().getState());

    }
}
