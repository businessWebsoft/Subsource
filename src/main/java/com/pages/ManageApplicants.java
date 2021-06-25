package com.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qa.factory.WebDriverUtil;

public class ManageApplicants {

	@FindBy(xpath = "//button[@class = 'btn-sub-menu']")
	WebElement dropdown_Button;

	@FindBy(xpath = "//a[text() = 'Manage Applicants']")
	WebElement manage_Applicants;

	@FindBy(xpath = "//a[text() = 'Basic']")
	WebElement basic;

	@FindBy(xpath = "//a[text() = 'Availability']")
	WebElement availablity;

	@FindBy(xpath = "//a[text() = 'Education']")
	WebElement education;

	@FindBy(xpath = "//a[text() = 'Employment']")
	WebElement employment;

	@FindBy(xpath = "//a[text() = 'Reference']")
	WebElement reference;

	@FindBy(xpath = "//a[text() = 'Log']")
	WebElement log;

	@FindBy(xpath = "//span[text() = 'Sections ']")
	WebElement sections;

	@FindBy(xpath = "//span[text() = ' Combined']")
	WebElement combined;

	@FindBy(xpath = "//a[@title = 'Share Application']")
	WebElement share_App;

	@FindBy(xpath = "//h4[text() = 'Share Application']/parent::div/child::button/span")
	WebElement cross_Button;

	@FindBy(xpath = "//input[@formcontrolname = 'item']")
	WebElement email;

	@FindBy(xpath = "//input[@value = 'Send']")
	WebElement send_Button;

	@FindBy(xpath = "//div[@class='ui-growl-message']")
	WebElement message;

	@FindBy(xpath = "//a[text() = '›']")
	WebElement right_Single_Arrow;

	@FindBy(xpath = "//a[text() = '‹']")
	WebElement left_Single_Arrow;

	@FindBy(xpath = "//a[text() = '»']")
	WebElement right_Double_Arrow;

	@FindBy(xpath = "//a[text() = '«']")
	WebElement left_Double_Arrow;

	@FindBy(xpath = "//a[text() = '2']")
	WebElement page2;

	@FindBy(xpath = "//a[text() = '3']")
	WebElement page3;

	@FindBy(xpath = "//a[text() = '4']")
	WebElement page4;

	@FindBy(xpath = "//a[text() = '5']")
	WebElement page5;

	@FindBy(xpath = "//a[text() = '6']")
	WebElement page6;

	@FindBy(xpath = "//a[text() = '7']")
	WebElement page7;

	@FindBy(xpath = "//a[text() = '20']")
	WebElement view20;

	@FindBy(xpath = "//a[text() = '40']")
	WebElement view40;

	@FindBy(xpath = "//a[text() = '60']")
	WebElement view60;

	@FindBy(xpath = "//a[text() = '80']")
	WebElement view80;

	@FindBy(xpath = "//h2[text() = 'Today']")
	WebElement today;

	@FindBy(xpath = "//h2[text() = '7 Days']")
	WebElement days7;

	@FindBy(xpath = "//h2[text() = '30 Days']")
	WebElement days30;

	@FindBy(xpath = "//h2[text() = '90 Days']")
	WebElement days90;

	@FindBy(xpath = "//h2[text() = 'View All']")
	WebElement view_All;

	@FindBy(xpath = "//h2[text() = 'Referred']")
	WebElement referred;

	@FindBy(xpath = "//button[@class = 'btn collapsed']")
	WebElement search_Button;

	@FindBy(xpath = "//p-dropdown[@optionlabel = 'DisplayStoreNumber']/div/div[3]")
	WebElement select_Shop;

	@FindBy(xpath = "//span[text() = 'All']")
	WebElement shop_All;

	@FindBy(xpath = "//p-dropdown[@optionlabel = 'StatusName']/div/div[3]")
	WebElement status;

	@FindBy(xpath = "//span[text() = 'Declined']")
	WebElement status_Declined;

	@FindBy(xpath = "//span[text() = 'Pending']")
	WebElement status_Pending;

	@FindBy(xpath = "//span[text() = 'Hired']")
	WebElement status_Hired;

	@FindBy(xpath = "//a[text() = 'Go']")
	WebElement go_Button;

	@FindBy(xpath = "//label[text() = ' 5741 ']")
	WebElement shopNo;

	@FindBy(xpath = "//h4[text() = 'Select shop(s)']/parent::div/following-sibling::div/input[@value = 'Continue']")
	WebElement continue_Button;

	@FindBy(xpath = "//h4[text() = 'Select shop(s)']/parent::div/following-sibling::div/input[@value = 'Cancel']")
	WebElement cancel_Button;

	@FindBy(xpath = "//h4[text() = 'Confirm Applicant Details']/parent::div/child::button[@class = 'close pull-right']")
	WebElement cross_Button_Confirm_Applicant_Details;

