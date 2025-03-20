package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features/Search.feature"},
		glue= {"stepdefinitions","hooks"},
		plugin = {"pretty"},
		tags = "@Regression or @Smoke"
		
		)
public class SearchTest {

}
