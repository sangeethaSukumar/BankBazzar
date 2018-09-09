package pageforBankBazzar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.ProjectMethods2;

public class HomePage extends ProjectMethods2{
	
	public HomePage SelectInvesment() {
		Actions builder=new Actions(driver);
		WebElement eleInvesment = locateElement("linktext", "INVESTMENTS");
		builder.moveToElement(eleInvesment).perform();
		return this;
	}
	
	public MutualFunds Selectmutual() {
		WebElement mutual =locateElement("linktext", "Mutual Funds");
		mutual.click();
		return new MutualFunds();
	}
	
	

}