	@FindBy(xpath = "//h2[text() = 'Today']/parent::div/label[@class = 'configuration-square']")
	WebElement today_List;

	@FindBy(xpath = "//h2[text() = '7 Days']/parent::div/label[@class = 'configuration-square']")
	WebElement day7_List;

	@FindBy(xpath = "//h2[text() = '30 Days']/parent::div/label[@class = 'configuration-square']")
	WebElement day30_List;

	@FindBy(xpath = "//h2[text() = '90 Days']/parent::div/label[@class = 'configuration-square']")
	WebElement day90_List;

	@FindBy(xpath = "//h2[text() = 'View All']/parent::div/label[@class = 'configuration-square']")
	WebElement view_All_List;

	@FindBy(xpath = "//h2[text() = 'Referred']/parent::div/label[@class = 'configuration-square']")
	WebElement referred_List;

	WebDriver driver;
	WebDriverUtil util;

	public ManageApplicants(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickon_Dropdown() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(dropdown_Button);
		util.waitForElementJavaScript(dropdown_Button);
	}

	public void clickon_Manage_Applicants() throws InterruptedException {
		util = new WebDriverUtil();
		NgWebDriver ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		ngDriver.withRootSelector("\"app-root\"").waitForAngularRequestsToFinish();
		util.waitForElementToBeClickable(manage_Applicants);
		util.waitForElementJavaScript(manage_Applicants);
	}

