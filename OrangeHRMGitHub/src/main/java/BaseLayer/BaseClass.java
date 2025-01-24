package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertiesClass;

public class BaseClass {

	private static ThreadLocal <WebDriver> td = new ThreadLocal <WebDriver>();
	
	public static WebDriver getDriver() {
		
		return td.get();
		}
	public static void initialization() {
		
		String browsername=PropertiesClass.getProperty("BROWSER_NAME");
		
		if(browsername.equalsIgnoreCase("Chrome"))
				{
			td.set(new ChromeDriver());
				}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			td.set(new EdgeDriver());
			
		}
		else if(browsername.equalsIgnoreCase("incognito"))
		{
			
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
			
		}
		else if(browsername.equalsIgnoreCase("headless"))
		{
			
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
			
		}
		else
		{
			System.out.println("Please enter the valid browser name");
		}
	getDriver().manage().window().maximize();
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	getDriver().manage().deleteAllCookies();
	getDriver().get(PropertiesClass.getProperty("SIT_URL"));

}
	 
}
