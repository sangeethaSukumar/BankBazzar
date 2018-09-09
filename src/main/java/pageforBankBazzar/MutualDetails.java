package pageforBankBazzar;

import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods2;

public class MutualDetails extends ProjectMethods2{

	public MutualDetails Details()  {

		WebElement elefname = locateElement("name", "firstName");
		elefname.sendKeys("Nivi");
		return this;
	}
	
	public Invest viewMutualFunds() throws InterruptedException  {
		WebElement elevmf = locateElement("linktext","View Mutual Funds");
		Thread.sleep(2000);
		elevmf.click();
		return new Invest();
	}

	
}
