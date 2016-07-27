package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ProductPage;

import java.net.MalformedURLException;

/**
 * Created by ramathreya on 04/06/16.
 */

public class ProductSteps extends BaseSteps {
    private ProductPage productPage;

    @Before
    public void setup() throws MalformedURLException {
        super.setup();
        productPage = new ProductPage(driver);
    }

    @After
    public void exit() {
        super.exit();
    }

    @Given("^I open (.*?)$")
    public void openPage(String productID) throws InterruptedException {
        productPage.goToPage("/product/" + productID);
    }

    @When("^I enter (.*?) in \"(.*?)\"$")
    public void enterTextField(String value, String element) throws InterruptedException {
        productPage.sendKeys(value, productPage.getElement(element));
    }

    @When("^I click on \"(.*?)\"$")
    public void clickElement(String target) throws InterruptedException {
        productPage.buyProduct();
    }

    @Then("^I get confirmation of purchase$")
    public void confirmation() throws InterruptedException {
        assert productPage.checkConfirmMessage();
    }
}


