package pageforBankBazzar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import wdMethods.ProjectMethods2;

public class mutualAnnual extends ProjectMethods2{

	public mutualAnnual DragIncome() throws InterruptedException {

		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		WebElement eleslider = locateElement("xpath", "//div[@class='rangeslider__handle-label']");
		builder.dragAndDropBy(eleslider,207,0).perform();
		return this;
	}

	public mutualAnnual clickcontinue()  {

		WebElement elecontinue = locateElement("linktext", "Continue");
		elecontinue.click();
		return this;
	}

	public MutualDetails selectBank() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement eleBank = locateElement("xpath", "//span[text()='HDFC']");
		eleBank.click();
		return new MutualDetails();
	}



}
