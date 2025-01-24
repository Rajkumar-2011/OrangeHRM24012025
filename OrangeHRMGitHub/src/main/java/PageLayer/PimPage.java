package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PimPage extends BaseClass {

	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
    @FindBy(xpath="//button[text()=' Save ']")
	private WebElement savebutton;
    
    public PimPage() {
    	PageFactory.initElements(getDriver(), this);  
}
   public void cliclOnAddEmployee() {
	   this.addEmployee.click();
   }
   
   public void enterUserDetails(String Firstname,String Lastname) {
	   this.firstname.sendKeys(Firstname);
	   this.lastname.sendKeys(Lastname);
   }
   
   public void clickOnSaveButton() {
	   this.savebutton.click();
   }
}

