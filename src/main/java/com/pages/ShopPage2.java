package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.factory.WebDriverUtil;

public class ShopPage2 {
	@FindBy(css = "input[formcontrolname = 'DisplayStoreNumber']")
	WebElement shop_Text;

	@FindBy(css = "input[formcontrolname = 'EmailID']")
	WebElement email_Text;

	@FindBy(css = "select[formcontrolname = 'RegionID']")
	WebElement region_Drop_Down;

	@FindBy(xpath = "//p-inputswitch[@name = 'isElectronicHiring']/div/span")
	WebElement process_Hiring_Slider;

	@FindBy(xpath = "//p-inputswitch[@name = 'isAutomateBGC']/div/span")
	WebElement automate_BGC_Slider;

	@FindBy(xpath = "//p-inputswitch[@name = 'isAutomateFoodCost']/div/span")
	WebElement automate_Food_Cost_Slider;

	@FindBy(xpath = "//p-inputswitch[@name = 'is24Hours']/div/span")
	WebElement store_24_Hours_Slider;

	@FindBy(xpath = "//p-inputswitch[@name = 'isPayrollHours']/div/span")
	WebElement automate_Payroll_Hours_Slider;

	@FindBy(xpath = "//p-inputswitch[@name = 'isOnlineJobPosting']/div/span")
	WebElement automate_Default_sandwich;

	@FindBy(css = "input[formcontrolname = 'AddressLine1']")
	WebElement address_Text1;

	@FindBy(css = "input[formcontrolname = 'AddressLine2']")
	WebElement address_Text2;

	@FindBy(css = "input[formcontrolname = 'City']")
	@CacheLookup
	WebElement city_Text;

	@FindBy(css = "select[formcontrolname = 'StateID']")
	WebElement state_Drop_Down;

	@FindBy(css = "input[formcontrolname = 'ZipCode']")
	@CacheLookup
	WebElement zip_Text;

	@FindBy(css = "input[formcontrolname = 'RentRoyality']")
	@CacheLookup
	WebElement rent_Text;

	@FindBy(css = "input[formcontrolname = 'Cost']")
	@CacheLookup
	WebElement cost_Text;

	@FindBy(css = "select[formcontrolname = 'DistributorID']")
	WebElement food_Cost_Distributor_Drop_Down;

	@FindBy(css = "select[formcontrolname = 'CompanyID']")
	WebElement company_ID_Drop_Down;

	@FindBy(xpath = "//tag-input[@id = 'New Hire']/div/div/tag-input-form/form/input")
	WebElement new_Hire_Email;

	@FindBy(xpath = "//tag-input[@id = 'Weekly Schedule']/div/div/tag-input-form/form/input")
	WebElement weekly_Schedule_Email;

	@FindBy(xpath = "//tag-input[@id = 'Engagement']/div/div/tag-input-form/form/input")
	WebElement engagement_Email;

	@FindBy(xpath = "//tag-input[@id = 'BGC']/div/div/tag-input-form/form/input")
	WebElement BGC_Email;

	@FindBy(xpath = "//tag-input[@id = 'E-Verify']/div/div/tag-input-form/form/input")
	WebElement E_Verify_Email;

	@FindBy(xpath = "//tag-input[@id = 'Applicant']/div/div/tag-input-form/form/input")
	WebElement applicant_Email;

	@FindBy(css = "button[class = 'btn-custom orange-button ng-star-inserted']")
	WebElement save_Button;

	@FindBy(xpath = "//button[@class = 'dropdown-toggle btn-custom orange-button']")
	WebElement cancel_Button;

	@FindBy(xpath = "//div[@class='ui-growl-message']")
	WebElement message;

	@FindBy(xpath = "//td[@class='day' and text() = '6']")
	WebElement wrong_StartDate;

	@FindBy(xpath = "//td[@class='day' and text() = '5']")
	WebElement wrong_EndDate;

	@FindBy(xpath = "//td[@class='day' and text() = '1']")
	WebElement right_StartDate;

	@FindBy(xpath = "//td[@class='day' and text() = '4']")
	WebElement right_EndDate;

