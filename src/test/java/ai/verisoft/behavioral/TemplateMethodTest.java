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

import ai.verisoft.behavioral.templatemethod.retry.Attemptable;
import ai.verisoft.behavioral.templatemethod.CreateUserTest;
import ai.verisoft.behavioral.templatemethod.retry.Retry;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TemplateMethodTest {

    @Test
    public void testTemplateMethod() {
        CreateUserTest test = new CreateUserTest();
        test.runTest();
    }


    @Test
    public void retryTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Test Automation");
        new Actions(driver).sendKeys(Keys.ENTER).build().perform();

        Retry retry = new Retry(driver, 3, 1500, TimeUnit.MILLISECONDS);
        retry.attempt(new Attemptable() {
            @Override
            public void attempt() {
                //replace string with "Test automations" to see the retry in action
                if (driver.getTitle().contains("Test automation"))
                    return;
                else
                    throw new NotFoundException("Could not find element - retrying");
            }

            @Override
            public void onAttemptFail() {
                driver.navigate().refresh();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // No-op
                }
            }
        });

        driver.quit();
    }
}
