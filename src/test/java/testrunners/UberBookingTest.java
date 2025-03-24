package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features/Uber.feature"},
	glue = {"stepdefinitions"},
	tags = "not @regression",
	plugin = {"pretty",
			"json:target/MyReports/reports.json",
			"junit:target/MyReports/reports.xml"},
		/* publish = true, */
	monochrome = false,
	dryRun = false
	
)
public class UberBookingTest {

}