	WebDriver driver;
	WebDriverUtil util;

	public ShopPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterShop(String shop) {
		shop_Text.sendKeys(shop);
	}

	public void enterEmail(String email) {
		email_Text.sendKeys(email);
	}

	public void select_Region(String region) throws InterruptedException {
		util = new WebDriverUtil();
		util.selectText(region_Drop_Down, region);
	}

	public void processHiring() {
		process_Hiring_Slider.click();
	}

	public void automate_BGC() {
		automate_BGC_Slider.click();
	}

	public void automate_Food_Cost() {
		automate_Food_Cost_Slider.click();
	}

	public void store_24_Hours() {
		store_24_Hours_Slider.click();
	}

	public void automate_Payroll_Hours() {
		automate_Payroll_Hours_Slider.click();
	}

	public void enterAddress1(String address1) {
		address_Text1.sendKeys(address1);
	}

	public void enterAddress2(String address2) {
		address_Text2.sendKeys(address2);
	}

	public void enterCity(String city) {
		city_Text.sendKeys(city);
	}

	public void stateDropDown(String state) {
		util = new WebDriverUtil();
		util.selectText(state_Drop_Down, state);
	}

	public void enterZipoCode(String zip) {
		zip_Text.sendKeys(zip);
	}

	public void enterRent(String rent) throws InterruptedException {
		Thread.sleep(1000);
		rent_Text.clear();
		rent_Text.sendKeys(rent);
	}

	public void enterCost(String cost) throws InterruptedException {
		Thread.sleep(1000);
		cost_Text.clear();
		cost_Text.sendKeys(cost);
	}

	public void foodCostDistributorDropDown(String food) {
		util = new WebDriverUtil();
		util.selectText(food_Cost_Distributor_Drop_Down, food);
	}

	public void companyIDDropDown(String id) {
		util = new WebDriverUtil();
		util.selectText(company_ID_Drop_Down, id);
	}

	public void enterNewHire(String email) {
		new_Hire_Email.sendKeys(email);
	}

	public void enterWeeklyScheduleEmail(String email) {
		weekly_Schedule_Email.sendKeys(email);
	}

	public void enterEngagementEmail(String email) {
		engagement_Email.sendKeys(email);
	}

	public void enterBGCEmail(String email) {
		BGC_Email.sendKeys(email);
	}

	public void enterE_Verify(String email) {
		E_Verify_Email.sendKeys(email);
	}

	public void enter_Applicant(String email) {
		applicant_Email.sendKeys(email);
	}

