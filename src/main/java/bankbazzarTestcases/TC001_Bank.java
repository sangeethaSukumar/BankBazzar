package bankbazzarTestcases;

import wdMethods.ProjectMethods2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageforBankBazzar.HomePage;

public class TC001_Bank extends ProjectMethods2{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_BankBazzar";
		testCaseDescription ="Mutual Invesments";
		category = "Smoke";
		author= "Sangeetha";
		dataSheetName="TC001";
	}
	
	@Test
	public  void selectInvesments() throws InterruptedException   {
		new HomePage()
		.SelectInvesment()
		.Selectmutual()
		.Searchinvesments()
		.DragSlider()
		.SelectMonth()
		.SelectDay()
		.getDoB()
		.SelectContinue()
		.DragIncome()
		.clickcontinue()
		.selectBank()
		.Details()
		.viewMutualFunds()
		.MutualScheme();
	}

}


