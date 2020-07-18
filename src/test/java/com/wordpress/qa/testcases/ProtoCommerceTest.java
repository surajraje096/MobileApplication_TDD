package com.wordpress.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.ProtoCommercePges;


public class ProtoCommerceTest extends TestBase{

	public Logger log = Logger.getLogger(ProtoCommerceTest.class);
	
	ProtoCommercePges ProtoCommercePge;
	
	@BeforeMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void setup() {
		initialization();
		ProtoCommercePge = new ProtoCommercePges();
	}
	@Test(priority=1,groups = { "Regression"})
	public void loginPageTitleTest() throws Throwable {
	
		log.debug("loginPageTitleTest start");
		log.info("Login");
		Thread.sleep(3000);
		ProtoCommercePge.ProtoCommerce();
		log.debug("loginPageTitleTest ends");
	}
	
	
	
	@AfterMethod(groups = { "Smoke", "Regression","SytemTest" })
	public void tearDown(ITestResult result) throws IOException {

		//driver.quit();
	}
	
}
