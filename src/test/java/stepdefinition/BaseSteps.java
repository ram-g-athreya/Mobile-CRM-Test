package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

/**
 * Created by ramathreya on 11/04/16.
 */
public class BaseSteps {
    protected WebDriver driver;

    @Before
    protected void setup() throws MalformedURLException {
        System.out.println("SETUP");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browsername", "chrome");
//        capabilities.setCapability("deviceSetup", "android");
//        capabilities.setCapability("appPackage", "com.android.chrome");
//        capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
        driver = new FirefoxDriver();
//        try {
////            driver = new WebDriver(new URL("http://www.google.com"), capabilities);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        driver.manage().window().maximize();
    }

    @After
    protected void exit() {
        // Screenshots can be taken here
        driver.quit();
    }
}
