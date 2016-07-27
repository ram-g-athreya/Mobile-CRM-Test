package selenium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ramathreya on 23/07/16.
 */
public class BaseDriver {
    public static final String FIREFOX_DRIVER = "Firefox Driver";
    public static final String CHROME_DRIVER = "Chrome Driver";

    public static final String ANDROID_DRIVER = "Chrome Driver";
    public static final String IOS_DRIVER = "Chrome Driver";

    private static final String DESKTOP_PLATFORM = "Desktop Platform";
    private static final String MOBILE_PLATFORM = "Mobile Platform";

    private String driverPlatform;
    private String driverName;
    WebDriver driver;
    AppiumDriver mobileDriver;

    public BaseDriver(String driverName) throws MalformedURLException {
        if(driverName.equals(FIREFOX_DRIVER)){
            driver = new FirefoxDriver();
            driverPlatform = DESKTOP_PLATFORM;
        }
        else if(driverName.equals(CHROME_DRIVER)) {
            driver = new FirefoxDriver();
            driverPlatform = DESKTOP_PLATFORM;
        }
        else if(driverName.equals(ANDROID_DRIVER)) {
            mobileDriver = new AndroidDriver(new URL(""), null) {
                @Override
                public WebElement scrollTo(String s) {
                    return null;
                }

                @Override
                public WebElement scrollToExact(String s) {
                    return null;
                }
            };
            driverPlatform = MOBILE_PLATFORM;
        }
    }

    public <Driver extends WebDriver> Driver getWebDriver() {
        return (Driver) driver;
    }

    public <Driver extends AppiumDriver> Driver getMobileDriver() {
        return (Driver) mobileDriver;
    }
}
