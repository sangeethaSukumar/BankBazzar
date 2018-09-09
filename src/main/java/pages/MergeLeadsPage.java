package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	
	public FindLeadsPage clickFromLead() {
		WebElement eleFromLead = locateElement("xpath","//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a");
		click(eleFromLead);
		return new FindLeadsPage();
	}
	
	public FindLeadsPage clickToLead() {
		WebElement eleToLead = locateElement("xpath","//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a");
		click(eleToLead);
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage SwitchWindow(int num) {
		switchToWindow(num);
		return this;
		
	}
	
	public ViewLeadPage clickMerge()  {
		WebElement eleMerge = locateElement("linktext", "Merge");
		clickWithNoSnap(eleMerge);
		acceptAlert();
		return new ViewLeadPage();
	}
	
	
}









