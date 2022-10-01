package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "steps", tags = "@HWScenario1", monochrome = true, plugin = {
		"pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class LoginRunner {

}
