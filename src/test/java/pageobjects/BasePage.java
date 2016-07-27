package pageobjects;

import interfaces.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

/**
 * Created by ramathreya on 04/06/16.
 */
public class BasePage implements Config {
    protected WebDriver driver;
    protected HashMap<String, WebElement> elements;

    private void debug() throws InterruptedException {
        if(DEBUG) {
            Thread.sleep(1000);
        }
    }

    public void initializeElements(){

    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elements = new HashMap();
    }

    public void goToPage(String url) throws InterruptedException {
        driver.get(BASE_URL + url);
        Thread.sleep(5000);
        initializeElements();
        debug();
    }

    public void sendKeys(String value, WebElement element) throws InterruptedException {
        element.sendKeys(value);
        debug();
    }

    public WebElement getElement(String key) {
        return elements.get(key);
    }

    public void submit(WebElement element) throws InterruptedException {
        element.submit();
        Thread.sleep(10000);
    }

    public void click(WebElement element) throws InterruptedException {
        element.click();
        Thread.sleep(10000);
    }
}
