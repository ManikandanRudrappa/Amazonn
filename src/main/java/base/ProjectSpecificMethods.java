package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.Excel1;

public class ProjectSpecificMethods
{
	public static ChromeDriver driver;
	public String NewFileName;
	@BeforeMethod
	public void login() 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
    
	}
	@AfterMethod
	public void logout()
	{
		driver.close();
	}

	@DataProvider
	public String[][] senddata() throws IOException
	{
		Excel1 newExcel= new Excel1();
		return newExcel.readExcel(NewFileName);		
	}

}


	
	