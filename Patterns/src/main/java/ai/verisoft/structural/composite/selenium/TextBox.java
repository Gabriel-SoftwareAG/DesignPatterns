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
package ai.verisoft.structural.composite.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class TextBox extends BaseComponent {
    private final By locator;

    public TextBox(WebDriver driver, By locator) {
        super(driver);
        this.locator = locator;
    }

    @Override
    public void action() {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Method to enter text
    public void enterText(String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text + Keys.ENTER);
    }
}
