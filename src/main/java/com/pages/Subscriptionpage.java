package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;

public class Subscriptionpage {

	@FindBy(xpath = "// th[contains(text(),' Action ')]/i")
	WebElement plus_Button;
	@FindBy(xpath = "//input[@style='width: 160px;margin: 0 auto;text-align:left !important;padding: 0 8px;']")
	WebElement subscription_name;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/select[1]")
	WebElement template_Drop_Down;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/select[1]")
	WebElement recipients_Drop_Down;
	@FindBy(xpath = "//label[contains(text(),'Select Role')]")
	WebElement role_Button;
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/p-multiselect[1]/div[1]/div[4]/div[1]/div[1]/div[2]")
	WebElement select_All_Role_Check_Box;
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/p-multiselect[1]/div[1]/div[4]/div[1]/a[1]/span[1]")
	WebElement select_Role_Cancel_Button;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/select[1]")
	WebElement frequency_Button;
	@FindBy(id = "q-datepicker_3")
	WebElement strat_Date;
	@FindBy(xpath = "//body[1]/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/i[1]")
	WebElement save_Button;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/table[1]/thead[1]/tr[2]/th[3]")
	WebElement next_Button;
	@FindBy(xpath = "//a[contains(text(),' Message ')]")
	WebElement message_Page;
	@FindBy(xpath = "//th[@class='datepicker-switch'][1]")
	WebElement calander_Text;
	@FindBy(xpath = "//th[@class='next'][1]")
	WebElement calander_Next_Button;
	@FindBy(xpath = "//tbody/tr[1]/td[@class='day'][3]")
	WebElement clickon_Date;
	@FindBy(xpath="//span[contains(text(),'T_015')]/parent::td/following-sibling::td[4]/span")
	WebElement getDate_Text;
	@FindBy(xpath="//p[contains(text(),'Rule created successfully.')]")
	WebElement save_PopUp;
	@FindBy(xpath="//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement pop_Up_Cancel;
	@FindBy(xpath="//i[@class='fa fa-check green-icon cursor-pointer']/parent::span/parent::td/preceding-sibling::td[7]/div/span/input")
	WebElement change_SubScription_Name;
	@FindBy(xpath="//p[contains(text(),'Rule deleted successfully.')]")
	WebElement delete_Pop_Up_text;
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement delete_Yes_Button;
	@FindBy(xpath="//body/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/p-confirmdialog[1]/div[1]/div[3]/button[2]/span[1]")
	WebElement delete_No_Button;
	@FindBy(xpath="//i[@aria-hidden='true' and @class='fa fa-info-circle more-info-icon']/ancestor::td/following-sibling::td[5]/span/i[1]")
	WebElement edit_Save_button;
	WebDriver driver;
	WebDriverUtil util;

	public Subscriptionpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickon_PlusButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.page_Load_Method();
		util.waitForElementJavaScript(plus_Button);
		/*util.waitForElementVisiblity(plus_Button);
		plus_Button.click();*/
	}

	public void enter_SubScription_Name(String name) {
		subscription_name.sendKeys(name);
	}

	public void choose_Template(String Quizname) {
		util = new WebDriverUtil();
		util.selectByVisibleText(template_Drop_Down, Quizname);
	}

	public void select_Recipients(String name) {
		util = new WebDriverUtil();
		util.selectByVisibleText(recipients_Drop_Down, name);
	}

	public void clickon_role() {
		role_Button.click();
		select_All_Role_Check_Box.click();
		select_Role_Cancel_Button.click();
	}

	public void select_Frequency(String name) {
		util = new WebDriverUtil();
		util.selectByVisibleText(frequency_Button, name);
	}
	public void clickon_Save_Button() {
		save_Button.click();
	}

	public void select_Date() {
		strat_Date.click();
		String date = "March 2023";
		while (true) {
			String text = calander_Text.getText();
			if (date.equals(text)) {
				clickon_Date.click();
				break;
			}
			else
			{
				calander_Next_Button.click();
			}
		}
	}
	public void clickon_Subscription_Edit_Button(String Quizname) {
		DriverFactory.getDriver().findElement(By.xpath("//span[contains(text(),'"+Quizname+"')]/parent::td/following-sibling::td[@class='text-center']/span/i[@title='Edit Subscription']")).click();
	}
	public void clickon_Edit_SubScription_Name(String name,String Quizname) {
		String text=DriverFactory.getDriver().findElement(By.xpath("//span[contains(text(),'"+Quizname+"')]/parent::td/following-sibling::td[4]/span")).getText();
		DriverFactory.getDriver().findElement(By.xpath("//span[contains(text(),'"+text+"')]/parent::td/preceding-sibling::td[5]")).sendKeys(name);
	}
	public void clickon_Delete_Button(String Quizname) {
		DriverFactory.getDriver().findElement(By.xpath("//span[contains(text(),'"+Quizname+"')]/parent::td/following-sibling::td[6]/span/i[2]")).click();
	}
	public String subScription_Successfull_Message() {
		String text=save_PopUp.getText();
		return text;
	}
	public void clickon_Pop_Up_Cancel() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(pop_Up_Cancel);
		//pop_Up_Cancel.click();
	}
	public void clickon_Message_Page() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(message_Page);
		message_Page.click();
		util.page_Load_Method();
	}
	public void changing_The_Subcription_Name(String name) {
		change_SubScription_Name.clear();
		change_SubScription_Name.sendKeys(name);
	}
	public String get_Delete_Pop_Up_Text() {
		String name=delete_Pop_Up_text.getText();
		return name;
	}
	public void clickon_delete_Yes_Button() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(delete_Yes_Button);
		//delete_Yes_Button.click();
	}
	public void clickon_delete_No_Button() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(delete_No_Button);
		//delete_No_Button.click();
	}
	public void clickon_Edit_Save_Button() {
		util = new WebDriverUtil();
		edit_Save_button.click();
	}
	/*
	 * WebElement dobyear1=driver.findElement(By.xpath(
	 * "//div[@class='datepicker-months']//child::table//child::thead//child::tr[2]//child::th[2]"
	 * )); Thread.sleep(3000); WebElement leftarrow1=driver.findElement(By.xpath(
	 * "//div[@class='datepicker-months']//child::table//child::thead//child::tr[2]//child::th[1]"
	 * )); String Exp_text = "1982"; while(true) {
	 * driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); String text =
	 * dobyear1.getText(); if(text.equals(Exp_text)) { break; } else {
	 * driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	 * leftarrow1.click();
	 * 
	 * }
	 * 
	 * } driver.findElement(By.xpath("//span[contains(text(),'Aug')]")).click();
	 * Thread.sleep(3000);
	 * driver.findElement(By.xpath("//td[contains(text(),'14')]")).click(); }
	 */

}
