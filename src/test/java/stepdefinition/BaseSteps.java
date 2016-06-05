package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

/**
 * Created by ramathreya on 11/04/16.
 */
public class BaseSteps {
    protected WebDriver driver;

    @Before
    protected void setup() {
        System.out.println("SETUP");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    protected void exit() {
        // Screenshots can be taken here
        driver.quit();
    }
}
