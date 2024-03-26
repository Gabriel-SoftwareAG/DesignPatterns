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
package ai.verisoft.creational;

import ai.verisoft.creational.abstractfactory.Application;
import ai.verisoft.creational.abstractfactory.DarkThemeFactory;
import ai.verisoft.creational.abstractfactory.GUIFactory;
import ai.verisoft.creational.abstractfactory.LightThemeFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        Application app = configureApplication();
        app.paint();
    }


    private static Application configureApplication() {
        GUIFactory factory;
        String theme = System.getenv("THEME"); // Just an example of how you might decide which factory to use

        if ("dark".equalsIgnoreCase(theme)) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        return new Application(factory);
    }

}
