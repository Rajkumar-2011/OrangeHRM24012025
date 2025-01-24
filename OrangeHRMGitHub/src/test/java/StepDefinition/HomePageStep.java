package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;

public class HomePageStep extends BaseClass{
	
	private static HomePage homepage;
	
	@Given("user validate logo")
	public void user_validate_logo() {
		
		homepage = new  HomePage();
		
		Assert.assertEquals(homepage.ValidateLogo(),true);
					    
	}
	@Given("user validate Title")
	public void user_validate_title() {
		
		String title = homepage.ValidateTitle();
		
		Assert.assertEquals(title.contains("Orange"), true);
	     
	}
	@Given("user validate current URL")
	public void user_validate_current_url() {
		
		String url = homepage.ValidateURL();
		
		Assert.assertEquals(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"),true);
	     
	}
	@Given("user click on pimlink")
	public void user_click_on_pimlink() {
	    
		homepage.clickPim();
	}

}
