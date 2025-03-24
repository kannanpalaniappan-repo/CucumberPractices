package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/Registration.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty",
				"json:target/MyReports/reports.json",
				"junit:target/MyReports/reports.xml"},
		monochrome = false,
		dryRun = false
)
public class RegistrationTest {

}
