package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC002_EditLead";
		testCaseDescription ="Edit a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public  void editLead(String phnNumber, String updateCname)  throws InterruptedException {
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.typePhoneNum(phnNumber)
		.clickFindLead()
		.clickfirstrecord()
		.clickEdit()
		.typecName(updateCname)
		.clickUpdate();			
		
	}

}
