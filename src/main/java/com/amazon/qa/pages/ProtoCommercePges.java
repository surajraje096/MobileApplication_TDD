package com.amazon.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class ProtoCommercePges extends TestBase{

	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	WebElement shop;
	
	@FindBy(xpath = "(//a[@class='list-group-item'])[2]")
	WebElement catogary;
	
	@FindBy(xpath = "//button[text()='Add ']")
	WebElement add;
	
	@FindBy(xpath = "//a[contains(@class,'nav-link btn')]")
	WebElement chekedOut;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement chekedbtn;
	
	@FindBy(id = "country") 
	WebElement location;
	
	@FindBy(xpath = "//label[@for='checkbox2']")
	WebElement AgreCheck;
	
	@FindBy(xpath = "//input[contains(@class,'btn btn-success')]")
	WebElement purchasebtn;
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-success')]")
	WebElement msg;
	
	@FindBy(xpath = "(//input[@name='name'])[1]")
	WebElement Name;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(id = "exampleInputPassword1")
	WebElement pass;

	@FindBy(id = "exampleCheck1") 
	WebElement check;

	@FindBy(id = "exampleFormControlSelect1") 
	WebElement gender;
	
	@FindBy(xpath = "//*[@id=\"exampleFormControlSelect1\"]/option[1]") 
	WebElement male;

	@FindBy(id = "inlineRadio1") 
	WebElement status;
	
	@FindBy(name = "bday") 
	WebElement bday;
	
	@FindBy(name = "bday") 
	WebElement date;
	
	@FindBy(xpath = "//input[@class='btn btn-success']") 
	WebElement submit;
	
	public ProtoCommercePges() {
		PageFactory.initElements(driver, this);
	}
	
	public void ProtoCommerce() throws Throwable {
		Action.click(driver, shop);
		Action.click(driver, catogary);
		Action.type(Name, prop.getProperty("name"));
		Action.type(email, prop.getProperty("email"));
		Action.type(pass, prop.getProperty("pass"));
		Action.click(driver, check);
		Action.click(driver, gender);
		Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		select.selectByVisibleText("Male");
		Action.click(driver, status);
		Action.type(bday, prop.getProperty("bday"));
		Action.click(driver, submit);
		Action.click(driver, shop);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", add);
		 List<WebElement> size = driver.findElements(By.xpath("//button[text()='Add ']"));
		 size.get(1).click();
		Action.click(driver, chekedOut);	
		Action.click(driver, chekedbtn);
		Action.type(location, "pune");
		Thread.sleep(5000);
		Action.click(driver,AgreCheck);
		Action.click(driver,purchasebtn);
		String su = msg.getText();
		System.out.println(su);
		
	}
	

	
	
	
	
}
