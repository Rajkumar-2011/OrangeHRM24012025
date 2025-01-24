package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimPageStep extends BaseClass {
    
	private static PimPage pim;
	@Given("user click on add Employee")
	public void user_click_on_add_employee() {
		
		pim=new PimPage();
		
		pim.cliclOnAddEmployee();
	   
	}

	@When("user enter {string} firstname and {string} lastname")
	public void user_enter_firstname_and_lastname(String FirstName, String LastName) {
	      pim.enterUserDetails(FirstName,LastName);
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		
		pim.clickOnSaveButton();
	 
	}
}
