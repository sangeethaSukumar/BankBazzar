package pageforBankBazzar;

import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods2;

public class MutualFunds extends ProjectMethods2 {
	
	public MutualFundInvest Searchinvesments() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement eleSinvesments = locateElement("linktext", "Search for Mutual Funds");
		eleSinvesments.click();
		return new MutualFundInvest();
	}
	

}
