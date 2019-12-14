package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class SearchPage extends ProjectSpecificMethods
{
	public SearchPage enterMobileName(String MobileName)
	{
		WebElement Search = driver.findElementById("twotabsearchtextbox");
		Search.sendKeys(MobileName);
		Search.sendKeys(Keys.ENTER);
		return this;
	}
	public SearchPage printMobPrice()
	{
		String Price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("The price of mob is "+ Price);
		return this;
	}
	public AddToCartPage clickImage()
	{
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Set<String> AllWindows = driver.getWindowHandles();
		List<String> ListWindows = new ArrayList(AllWindows);
		driver.switchTo().window(ListWindows.get(1));
		return new AddToCartPage();
		
	}
	
	
}








