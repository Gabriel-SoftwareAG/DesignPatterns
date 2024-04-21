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

import ai.verisoft.structural.flyweight.TextInputElement;
import ai.verisoft.structural.flyweight.WebElementFactory;
import ai.verisoft.structural.flyweight.WebElementFlyweight;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlyweightTest {

    @Test
    public void testFlyweight() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElementFactory factory = new WebElementFactory(driver);

        // Use the factory to get the Google search box element
        WebElementFlyweight searchBox = factory.getElement("textInput", By.name("q"));

        // Type a query into the Google search box
        if (searchBox instanceof TextInputElement) {
            ((TextInputElement) searchBox).setText("Flyweight Design Pattern");
        }

        Thread.sleep(5000);

        // Remember to close the browser
        driver.quit();
    }
}
