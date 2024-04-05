package ai.verisoft.behavioral.structural.adapter;

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

