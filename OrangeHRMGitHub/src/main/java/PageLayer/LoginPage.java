package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Required']")
	WebElement passwordwarning;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement usernamewarning;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement invalidcredentials;
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void usernameLoginFunctionality(String UserName)
	{
		username.sendKeys(UserName);
	}
	
	public void passwordLoginFunctionality(String Password)
	{
		password.sendKeys(Password);
	}

	public void buttonLoginFunctionality()
	{
		loginButton.click();
	}
	
	public String  passwordWarningFunctionality()
	{
		return passwordwarning.getText();
	}
	
	public String usernameWarningFunctionality()
	{
		return usernamewarning.getText();
	}

	public String invalidCredentialsWarningFunctionality()
	{
		return invalidcredentials.getText();
	}
}
