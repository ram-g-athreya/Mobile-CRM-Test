package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.ProductPage;

/**
 * Created by ramathreya on 04/06/16.
 */
public class ProductSteps extends BaseSteps {
    private HomePage homePage;
    private ProductPage productPage;

    @Before
    public void setup() {
        super.setup();
        productPage = new ProductPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void exit() {
        super.exit();
    }

    @Given("^I open (.*?)$")
    public void openPage(String page) throws InterruptedException {
        if (page.equals("HomePage")) {
            homePage.goToPage("/");
        }
        else {
            productPage.goToPage("/product/66");
        }
    }

    @When("^I click on \"(.*?)\"$")
    public void clickElement(String target) throws InterruptedException {
        productPage.buyProduct();
    }

    @When("^I enter \"(.*?)\" in \"(.*?)\"$")
    public void enterTextField(String value, String element) throws InterruptedException {
        productPage.sendKeys(value, productPage.getElement(element));
    }

}
