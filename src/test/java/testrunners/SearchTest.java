package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features/Search.feature"},
		glue= {"stepdefinitions"},
		plugin = {"pretty"}
		
		)
public class SearchTest {

}
