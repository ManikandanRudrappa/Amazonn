package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.SearchPage;

public class Testcase1 extends ProjectSpecificMethods{
	@BeforeTest
	public void setData()
	{
		 NewFileName = "TestData";
	}
	@Test(dataProvider = "senddata")
	
	public void TestCase1(String MobileName)
	{
		new SearchPage().enterMobileName(MobileName)
		.printMobPrice()
		.clickImage()
		.DeliveryDate()
		.ClickAddtoCart()
		.dispmsg()
		.ProceedtoPay()
		.clickContinue()
		.DispErrorMsg();
	}

}
