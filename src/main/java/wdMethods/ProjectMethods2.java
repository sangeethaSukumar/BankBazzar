package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;

public class ProjectMethods2 extends SeMethods{

	public String dataSheetName;
	public String Leadid;
	@Parameters({"url"})
	
	@BeforeMethod
	public void login(String url) {
		startApp("chrome", url);
	}
	
	@AfterMethod
	public void close() {
		//closeAllBrowsers();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() {
	return DataInputProvider.getSheet(dataSheetName);
	}
	
	
	
	
	
	
	
	
	
}