	public void click_Save_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(save_Button);
		util.waitForElementJavaScript(save_Button);
	}

	public void click_Cancel_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(cancel_Button);
		util.waitForElementJavaScript(cancel_Button);
	}

	public void region_Alphabetical_Order() throws InterruptedException {
		Select region = new Select(region_Drop_Down);
		List<WebElement> elementCount = region.getOptions();
		List<String> options = new ArrayList<String>();
		for (WebElement optionElement : elementCount) {
			options.add(optionElement.getText());
		}
		options.remove("Select Region");
		System.out.println("Options in dropdown with Default order :" + options);
		List<String> tempList = new ArrayList<String>(options);
		Collections.sort(tempList);
		System.out.println("Sorted List " + tempList);
		Assert.assertEquals(options, tempList);
		boolean ifSortedAscending = options.equals(tempList);
		if (ifSortedAscending) {
			System.out.println("DropDown is in Alphabetical order...");
		} else
			System.out.println("DropDown is not in Alphabetical order...");
	}

	public void state_Alphabetical_Order() throws InterruptedException {
		Select state = new Select(state_Drop_Down);
		List<WebElement> elementCount = state.getOptions();
		List<String> options = new ArrayList<String>();
		for (WebElement optionElement : elementCount) {
			options.add(optionElement.getText());
		}
		options.remove("Select");
		System.out.println("Options in dropdown with Default order :" + options);
		List<String> tempList = new ArrayList<String>(options);
		Collections.sort(tempList);
		System.out.println("Sorted List " + tempList);
		Assert.assertEquals(options, tempList);
		boolean ifSortedAscending = options.equals(tempList);
		if (ifSortedAscending) {
			System.out.println("DropDown is in Alphabetical order...");
		} else
			System.out.println("DropDown is not in Alphabetical order...");
	}

	public void food_Cost_Distributor_Alphabetical_Order() throws InterruptedException {
		Select food = new Select(food_Cost_Distributor_Drop_Down);
		List<WebElement> elementCount = food.getOptions();
		List<String> options = new ArrayList<String>();
		for (WebElement optionElement : elementCount) {
			options.add(optionElement.getText());
		}
		List<String> needToRemove = new ArrayList<>();
		needToRemove.add("Select");
		needToRemove.add("Saladinos");
		needToRemove.add("Other");
		options.removeAll(needToRemove);
		System.out.println("Options in dropdown with Default order :" + options);
		List<String> tempList = new ArrayList<String>(options);
		Collections.sort(tempList);
		System.out.println("Sorted List " + tempList);
		// Assert.assertEquals(options, tempList);
		boolean ifSortedAscending = options.equals(tempList);
		if (ifSortedAscending) {
			System.out.println("DropDown is in Alphabetical order...");
		} else
			System.out.println("DropDown is not in Alphabetical order...");
	}

	public void company_Alphabetical_Order() throws InterruptedException {
		Select company = new Select(company_ID_Drop_Down);
		List<WebElement> elementCount = company.getOptions();
		List<String> options = new ArrayList<String>();
		for (WebElement optionElement : elementCount) {
			options.add(optionElement.getText());
		}
		options.remove("Select");
		System.out.println("Options in dropdown with Default order :" + options);
		List<String> tempList = new ArrayList<String>(options);
		Collections.sort(tempList);
		System.out.println("Sorted List " + tempList);
		// Assert.assertEquals(options, tempList);
		boolean ifSortedAscending = options.equals(tempList);
		if (ifSortedAscending) {
			System.out.println("DropDown is in Alphabetical order...");
		} else
			System.out.println("DropDown is not in Alphabetical order...");
	}

	public void click_All_Toggle_Buttons() throws InterruptedException {
		process_Hiring_Slider.click();
		automate_BGC_Slider.click();
		automate_Food_Cost_Slider.click();
		store_24_Hours_Slider.click();
		automate_Payroll_Hours_Slider.click();
		automate_Default_sandwich.click();
		Thread.sleep(1000);
	}

	public void select_Wrong_Date() {
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB);
		wrong_StartDate.click();
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB, Keys.TAB);
		wrong_EndDate.click();
	}

	public void select_Right_Date() {
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB);
		right_StartDate.click();
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB, Keys.TAB);
		right_EndDate.click();
	}

	public void displayMessage() {
		System.out.println(message.getText());
	}

	public void update_Emails() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(new_Hire_Email);
		new_Hire_Email.sendKeys("bws2@gmail.com");
		Thread.sleep(1000);
		weekly_Schedule_Email.sendKeys("bws4@gmail.com");
		Thread.sleep(1000);
		engagement_Email.sendKeys("bws6@gmail.com");
		Thread.sleep(1000);
		BGC_Email.sendKeys("bws8@gmail.com");
		Thread.sleep(1000);
		E_Verify_Email.sendKeys("bws10@gmail.com");
		Thread.sleep(1000);
		applicant_Email.sendKeys("bws12@gmail.com");
		engagement_Email.click();
	}

	public void update_VariableRent_And_FixedMisc(String Shop) throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		util.waitForElementVisiblity(element);
		util.waitForElementJavaScript(element);
		util.waitForElementVisiblity(rent_Text);
		rent_Text.click();
		rent_Text.clear();
		rent_Text.sendKeys("200365");
		util.waitForElementVisiblity(cost_Text);
		cost_Text.click();
		cost_Text.clear();
		cost_Text.sendKeys("636954");
		util.waitForElementToBeClickable(save_Button);
		util.waitForElementJavaScript(save_Button);
	}

}
