package com.wordpress.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.SelectItam;


public class SelectItamTest extends TestBase{
	public Logger log = Logger.getLogger(SelectItamTest.class);
	SelectItam SelectIta;
	
	public SelectItamTest() {
		super();
	}
	


	@BeforeMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void setup() {
		initialization();
		SelectIta = new SelectItam();
	}
	@Test(priority=1,groups = { "Regression"})
	public void loginPageTitleTest() throws Throwable {
	
		log.debug("loginPageTitleTest start");
		log.info("Login");
		Thread.sleep(3000);
		SelectIta.SelectItem(prop.getProperty("Itam"));
		//Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		log.debug("loginPageTitleTest ends");
	}
	
	
	
	@AfterMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void tearDown(ITestResult result) throws IOException {

		driver.quit();
	}


	
	

}
