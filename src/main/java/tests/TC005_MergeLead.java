package tests;

import org.testng.annotations.BeforeClass;

//import org.junit.Test;

import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC005_MergeLead";
		testCaseDescription ="Merge two leads";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String fromLead, String toLead,String errorMag) throws InterruptedException   {
		new MyHomePage()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.SwitchWindow(1)
		.typeLeadID(fromLead)
		.clickFindLeads()
		.selectLead()
		.SwitchWindow(0)
		.clickToLead()
		.SwitchWindow(1)
		.typeLeadID(toLead)
		.clickFindLeads()
		.selectLead()
		.SwitchWindow(0)
		.clickMerge();
		
		}

}
