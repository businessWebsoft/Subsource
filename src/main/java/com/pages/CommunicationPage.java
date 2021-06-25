package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.WebDriverUtil;

public class CommunicationPage {
	@FindBy(xpath = "//button[@class='btn-sub-menu']")
	WebElement email_Employee_Drop_down;
	WebDriver driver;
	WebDriverUtil util ;
	
	public CommunicationPage(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	public void clickon_Email_Employee_Drop_Down() throws InterruptedException {
		util=new WebDriverUtil();
		/*JavascriptExecutor jsDriver = (JavascriptExecutor) DriverFactory.getDriver();
		NgWebDriver ngDriver = new NgWebDriver(jsDriver);
		ngDriver.withRootSelector("\"app-root\"").waitForAngularRequestsToFinish();*/
		util.waitForElementToBeClickable(email_Employee_Drop_down);
		//email_Employee_Drop_down.click();
		util.waitForElementToBeClickable(email_Employee_Drop_down);
		util.waitForElementJavaScript(email_Employee_Drop_down);
		//email_Employee_Drop_down.click();
		//Thread.sleep(2000);
		//email_Employee_Drop_down.click();	
	}
}
