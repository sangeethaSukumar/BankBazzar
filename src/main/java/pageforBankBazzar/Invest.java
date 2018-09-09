package pageforBankBazzar;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.ProjectMethods2;

public class Invest extends ProjectMethods2{
	
	public Invest MutualScheme() throws InterruptedException  {
		

		List<WebElement> schemename = driver.findElementsByClassName("js-offer-name");
		for(WebElement eachScheme:schemename)
		{
			String S=eachScheme.getText();
			System.out.println(S);			
			WebElement eleamount = locateElement("xpath", 
					"//span[contains(text(),'"+eachScheme.getText()+"')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
			System.out.println(eleamount.getText());
		}
		
		return this;
	}

}
