package runners;

import org.junit.runner.JUnitCore;
import specdefinition.BaseSpecs;
import specdefinition.ProductSpecs;

/**
 * Created by ramathreya on 23/07/16.
 */

public class GalenRunnerTest {
    public static void main(String[] args) {
        JUnitCore.runClasses(ProductSpecs.class);
    }
}
