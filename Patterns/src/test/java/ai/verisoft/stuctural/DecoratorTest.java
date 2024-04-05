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
package ai.verisoft.stuctural;

import ai.verisoft.structural.decorator.Cheese;
import ai.verisoft.structural.decorator.Pizza;
import ai.verisoft.structural.decorator.PlainPizza;
import ai.verisoft.structural.decorator.TomatoSauce;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Pizza basicPizza = new PlainPizza();
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: $" + basicPizza.getCost());

        // Add cheese to the pizza
        Pizza cheesePizza = new Cheese(basicPizza);
        System.out.println("Ingredients: " + cheesePizza.getDescription());
        System.out.println("Price: $" + cheesePizza.getCost());

        // Add tomato sauce and cheese to the pizza
        Pizza tomatoAndCheesePizza = new TomatoSauce(new Cheese(basicPizza));
        System.out.println("Ingredients: " + tomatoAndCheesePizza.getDescription());
        System.out.println("Price: $" + tomatoAndCheesePizza.getCost());
    }
}
