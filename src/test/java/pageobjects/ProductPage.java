package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ramathreya on 04/06/16.
 */
public class ProductPage extends BasePage {

    /**
     * Element Configurations
     *
     * Buy Form
     *
     * Name Field
     * Email Field
     * Mobile Field
     * Address Field
     * Buy Button
     */

    private By nameField = By.xpath("html/body//input[contains(@class, 'js-t-name')]");
    private By emailField = By.xpath("html/body//input[contains(@class, 'js-t-email')]");
    private By mobileField = By.xpath("html/body//input[contains(@class, 'js-t-mobile')]");
    private By addressField = By.xpath("html/body//textarea[contains(@class, 'js-t-address')]");
    private By buyButton = By.xpath("html/body//button[contains(@class, 'js-t-buy')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void initializeElements() {
        elements.put("nameField", driver.findElement(nameField));
        elements.put("emailField", driver.findElement(emailField));
        elements.put("mobileField", driver.findElement(mobileField));
        elements.put("addressField", driver.findElement(addressField));
        elements.put("buyButton", driver.findElement(buyButton));
    }

    public void buyProduct() throws InterruptedException {
        click(elements.get("buyButton"));
    }

    public void submitForm(){

    }
}
