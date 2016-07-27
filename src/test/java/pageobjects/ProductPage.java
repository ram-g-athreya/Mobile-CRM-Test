package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ramathreya on 04/06/16.
 */

public class ProductPage extends BasePage {

    private By nameField = By.xpath("html/body//input[contains(@class, 'js-t-name')]");
    private By emailField = By.xpath("html/body//input[contains(@class, 'js-t-email')]");
    private By mobileField = By.xpath("html/body//input[contains(@class, 'js-t-mobile')]");
    private By addressField = By.xpath("html/body//textarea[contains(@class, 'js-t-address')]");
    private By buyButton = By.xpath("html/body//button[contains(@class, 'js-t-buy')]");
    private By confirmMessage = By.xpath("html/body//button[contains(@class, 'js-t-confirm-message')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getElement(String element){
        if (element.equals("nameField")) {
            return driver.findElement(nameField);
        }
        else if(element.equals("emailField")){
            return driver.findElement(emailField);
        }
        else if(element.equals("mobileField")){
            return driver.findElement(mobileField);
        }
        else if(element.equals("addressField")){
            return driver.findElement(addressField);
        }
        return null;
    }

    public void buyProduct() throws InterruptedException {
        driver.findElement(buyButton).click();
    }

    public boolean checkConfirmMessage() {
        return driver.findElement(confirmMessage).isDisplayed();
    }
}

