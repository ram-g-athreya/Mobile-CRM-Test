package stepdefinition; /**
 * Created by ramathreya on 11/04/16.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        /*format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},*/
        features = {"src/test/resources/features"},
        glue = {"stepdefinition"},
        monochrome = true
)

public class CukesRunnerTest {

}