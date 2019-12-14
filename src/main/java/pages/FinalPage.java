package pages;

import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class FinalPage extends ProjectSpecificMethods  

{
	public FinalPage clickContinue()
	{
		driver.findElementById("continue").click();
		return this;
	}
	public FinalPage DispErrorMsg()
	{
		WebElement ErrorMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]");
		System.out.println("The message is " +ErrorMsg);
		return this;
	}

}
