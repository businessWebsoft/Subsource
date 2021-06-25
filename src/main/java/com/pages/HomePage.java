package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.WebDriverUtil;

public class HomePage
	{
		@FindBy(xpath = "//a[@class='sidebar-toggle']")
		WebElement home_Page;
		@FindBy(xpath = "//span[contains(text(),'Preferences')]")
		WebElement settings;
		@FindBy(xpath = "//a[contains(text(),'Account Settings')]")
		WebElement account_Settings;
		@FindBy(xpath="//span[contains(text(),'Human Resources')]")
		WebElement human_Resources;
		@FindBy(xpath = "//span[contains(text(),'Human Resources')]")
		WebElement humanResources;
		@FindBy(xpath = "//a[contains(text(),'Hire New Employee')]")
		WebElement hireNewEmployee;

		
		WebDriver driver;
		WebDriverUtil util;
		
		public HomePage(WebDriver driver) 
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
	
		public void Clickon_HomePage() throws InterruptedException 
			{
			util=new WebDriverUtil();
			util.waitForElementToBeClickable(home_Page);
			util.waitForElementJavaScript(home_Page);
			}
		public void Clickon_Hire_New_Employee() throws InterruptedException {
			util = new WebDriverUtil();
			util.waitForElementToBeClickable(hireNewEmployee);
			util.waitForElementJavaScript(hireNewEmployee);
		}
		public void Clickon_Human_Resources() throws InterruptedException {
			util = new WebDriverUtil();
			util.waitForElementToBeClickable(humanResources);
			util.waitForElementJavaScript(humanResources);
		}
	
		public void clickon_Settings() throws InterruptedException 
			{
			util=new WebDriverUtil();
			util.waitForElementToBeClickable(settings);
			util.waitForElementJavaScript(settings);
			}
	
		public void clickon_Account_Settings() throws InterruptedException 
			{
			util=new WebDriverUtil();
			util.waitForElementToBeClickable(account_Settings);
			util.waitForElementJavaScript(account_Settings);
			}
		public void clickon_HumanResources() {
			util=new WebDriverUtil();
			util.waitForElementToBeClickable(human_Resources);
			util.waitForElementJavaScript(human_Resources);
		}
	}
