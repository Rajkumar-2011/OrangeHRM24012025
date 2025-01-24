package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath = "//div[@class='oxd-brand-banner']")
	private WebElement logo;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement Pim;
		
	public HomePage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	public boolean ValidateLogo() {
		
		return this.logo.isDisplayed();
	}
	
	public String ValidateTitle() {
		
		return getDriver().getTitle();
				
	}
	
	public String ValidateURL() {
		
		return getDriver().getCurrentUrl();
		
	}
	
	public void clickPim() {
		
		this.Pim.click();
		
	}
	
 
}
