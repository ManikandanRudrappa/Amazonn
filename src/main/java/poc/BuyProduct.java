package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {

	public ChromeDriver driver;
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Search = driver.findElementById("twotabsearchtextbox");
		Search.sendKeys("Samsung Galaxy M30");
		Search.sendKeys(Keys.ENTER);
		String Price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("The price of mob is "+ Price);
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		List<String> ListWindows = new ArrayList(AllWindows);
		driver.switchTo().window(ListWindows.get(1));
		
		String DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Date :" +DeliveryDate);
		
		driver.findElementById("add-to-cart-button").click();
		
		boolean displayed = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").isDisplayed();
		System.out.println(displayed);
		
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		driver.findElementById("continue").click();
		
		WebElement ErrorMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]");
		System.out.println("The message is " +ErrorMsg);
		
	}

}
