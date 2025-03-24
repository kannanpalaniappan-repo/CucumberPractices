package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("user navigates on registration page");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	    List<List<String>> userLists = dataTable.asLists(String.class);
	    
	    for(List<String> userList: userLists) {
	    	System.out.println(userList);
	    }
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("user registration should be successful");
	   
	}

}
