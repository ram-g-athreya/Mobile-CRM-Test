package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ramathreya on 04/06/16.
 */
public class HomePage extends BasePage {

    private static final String FIRST_PRODUCT_XPATH = "html/body//a[contains(@class, 'js-t-product')][1]";

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void initializeElements() {
        elements.put("firstProduct", driver.findElement(By.xpath(FIRST_PRODUCT_XPATH)));
    }

    public void clickFirstProduct() {
        elements.get("firstProduct").click();
    }
}
