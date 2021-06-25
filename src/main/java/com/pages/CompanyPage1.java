package com.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.factory.WebDriverUtil;

public class CompanyPage1 {
	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	WebElement toggle_Button;

	@FindBy(xpath = "//a[contains(text(),'Add New')]")
	WebElement add_New;

	@FindBy(xpath = "//a[contains(text(),'Import')]")
	WebElement import_btn;

	@FindBy(css = "button[icon = 'pi pi-upload']")
	WebElement upload_Button;

	@FindBy(xpath = "//button[@type='button']/span[contains(text(),'Yes')]/parent::button")
	WebElement delete_Button;

	@FindBy(xpath = "//div[@class='ui-growl-message']")
	WebElement successfull_Message;

	@FindBy(xpath = "//div[@class='ui-growl-icon-close pi pi-times']")
	WebElement successfull_Delete_Message;

	@FindBy(xpath = "//input[@type = 'file']")
	WebElement select_File;

	@FindBy(xpath = "//button[contains(text(),' Download Sample File ')]")
	WebElement download_File;

	@FindBy(xpath = "//button[contains(text(),' Cancel ')]")
	WebElement import_Page_Cancel_Btn;

	@FindBy(xpath = "//div[@class = 'user-icon']")
	WebElement logout_Icon;

	@FindBy(xpath = "//i[@class = 'fa fa-power-off']")
	WebElement logout;

	@FindBy(xpath = "//button[@class = 'btn dropdown-toggle']")
	WebElement export_Icon;

	@FindBy(xpath = "//a[contains(text(),'PDF')]")
	WebElement export_PDF;

	@FindBy(xpath = "//a[contains(text(),'Excel')]")
	WebElement export_Excel;

	WebDriver driver;
	WebDriverUtil util;

	public CompanyPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickon_ToggleButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(toggle_Button);
		util.waitForElementJavaScript(toggle_Button);
	}

	public void clickon_Export_Icon() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(export_Icon);
		util.waitForElementJavaScript(export_Icon);
	}

	public void clickon_PDF_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(export_PDF);
		util.waitForElementJavaScript(export_PDF);
	}

	public void clickon_Excel_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(export_Excel);
		util.waitForElementJavaScript(export_Excel);
	}

	public void clickon_Logout_Icon() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(logout_Icon);
		util.waitForElementJavaScript(logout_Icon);
	}

	public void clickon_Logout() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(logout);
		util.waitForElementJavaScript(logout);
	}

	public void add_NewEmployee() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(add_New);
		util.waitForElementJavaScript(add_New);
	}

	public void import_File() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(import_btn);
		util.waitForElementJavaScript(import_btn);
	}

	public void select_File_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyAdd.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void select_File_To_Be_Updated_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);

		File file = new File("src/test/resources/CompanyImport/CompanyUpdate.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void update_Company_Through_Import_File() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyUpdateAddress.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void select_File_To_Update_Phone_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyUpdatePhone.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
	}

	public void select_File_To_Update_Everify_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyUpdateEverify.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
	}

	public void select_File_To_Update_Everify_Username_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyUpdateEverifyUsername.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
	}

	public void select_File_To_Check_Duplicate_EIN_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyDuplicateEIN.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void select_File_To_Check_Invalid_Zip_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyInvalidZip.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void select_File_To_Check_Add_New_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyAddNew.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void Add_New_Company() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyAddAndDelete.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void update_Company_State() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanySatateUpdate.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
	}

	public void update_Company_City() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyUpdateCity.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
	}

	public void check_EIN() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyInvalidEIN.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void update_Address() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyAddressUpdate.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void update_Company_Name() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyNameUpdate.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void delete_Company_Through_Import_File() throws Throwable {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyDelete.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Button);
		util.waitForElementJavaScript(upload_Button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void download_File() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(download_File);
		util.waitForElementJavaScript(download_File);
		driver.get("https://betaapi.subsource.com/Files/SampleFile/Company%20Sample%20File.xlsx");
		Thread.sleep(3000);
	}

	public void upload_File() throws InterruptedException {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/CompanyImportFile.xlsx");
		select_File.sendKeys(file.getAbsolutePath());
	}

	public void upload_Wrong_File_Format() throws InterruptedException {
		Thread.sleep(1000);
		File file = new File("src/test/resources/CompanyImport/Wrong_Format.txt");
		select_File.sendKeys(file.getAbsolutePath());
	}

	public void findElementUsingText(String searccompany_Name) throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		WebElement company_Name = driver.findElement(
				By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/following::td[6]"));
		util.waitForElementToBeClickable(company_Name);
		company_Name.click();
	}

	public void check_Company(String searccompany_Name) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement company_Name = driver
				.findElement(By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/a"));
		util.waitForElementVisiblity(company_Name);
		util.waitForElementJavaScript(company_Name);
	}

	public void click_delete_Button() throws Throwable {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(delete_Button);
		util.waitForElementJavaScript(delete_Button);
		Thread.sleep(5000);
	}

	public void text_Of_Success_Message() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(successfull_Message);
		System.out.println("Success full message : " + successfull_Message.getText());
	}

	public void successfull_Delete() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(successfull_Delete_Message);
		successfull_Delete_Message.click();
	}

	public void import_Page_Cancel() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(import_Page_Cancel_Btn);
		util.waitForElementJavaScript(import_Page_Cancel_Btn);
	}

	public void refresh() throws InterruptedException {
		driver.navigate().refresh();
	}

}
