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

import com.microsoft.playwright.*;

public class PlaywrightAdapter implements WebBrowser {
    private final Playwright playwright;
    private final Browser browser;
    private final Page page;

    public PlaywrightAdapter() {
        this.playwright = Playwright.create();
        this.browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        this.page = browser.newPage();
    }

    @Override
    public void navigate(String url) {
        page.navigate(url);
    }

    @Override
    public void click(String selector) {
        page.click(selector);
    }

    @Override
    public void type(String selector, String text) {
        page.fill(selector, text);
    }

    @Override
    public void close() {
        browser.close();
        playwright.close();
    }
}

