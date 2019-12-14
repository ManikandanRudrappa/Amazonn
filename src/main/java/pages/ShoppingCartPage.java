package pages;

import base.ProjectSpecificMethods;

public class ShoppingCartPage extends ProjectSpecificMethods
{
	public ShoppingCartPage dispmsg()
	{
		boolean displayed = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").isDisplayed();
		System.out.println(displayed);
		return this;
	}
	public FinalPage ProceedtoPay()
	{
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		return new FinalPage();
	}
   
}
