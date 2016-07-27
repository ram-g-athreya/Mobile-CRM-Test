package specdefinition;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import static java.util.Arrays.asList;

/**
 * Created by ramathreya on 23/07/16.
 */
public class ProductSpecs extends BaseSpecs {

    public ProductSpecs(final DeviceSetup deviceSetup) throws MalformedURLException {
        super(deviceSetup, "/product/100", "Product.gspec");
    }

    @Test
    public void verifyProductPage() throws Exception {
        run();
    }

}
