package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class OpenTaps extends ProjectMethods{
	
	public OpenTaps typecName(String data) {
		WebElement elecName = locateElement("id", "updateLeadForm_companyName");
		type(elecName, data);
		return this;
	}
	
	public ViewLeadPage clickUpdate() {
		WebElement eleUpdate = locateElement("xpath", "//input[@class='smallSubmit']");
		click(eleUpdate);
		return new ViewLeadPage();
	}

	public FindLeadPage clickFindLead() {
		WebElement eleFindLead = locateElement("linktext", "Find Leads");
		click(eleFindLead);
		return new FindLeadPage();
	}
	
	
}









