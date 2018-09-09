package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeClass(groups="common")
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testCaseDescription ="Delete a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC003";
		
	}
	@Test(dataProvider="fetchData")
	public  void deleteLead(String email, String errorMsg) throws InterruptedException   {
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.clickEmail()
		.typeMailId(email)
		.clickFindLead()
		.clickfirstrecord()
		.clickDelete()
		.clickFindLead()
		.typeLeadId()
		.clickFindLead()
		.verifylead(errorMsg);		
		}

}
