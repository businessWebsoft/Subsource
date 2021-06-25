package com.pages;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.factory.WebDriverUtil;

public class ShopPage1 {
	@FindBy(css = "button[class = 'btn dropdown-toggle act']")
	WebElement toggle_Button;

	@FindBy(xpath = "//*[@id='accordion']/li[2]/div/ul/li[1]/a")
	WebElement add_New_Button;

	@FindBy(xpath = "//*[@id='accordion']/li[2]/div/ul/li[3]/a")
	WebElement Edit_Misc;

	@FindBy(xpath = "//span[@class = 'ui-button-icon-left ui-clickable pi pi-check']")
	WebElement delete_Button;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/div/span/a")
	WebElement shopNo;

	@FindBy(css = "input[formcontrolname = 'City']")
	@CacheLookup
	WebElement city_Text;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save_Button;

	@FindBy(css = "input[formcontrolname = 'Cost']")
	@CacheLookup
	WebElement cost_Text;

	@FindBy(xpath = "//button[text() = ' Cancel ']")
	WebElement cancel_btn;

	@FindBy(xpath = "//button[text() = 'Cancel']")
	WebElement cancel_btn1;

	@FindBy(xpath = "//td[@class='day' and text() = '5']")
	WebElement startDate;

	@FindBy(xpath = "//td[@class='day' and text() = '6']")
	WebElement endDate;

	@FindBy(xpath = "//i[@class = 'fa fa-share-square-o']")
	WebElement export_Button;

	@FindBy(xpath = "//i[@class = 'fa fa-file-pdf-o']")
	WebElement pdf_Button;

	@FindBy(xpath = "//i[@class = 'fa fa-file-excel-o']")
	WebElement excel_Button;

	@FindBy(xpath = "//span[@class = 'ui-button-icon-left ui-clickable pi pi-times']")
	WebElement no_Button;

	@FindBy(xpath = "//span[@class = 'pi pi-fw pi-times']")
	WebElement cross_Button;

	@FindBy(xpath = "//span[contains(text(),'Shop Wrong Format.txt: Invalid file type,')]")
	WebElement error_file_format_msg1;

	@FindBy(xpath = "//span[contains(text(),'allowed file types: .xlsx.')]")
	WebElement error_file_format_msg2;

	@FindBy(xpath = "//a[text() = 'Import']")
	WebElement import_button;

	@FindBy(xpath = "//input[@type = 'file']")
	WebElement select_File;

	@FindBy(xpath = "//button[contains(text(),' Download Sample File ')]")
	WebElement download_File;

	@FindBy(css = "button[icon = 'pi pi-upload']")
	WebElement upload_Button;

	@FindBy(xpath = "//table[@class = 'default-table dgray-header']/tbody/tr/td[contains(text(),'Shop created successfully!')]")
	WebElement status;

	WebDriver driver;
	WebDriverUtil util;

