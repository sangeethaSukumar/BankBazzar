package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	@Before
	public void beforeCucumber(Scenario sc)
	{
		System.out.println("Scenario name: "+sc.getName());
		System.out.println("Scenario ID is: " +sc.getId());
		startResult(); //Before Suite
		//Before Class
		testCaseName = sc.getName(); 
		testCaseDescription = sc.getId();
		category = "Smoke";
		author= "Babu";
		//Before Method
		startApp("chrome","http://leaftaps.com/opentaps");
	
	}
	
	@After
	public void afterCucumber(Scenario sc)
	{
		System.out.println("Scenario status: "+sc.getStatus());
		//Aftermethod
		closeAllBrowsers();
		//AfterSuite
		stopResult();
	}

}
