package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage typeLeadID(String data) {
		WebElement eleLeadID = locateElement("xpath", "//input[@name='id']");
		type(eleLeadID, data);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		WebElement eleFlead = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFlead);
		Thread.sleep(2000);
		return this;
	}
	
	public FindLeadsPage SwitchWindow(int num) {
		switchToWindow(num);
		return this;
		
	}
	
	public MergeLeadsPage selectLead() throws InterruptedException
	{
		WebElement Selectlead=locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(Selectlead);
		Thread.sleep(2000);
		return new MergeLeadsPage();
		
	}
	
}