	public ShopPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_Toggle_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(toggle_Button);
		util.waitForElementJavaScript(toggle_Button);
	}

	public void click_AddNew() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(add_New_Button);
		util.waitForElementJavaScript(add_New_Button);
	}

	public void click_Edit_Misc() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Edit_Misc);
		util.waitForElementJavaScript(Edit_Misc);
	}

	public void click_shop() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(shopNo);
		util.waitForElementJavaScript(shopNo);
	}

	public void delete(String Shop) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement element = driver
				.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/parent::div/following::td[9]"));
		util.waitForElementVisiblity(element);
		Thread.sleep(4000);
		element.click();
		util.waitForElementToBeClickable(delete_Button);
		util.waitForElementJavaScript(delete_Button);
		Thread.sleep(5000);
	}

	public void click_Cancel() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(cancel_btn);
		util.waitForElementJavaScript(cancel_btn);
	}

	public void update_City(String Shop) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		util.waitForElementVisiblity(element);
		element.click();
		util.waitForElementToBeClickable(city_Text);
		city_Text.click();
		city_Text.clear();
		city_Text.sendKeys("Mumbai");
		util.waitForElementToBeClickable(cost_Text);
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB);
		util.waitForElementToBeClickable(startDate);
		util.waitForElementJavaScript(startDate);
		util.waitForElementToBeClickable(cost_Text);
		util.waitForElementJavaScript(cost_Text);
		cost_Text.sendKeys(Keys.TAB, Keys.TAB);
		util.waitForElementToBeClickable(endDate);
		util.waitForElementJavaScript(endDate);
		util.waitForElementToBeClickable(save_Button);
		util.waitForElementJavaScript(save_Button);
	}

	public void check_Update(String Shop) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		util.waitForElementVisiblity(element);
		element.click();
		util.waitForElementToBeClickable(cancel_btn1);
		util.waitForElementJavaScript(cancel_btn1);
	}

	public void click_On_Shop(String Shop) throws InterruptedException {
		util = new WebDriverUtil();
		util.wait_For_Page_Load(10000);
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		util.waitForElementVisiblity(element);
		element.click();
	}

	public void remove_Email(String email) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement element = driver
				.findElement(By.xpath("//div[contains(text(),'" + email + "')]/parent::div/delete-icon/span"));
		util.waitForElementVisiblity(element);
		element.click();
		Thread.sleep(1000);
	}

	public void scroll_Down() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void scroll_Up() throws InterruptedException {
		WebElement Element = driver.findElement(By.xpath("//div[@class = 'user-icon']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void shop_Match(String Shop) throws Throwable {
		util = new WebDriverUtil();
		WebElement shop_number_Searched = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		System.out.println(shop_number_Searched.getText());
		String shop1 = shop_number_Searched.getText();
		WebElement shop_Delete_Icon = driver
				.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/parent::div/following::td[9]"));
		util.waitForElementVisiblity(shop_Delete_Icon);
		shop_Delete_Icon.click();
		WebElement shop_Number_Found = driver.findElement(By.xpath("//b[contains(text(),'" + Shop + "')]"));
		System.out.println(shop_Number_Found.getText());
		String shop2 = shop_Number_Found.getText();
		if (shop1.equals(shop2)) {
			System.out.println("Shop Matched");
		} else {
			System.out.println("Shop Not matched");
		}
		Assert.assertEquals(shop1, shop2);
	}

	public void clickOn_Delete_Yes_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(delete_Button);
		util.waitForElementJavaScript(delete_Button);
		Thread.sleep(5000);
	}

	public void clickOn_Export() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(export_Button);
		util.waitForElementJavaScript(export_Button);
	}

	public void clickOn_PDF() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(pdf_Button);
		util.waitForElementJavaScript(pdf_Button);
	}

	public void clickOn_Excel() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(excel_Button);
		util.waitForElementJavaScript(excel_Button);
	}

	public void delete_Icon(String Shop) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement shop_Delete_Icon = driver
				.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/parent::div/following::td[9]"));
		util.waitForElementVisiblity(shop_Delete_Icon);
		shop_Delete_Icon.click();
	}

	public void clickOn_No_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(no_Button);
		util.waitForElementJavaScript(no_Button);
	}

	public void clickOn_Cross_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(cross_Button);
		util.waitForElementJavaScript(cross_Button);
	}

	public void clickOn_Import_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(import_button);
		util.waitForElementJavaScript(import_button);
	}

	public void select_Wrong_File() throws Throwable {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		File file = new File("src/test/resources/ShopImport/Shop Wrong Format.txt");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		String actual = error_file_format_msg1.getText() + error_file_format_msg2.getText();
		String expected = "Shop Wrong Format.txt: Invalid file type,allowed file types: .xlsx.";
		Assert.assertEquals(expected, actual);
		util.waitForElementToBeClickable(cancel_btn);
		util.waitForElementJavaScript(cancel_btn);
	}

	public void select_Add_File() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/ShopImport/ShopAdd.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
	}

	public void clickOn_Upload_Button() throws Throwable {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		String Expected = "Shop created successfully!";
		String Actual = status.getText();
		Assert.assertEquals(Expected, Actual);
		util.waitForElementToBeClickable(cancel_btn);
		util.waitForElementJavaScript(cancel_btn);
	}

	public void download_File() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(download_File);
		util.waitForElementJavaScript(download_File);
		driver.get("https://betaapi.subsource.com/Files/SampleFile/Store%20Sample%20File.xlsx");
		Thread.sleep(3000);
	}

	public void add_Shop() throws Throwable {
		Thread.sleep(2000);
		File file = new File("src/test/resources/ShopImport/ShopAdd.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
	}

	public void update_Shop() throws Throwable {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		File file = new File("src/test/resources/ShopImport/ShopUpdate.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		util.waitForElementToBeClickable(cancel_btn);
		util.waitForElementJavaScript(cancel_btn);
	}

	public void cancel() throws Throwable {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(cancel_btn);
		util.waitForElementJavaScript(cancel_btn);
	}

	public void cancel1() throws Throwable {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(cancel_btn1);
		util.waitForElementJavaScript(cancel_btn1);
	}

}
