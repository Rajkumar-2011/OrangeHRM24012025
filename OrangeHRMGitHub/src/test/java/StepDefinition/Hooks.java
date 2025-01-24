package StepDefinition;

import BaseLayer.BaseClass;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseClass{
	
	@BeforeAll
	
	public static void Refresh()
	{
		
		getDriver().navigate().refresh();
	}

}
