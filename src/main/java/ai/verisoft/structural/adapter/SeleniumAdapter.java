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
package ai.verisoft.structural.adapter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAdapter implements WebBrowser {
    private final WebDriver driver;

    public SeleniumAdapter() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @Override
    public void navigate(String url) {
        driver.get(url);
    }

    @Override
    public void click(String selector) {
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.click();
    }

    @Override
    public void type(String selector, String text) {
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys(text);
    }

    @Override
    public void close() {
        driver.quit();
    }
}

