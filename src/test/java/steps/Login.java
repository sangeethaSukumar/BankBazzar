package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	public static ChromeDriver driver;
	
	@Given("launch the browser")
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("maximize the broswe")
	public void maximizewindow()
	{
		driver.manage().window().maximize();
	}
	
	@And("Set timeouts")
	public void settimeout()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("Enter URL")
	public void enterurl()
	{
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@And("Enter userName As (.*)")
	public void enterusername(String uname)
	{
		driver.findElementById("username").sendKeys(uname);
	}
	
	@And("Enter Password As (.*)")
	public void enterpassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When("User clicks the Login")
	public void clicklogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Login should be successful")
	public void verifylogin()
	{
		System.out.println("Login is success");
		driver.close();
	}
	
	@But("Login should be Failed")
	public void Faillogin()
	{
		System.out.println("Login is failed");
		driver.close();
	}
	
	

}
