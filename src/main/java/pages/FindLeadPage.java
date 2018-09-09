package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage clickPhone() {
		WebElement elePhone = locateElement("xpath", "//span[text()='Phone']");
		click(elePhone);
		return this;
	}
	
	public FindLeadPage clickEmail() {
		WebElement eleEmail = locateElement("xpath", "//span[text()='Email']");
		click(eleEmail);
		return this;
	}
	
	
	public FindLeadPage typePhoneNum(String data) {
		WebElement elePhoneNum = locateElement("name", "phoneNumber");
		type(elePhoneNum, data);
		return this;
	}
	
	public FindLeadPage typeMailId(String data) {
		WebElement eleMail = locateElement("name", "emailAddress");
		type(eleMail, data);
		return this;
	}
	
	public FindLeadPage typeLeadId() {
		WebElement eleLeadid = locateElement("name", "id");
		type(eleLeadid, Leadid);
		return this;
	}
	
	public FindLeadPage clickFindLead() {
		WebElement eleFleads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFleads);
		return this;
	}
	
	public FindLeadPage verifylead(String errorMsg) {
		WebElement eleVerify = locateElement("class", "x-paging-info");
		verifyExactText(eleVerify, errorMsg);
		return this;
	}
	
	
	public ViewLeadPage clickfirstrecord() throws InterruptedException {
		Thread.sleep(1000);
		WebElement eleFRecord = locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(eleFRecord);
		return new ViewLeadPage();
	}
	
}









