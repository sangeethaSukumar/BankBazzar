package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public OpenTaps clickEdit() {
		WebElement eleEdit = locateElement("xpath", "//a[text()='Edit']");
		click(eleEdit);
		return new OpenTaps();
	}
	
	public OpenTaps clickDelete() {
		WebElement eleEdit = locateElement("linktext", "Delete");
		WebElement id = locateElement("id","viewLead_companyName_sp");
		Leadid= id.getText();
		click(eleEdit);
		return new OpenTaps();
	}
	
	public FindLeadsPage ClickFindLead()
	{
		WebElement Fl=locateElement("linktext", "Find Leads");
		click(Fl);
		return new FindLeadsPage();
	}
}









