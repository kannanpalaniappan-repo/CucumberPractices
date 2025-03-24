package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingSteps {

	Double billingAmount;
	Double taxAmount;
	Double finalAmount;
	
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	   
	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
	   this.billingAmount = Double.parseDouble(billingAmount);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
	   this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	   
	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String finalAmount) {
	   this.finalAmount = this.billingAmount+this.taxAmount;
	   System.out.println("expected final amount: "+ Double.parseDouble(finalAmount));
	   System.out.println("actual amount: "+ this.finalAmount);
	   
	   Assert.assertTrue(this.finalAmount == Double.parseDouble(finalAmount));
	}
}
