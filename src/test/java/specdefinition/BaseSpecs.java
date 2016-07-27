package specdefinition;

import com.fasterxml.jackson.databind.deser.Deserializers;
import com.galenframework.api.Galen;
import com.galenframework.junit.GalenJUnitTestBase;
import com.galenframework.reports.model.LayoutReport;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.BaseDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import static interfaces.Config.BASE_URL;

public class BaseSpecs extends GalenJUnitTestBase {
    protected String url;
    protected String specFile;
    protected DeviceSetup deviceSetup;
    protected BaseDriver baseDriver;

    @Override
    public WebDriver createDriver() {
        return baseDriver.getWebDriver();
    }

    public BaseSpecs(final DeviceSetup deviceSetup, String url, String specFile) throws MalformedURLException {
        super();
        this.baseDriver = new BaseDriver(BaseDriver.FIREFOX_DRIVER);
        this.deviceSetup = deviceSetup;
        this.url = url;
        this.specFile = "/specs/" + specFile;
    }

    public static class DeviceSetup {
        private final Dimension screenSize;
        private final List<String> tags;

        public DeviceSetup(Dimension screenSize, String... tags) {
            this.screenSize = screenSize;
            this.tags = Arrays.asList(tags);
        }

        public Dimension getScreenSize() {
            return screenSize;
        }

        protected List<String> getTags() {
            return tags;
        }
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> devices() {
        return Arrays.asList(new Object[][] {
                {new DeviceSetup(new Dimension(1280, 800), "desktop")},
                {new DeviceSetup(new Dimension(320, 480), "mobile")},
                {new DeviceSetup(new Dimension(1024, 768), "tablet")}
        });
    }

    protected void run() throws IOException {
        try {
            load(BASE_URL + url, deviceSetup.getScreenSize().getWidth(), deviceSetup.getScreenSize().getHeight());
            checkLayout(specFile, deviceSetup.getTags());
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
