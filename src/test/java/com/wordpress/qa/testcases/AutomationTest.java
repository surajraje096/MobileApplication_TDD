package com.wordpress.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AutomationPage;
import com.amazon.qa.pages.LoginPage;


public class AutomationTest extends TestBase {
	public Logger log = Logger.getLogger(AutomationTest.class);
	AutomationPage AutomationPa;

	public AutomationTest() {
		super();
	}


	@BeforeMethod(groups = { "Smoke", "Regression", "SytemTest" })
	public void setup() {
		initialization();
		AutomationPa = new AutomationPage();
	}

	/*
	 * @Test(priority=2,groups = { "Smoke","SytemTest" }) public void
	 * loginPageTitleTest() throws Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login"); Thread.sleep(3000);
	 * AutomationPa.RadioBTN(); AutomationPa.DropDown();
	 * AutomationPa.TextBox(prop.getProperty("password"));
	 * AutomationPa.CheckOption(); //AutomationPa.SwitchWindow();
	 * //Assert.assertEquals(title,
	 * "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
	 * ); log.debug("loginPageTitleTest ends"); }
	 */
	/*
	 * @Test(priority=1,groups = { "Smoke","SytemTest" }) public void Switchwindow()
	 * throws Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login");
	 * AutomationPa.SwitchWindow(); log.debug("loginPageTitleTest ends"); }
	 */

	/*
	 * @Test(priority=1,groups = { "Smoke","SytemTest" }) public void Switchwindow()
	 * throws Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login");
	 * AutomationPa.NewWindow(); log.debug("loginPageTitleTest ends"); }
	 */

	/*
	 * @Test(priority=1,groups = { "Smoke","SytemTest" }) public void Alert() throws
	 * Throwable { ExtentClass.extentTest =
	 * ExtentClass.extent.startTest("VerifyloginPageTitleTest");
	 * log.debug("loginPageTitleTest start"); log.info("Login");
	 * AutomationPa.GetAlert("Suraj"); log.debug("loginPageTitleTest ends"); }
	 */

/*	@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void Alert() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.HideText("Suraj Patil");
		log.debug("loginPageTitleTest ends");
	}*/
	/*@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void WebTable() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.WebTable();
		log.debug("loginPageTitleTest ends");
	}*/
	
	/*@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void WebTable() throws Throwable {
		ExtentClass.extentTest = ExtentClass.extent.startTest("VerifyloginPageTitleTest");
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.MouseMove();
		log.debug("loginPageTitleTest ends");
	}*/

	@Test(priority = 1, groups = { "Smoke", "SytemTest" })
	public void WebTable() throws Throwable {
;
		log.debug("loginPageTitleTest start");
		log.info("Login");
		AutomationPa.Iframe();
		log.debug("loginPageTitleTest ends");
	}
	@AfterMethod(groups = { "Smoke", "Regression", "SytemTest" })
	public void tearDown(ITestResult result) throws IOException {
		
		driver.quit();
	}

	

}
