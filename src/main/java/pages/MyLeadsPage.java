package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	@And("click CreateLead")
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	
	public FindLeadPage clickFindLead() {
		WebElement eleFindLead = locateElement("linktext", "Find Leads");
		click(eleFindLead);
		return new FindLeadPage();
	}
	
	public MergeLeadsPage clickMergeLead() {
		WebElement eleMergeLead = locateElement("linktext", "Merge Leads");
		click(eleMergeLead);
		return new MergeLeadsPage();
	}
	
}









