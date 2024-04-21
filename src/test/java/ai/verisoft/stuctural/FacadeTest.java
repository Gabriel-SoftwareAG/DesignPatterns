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

import ai.verisoft.structural.facade.BingSearchFacade;
import ai.verisoft.structural.facade.GoogleSearchFacade;
import ai.verisoft.structural.facade.SearchEngineFacade;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacadeTest {

    @Test
    public void testFacadeGoogleSearch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        SearchEngineFacade searchEngine = new GoogleSearchFacade(driver);

        searchEngine.openHomePage();
        searchEngine.performSearch("Facade Design Pattern");

        // Assertions and further test steps go here
        Thread.sleep(5000);

        driver.quit();
    }

    @Test
    public void testFacadeBingSearch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        SearchEngineFacade searchEngine = new BingSearchFacade(driver);

        searchEngine.openHomePage();
        searchEngine.performSearch("Facade Design Pattern");

        // Assertions and further test steps go here
        Thread.sleep(5000);

        driver.quit();
    }
}
