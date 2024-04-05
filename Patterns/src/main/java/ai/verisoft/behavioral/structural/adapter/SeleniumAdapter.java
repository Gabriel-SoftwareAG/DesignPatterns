package ai.verisoft.behavioral.structural.adapter;

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

