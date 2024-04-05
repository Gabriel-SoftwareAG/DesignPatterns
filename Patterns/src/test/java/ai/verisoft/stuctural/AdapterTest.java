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

import ai.verisoft.behavioral.structural.adapter.PlaywrightAdapter;
import ai.verisoft.behavioral.structural.adapter.WebBrowser;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void testAdapter() {
        WebBrowser browser = new PlaywrightAdapter(); // or new SeleniumAdapter();

        browser.navigate("https://www.google.com");
        browser.click("[name='q']");
        browser.type("[name='q']", "Adapter Pattern");
        // Wait a bit to see the action
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.close();
    }
}