	public void clickon_Applicant_Name(String name) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement applicant_Name = driver.findElement(By.xpath("//a[contains(text(),'" + name + "')]/parent::td/a"));
		util.waitForElementToBeClickable(applicant_Name);
		util.waitForElementJavaScript(applicant_Name);
	}

	public void clickon_Buttons() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(availablity);
		util.waitForElementJavaScript(availablity);

		util.waitForElementToBeClickable(education);
		util.waitForElementJavaScript(education);

		util.waitForElementToBeClickable(employment);
		util.waitForElementJavaScript(employment);

		util.waitForElementToBeClickable(reference);
		util.waitForElementJavaScript(reference);

		util.waitForElementToBeClickable(log);
		util.waitForElementJavaScript(log);

		util.waitForElementToBeClickable(basic);
		util.waitForElementJavaScript(basic);
	}

	public void clickon_Sections() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(sections);
		util.waitForElementJavaScript(sections);
	}

	public void clickon_Combined() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(combined);
		util.waitForElementJavaScript(combined);
	}

	public void clickon_Share_Icon() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(share_App);
		util.waitForElementJavaScript(share_App);
	}

	public void email() throws InterruptedException {
		util = new WebDriverUtil();
		String id = "bwsayush@gmail.com";
		util.waitForElementToBeClickable(email);
		util.passTheValueUsingJavaScript(email, id);
	}

	public void clickon_Send_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(send_Button);
		util.waitForElementJavaScript(send_Button);
	}

	public void clickOn_right_Single_Arrow() throws InterruptedException {
		util = new WebDriverUtil();
		for (int i = 1; i <= 6; i++) {
			util.waitForElementToBeClickable(right_Single_Arrow);
			util.waitForElementJavaScript(right_Single_Arrow);
		}
	}

	public void clickOn_left_Single_Arrow() throws InterruptedException {
		util = new WebDriverUtil();
		for (int i = 1; i <= 6; i++) {
			util.waitForElementToBeClickable(left_Single_Arrow);
			util.waitForElementJavaScript(left_Single_Arrow);
		}
	}

	public void clickOn_right_Double_Arrow() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(right_Double_Arrow);
		util.waitForElementJavaScript(right_Double_Arrow);
	}

	public void clickOn_left_Double_Arrow() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(left_Double_Arrow);
		util.waitForElementJavaScript(left_Double_Arrow);
	}

	public void clickOn_Individual_Pages() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(page2);
		util.waitForElementJavaScript(page2);

		util.waitForElementToBeClickable(page3);
		util.waitForElementJavaScript(page3);

		util.waitForElementToBeClickable(page4);
		util.waitForElementJavaScript(page4);

		util.waitForElementToBeClickable(page5);
		util.waitForElementJavaScript(page5);

		util.waitForElementToBeClickable(page6);
		util.waitForElementJavaScript(page6);

		util.waitForElementToBeClickable(page7);
		util.waitForElementJavaScript(page7);
	}

	public void clickOn_View_Per_Page() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(view20);
		util.waitForElementJavaScript(view20);

		util.waitForElementToBeClickable(view40);
		util.waitForElementJavaScript(view40);

		util.waitForElementToBeClickable(view60);
		util.waitForElementJavaScript(view60);

		util.waitForElementToBeClickable(view80);
		util.waitForElementJavaScript(view80);

	}

	public void clickOn_today() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(today);
		util.waitForElementJavaScript(today);
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count = list.size();
		System.out.println("Length of today : " + count);
		String text = today_List.getText();
		System.out.println("Text of today : " + text);
		int text1 = Integer.parseInt(text);
		Assert.assertEquals(count, text1);
	}

	public void clickOn_7days() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(days7);
		util.waitForElementJavaScript(days7);
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count = list.size();
		System.out.println("Length of days 7 : " + count);
		String text = day7_List.getText();
		System.out.println("Text of days 7 : " + text);
		int text1 = Integer.parseInt(text);
		Assert.assertEquals(count, text1);
	}

	public void clickOn_30days() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(days30);
		util.waitForElementJavaScript(days30);
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count = list.size();
		System.out.println("Length of days 30 : " + count);
		String text = day30_List.getText();
		System.out.println("Text of days 30 : " + text);
		int text1 = Integer.parseInt(text);
		Assert.assertEquals(count, text1);
	}

	public void clickOn_90days() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(days90);
		util.waitForElementJavaScript(days90);
		util.waitForElementToBeClickable(view80);
		util.waitForElementJavaScript(view80);
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count = list.size();
		util.waitForElementToBeClickable(right_Single_Arrow);
		util.waitForElementJavaScript(right_Single_Arrow);
		Thread.sleep(5000);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count1 = list1.size();
		int countSum = count + count1;
		System.out.println("Length of days 90 : " + countSum);
		String text = day90_List.getText();
		System.out.println("Text of days 90 : " + text);
		int text1 = Integer.parseInt(text);
		Assert.assertEquals(countSum, text1);
	}

	public void clickOn_ViewAll() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(view_All);
		util.waitForElementJavaScript(view_All);
		util.waitForElementToBeClickable(view80);
		util.waitForElementJavaScript(view80);
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count = list.size();
		util.waitForElementToBeClickable(right_Single_Arrow);
		util.waitForElementJavaScript(right_Single_Arrow);
		Thread.sleep(10000);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count1 = list1.size();
		int countSum = count + count1;
		System.out.println("Length of view all : " + countSum);
		String text = view_All_List.getText();
		System.out.println("Text of view all : " + text);
		int text1 = Integer.parseInt(text);
		Assert.assertEquals(countSum, text1);
	}

	public void clickOn_Referred() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(referred);
		util.waitForElementJavaScript(referred);
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'fct-scroller']/table/tbody/tr"));
		int count = list.size();
		System.out.println("Length of referred : " + count);
		String text = referred_List.getText();
		System.out.println("Text referred : " + text);
		int text1 = Integer.parseInt(text);
		Assert.assertEquals(count, text1);
	}

	public void clickOn_Search_Filter() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(search_Button);
		util.waitForElementJavaScript(search_Button);
	}

	public void select_Shop() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(select_Shop);
		util.waitForElementJavaScript(select_Shop);

		util.waitForElementToBeClickable(shop_All);
		util.waitForElementJavaScript(shop_All);
	}

	public void select_Status() throws InterruptedException {

		util = new WebDriverUtil();
		for (int i = 1; i <= 3; i++) {
			util.waitForElementToBeClickable(status);
			util.waitForElementJavaScript(status);
			if (i == 1) {
				util.waitForElementToBeClickable(status_Declined);
				util.waitForElementJavaScript(status_Declined);
			}

			if (i == 2) {
				util.waitForElementToBeClickable(status_Hired);
				util.waitForElementJavaScript(status_Hired);
			}

			if (i == 3) {
				util.waitForElementToBeClickable(status_Pending);
				util.waitForElementJavaScript(status_Pending);
			}
			util.waitForElementToBeClickable(go_Button);
			util.waitForElementJavaScript(go_Button);
		}
	}

	public void clickOn_Hire(String name) throws InterruptedException {
		util = new WebDriverUtil();
		WebElement hire = driver.findElement(By.xpath("//a[contains(text(),'" + name
				+ "')]/parent::td/parent::tr/child::td[10]/child::div/span[text() = ' Hire ']"));
		util.waitForElementToBeClickable(hire);
		util.waitForElementJavaScript(hire);
	}

	public void select_Shop_Referred() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(shopNo);
		util.waitForElementJavaScript(shopNo);
	}

	public void ClickOn_Continue() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(continue_Button);
		util.waitForElementJavaScript(continue_Button);
		util.waitForElementToBeClickable(cross_Button_Confirm_Applicant_Details);
		util.waitForElementJavaScript(cross_Button_Confirm_Applicant_Details);
	}

	public void ClickOn_Cancel() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(cancel_Button);
		util.waitForElementJavaScript(cancel_Button);
	}
}
