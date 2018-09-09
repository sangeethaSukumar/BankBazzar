package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	
public static ChromeDriver driver;
	
	@Given("Logininto the Application")
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login Success");
	}
	
	@And("Click Crmsfa")
	public void crmsfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Enter to Create LeadPage")
	public void clead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter mandatoryfields (.*) and (.*) and (.*)")
	public void enterfields(String cname, String fname,String lname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	
	@When("User clicks the createLead")
	public void cleada()
	{
		driver.findElementByName("submitButton").click();
	}
	
	@Then("CreateLead should be success")
	public void verifylead()
	{
		//String lid=driver.findElementById("").getText();
		System.out.println("Lead created successfully");
		driver.close();
	}
	

}
