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

import ai.verisoft.behavioral.structural.composite.selenium.GoogleHomePage;
import ai.verisoft.behavioral.structural.composite.xml.CompositeElement;
import ai.verisoft.behavioral.structural.composite.xml.LeafElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompositeTest {

    @Test
    public void seleniumCompositeExample() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("Selenium WebDriver");

        // Wait for 5 seconds to see the result
        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void xmlCompositeExample() {
        CompositeElement root = new CompositeElement("book");
        root.addElement(new LeafElement("title"));
        CompositeElement author = new CompositeElement("author");
        author.addElement(new LeafElement("firstName"));
        author.addElement(new LeafElement("lastName"));
        root.addElement(author);

        root.printStructure("");

    }
}
