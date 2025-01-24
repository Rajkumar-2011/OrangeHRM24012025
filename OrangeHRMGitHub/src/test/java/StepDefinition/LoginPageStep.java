package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class LoginPageStep extends BaseClass{
	
	
	private LoginPage login;
	
	@Given("user enter {string} username")
	public void user_enter_username(String username) {
	 BaseClass.initialization();
	  login = new LoginPage();
	  login.usernameLoginFunctionality(username);
	    
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		
	
		login.buttonLoginFunctionality();
	    
	}

	@Then("user capture warning error message on password text box")
	public void user_capture_warning_error_message_on_password_text_box() {
	    
		String passwordWarning = login.passwordWarningFunctionality();
	   
	   Assert.assertEquals(passwordWarning, "Required"); 
	    
	}

	@Given("user enter {string} password")
	public void user_enter_password(String Password) {
	    login.passwordLoginFunctionality(Password);
	    
	}

	@Then("user capture warning error message on username text box")
	public void user_capture_warning_error_message_on_username_text_box() {
	    String usernameWarning = login.usernameWarningFunctionality();
	    Assert.assertEquals(usernameWarning, "Required");
	    
	}

	@Then("user capture invalid warning error message")
	public void user_capture_invalid_warning_error_message() {
		String invalidCredentialWarning = login.invalidCredentialsWarningFunctionality();
	    Assert.assertEquals(invalidCredentialWarning, "Invalid credentials");
	    
	    
	}

}
