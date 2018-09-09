package pageforBankBazzar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.ProjectMethods2;

public class MutualFundInvest extends ProjectMethods2 {

	public MutualFundInvest DragSlider() throws InterruptedException {
		Thread.sleep(3000);
		int age = Integer.parseInt("32");
		Actions builder=new Actions(driver);
		WebElement eleslider = locateElement("xpath", "//div[@class='rangeslider__handle']");
		builder.dragAndDropBy(eleslider,(age-18)*8,0).perform();
		return this;
	}

	public MutualFundInvest SelectMonth() {

		WebElement elemonth = locateElement("linktext", "May 1986");
		elemonth.click();
		return this;
	}

	public MutualFundInvest SelectDay() {

		WebElement eleday = locateElement("xpath", "//div[@aria-label='day-5']");
		eleday.click();
		return this;
	}

	public MutualFundInvest getDoB() {

		WebElement eleDob = locateElement("xpath", "(//span[@class='Calendar_highlight_xftqk'])[3]");
		String DOB = eleDob.getText();
		System.out.println(DOB);
		return this;
	}

	public mutualAnnual SelectContinue() {

		WebElement elecontinue = locateElement("linktext", "Continue");
		elecontinue.click();
		return new mutualAnnual();
	}
	

}
