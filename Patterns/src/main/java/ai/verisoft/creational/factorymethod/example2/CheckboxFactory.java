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
package ai.verisoft.creational.factorymethod.example2;

public class CheckboxFactory {

    public enum Theme {
        LIGHT, DARK
    }

    public static Checkbox createCheckbox(Theme theme) {
        if (theme.equals(Theme.LIGHT)) {
            return new LightCheckbox();
        } else if (theme.equals(Theme.DARK)) {
            return new DarkCheckbox();
        }
        return null;
    }

    private CheckboxFactory() {
        throw new IllegalStateException("Utility class");
    }
}
