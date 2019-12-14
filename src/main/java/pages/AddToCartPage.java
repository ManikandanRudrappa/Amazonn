package pages;

import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class AddToCartPage extends ProjectSpecificMethods
{
	public AddToCartPage DeliveryDate() 
	{
		String DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Date :" +DeliveryDate);
		return this;
	}
	
	public ShoppingCartPage ClickAddtoCart()
	{
		driver.findElementById("add-to-cart-button").click();
		return new ShoppingCartPage();
	}
	
}
