package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\main\\resources\\Features\\FreeCRMLogin.feature"},
		glue = "StepDefinations",
		plugin = {"pretty","html:target/cucumbmer-reports/report1.html"}
		)

public class runner extends AbstractTestNGCucumberTests{
/*empty class*/
}