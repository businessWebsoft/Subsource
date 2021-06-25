package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;

public class SentPage {
	@FindBy(xpath="//p[contains(text(),'Quiz assigned succesfully!')]")
	WebElement quiz_Success_Pop_Up;
	@FindBy(xpath="//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement pop_Up_Cancel;
	@FindBy(xpath="//a[contains(text(),' Message ')]")
	WebElement message_Page;
	@FindBy(xpath="//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement pop_Up_cancel;
	
	
	WebDriver driver;
	WebDriverUtil util;
	public SentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String get_Quiz_Title(String Quizname) {
		String name=DriverFactory.getDriver().findElement(By.xpath("//td[contains(text(),'"+Quizname+"')]")).getText();
		return name;
	}
	public String get_Total_Recipient_List() {
		String name=DriverFactory.getDriver().findElement(By.xpath("//td[contains(text(),'sdvsdv')]/parent::tr/td[5]")).getText();
		return name;
	}
	public String get_Quiz_Successfull_Message() {
		String text=quiz_Success_Pop_Up.getText();
		pop_Up_Cancel.click();
		return text;
	}
	public void clickon_Message() throws InterruptedException {
		util=new WebDriverUtil();
		util.waitForElementJavaScript(message_Page);
		//message_Page.click();
		Thread.sleep(3000);
	}
	public void clickon_Pop_Up_Cancel() {
		pop_Up_cancel.click();
	}
}
