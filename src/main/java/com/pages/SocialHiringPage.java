package com.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;

public class SocialHiringPage {

	@FindBy(xpath = "//span[contains(text(),'Position*:')]/parent::div/following-sibling::div/select")
	WebElement postion_Drop_Down;
	@FindBy(xpath = "//a[contains(text(),'Select shop(s) for posting')]")
	WebElement select_Shops_For_Posting;
	@FindBy(xpath = "//input[@placeholder='email@domain.com']")
	WebElement to_Email_Text;
	@FindBy(xpath = "//div[contains(text(),'To:')]/parent::div/div/div")
	WebElement to_Plus_Button;
	@FindBy(xpath = "//label[contains(text(),'Search:')]/parent::div/input")
	WebElement to_Search_Box;
	@FindBy(xpath = "//label[contains(text(),'Search:')]/parent::div/i")
	WebElement to_Search_Box_Edit_Button;
	@FindBy(xpath = "//h4[contains(text(),'Select shop(s) for posting')]")
	WebElement select_Shops_Pop_Up_Window_Text;
	@FindBy(xpath = "//h4[contains(text(),'Select shop(s) for posting')]/parent::div/button/span")
	WebElement select_Shop_Pop_Up_Window_Cancel_Button;
	@FindBy(xpath = "//a[contains(text(),'Create Custom Shop')]")
	WebElement create_Custom_Shop;
	@FindBy(xpath = "//input[@formcontrolname='DisplayStoreNumber']")
	WebElement shop_number;
	@FindBy(xpath = "//input[@formcontrolname='AddressLine1']")
	WebElement adderss_Text1;
	@FindBy(xpath = "//input[@formcontrolname='City']")
	WebElement City_Text;
	@FindBy(xpath = "//select[@formcontrolname='StateID']")
	WebElement state_Drop_Down;
	@FindBy(xpath = "//input[@formcontrolname='ZipCode']")
	WebElement zip_Code;
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement create_custom_Confirm_Button;
	@FindBy(xpath = "//p[contains(text(),'Please check all required fields.')]")
	WebElement create_custom_Shop_Pop_up_Message;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement create_custom_Shop_Pop_up_Cancel_Button;
	@FindBy(xpath = "//label[text()='Role']/parent::div/select")
	WebElement select_Shops_For_Window_Pop_Up_Role_Drop_Down;
	@FindBy(xpath = "//label[text()='Role']/parent::div/select/option")
	WebElement getDropDowmlist;
	@FindBy(xpath = "//input[@id='is_all_shops_checked']/parent::label/following::label[1]")
	WebElement get_Company_Text;
	@FindBy(xpath = "//input[@placeholder='Enter store number']")
	WebElement select_Shops_For_Pop_Up_Window_Search_Box;
	@FindBy(xpath = "//input[@placeholder='Enter store number']/parent::div/following-sibling::div/div/div[2]/label/span")
	WebElement select_Shops_For_Pop_Up_Window_Shops_First_Check_Box;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement select_Shops_For_Pop_Up_Window_Shops_Submit_Buttton;
	@FindBy(xpath = "//a[contains(text(),'Select shop(s) for posting')]/parent::div/following::div[1]/ul/li")
	WebElement Selected_Shop_Number_For_Hiring;
	@FindBy(xpath = "//label[@for='stores_checked_457']/span[1]")
	WebElement verify_456_Check_Box;
	@FindBy(xpath = "//input[@name='name'and @maxlength='200']")
	WebElement subject_Text;
	@FindBy(xpath = "//input[@value='Preview']")
	WebElement clickon_Preview;
	@FindBy(xpath = "//h4[contains(text(),'Preview')]")
	WebElement Preview_Pop_Up_Window_Text;
	@FindBy(xpath = "//h4[contains(text(),'Preview')]/parent::div/button")
	WebElement Preview_Pop_Up_WinDow_Cancel_Button;
	@FindBy(xpath = "//div[@class='col-md-12']/div[1]")
	WebElement get_Preview_Pop_Window_Subject_Text;
	@FindBy(xpath = "//span[contains(text(),'Choose Template')]/parent::div/following-sibling::div/select")
	WebElement choose_Template;
	@FindBy(xpath = "//span[contains(text(),'Template Name')]/parent::div/following::div[@class='description text-box']/div/div/div/div[@class='fr-element fr-view']")
	WebElement enter_Text_For_New_element;
	@FindBy(xpath = "//a[@class='dropdown-links-toggle dropdown-toggle btn ']")
	WebElement save_button_Drop_Down;
	@FindBy(xpath = "//a[contains(text(),'Save Template')]")
	WebElement save_Template_Button;
	@FindBy(xpath = "//p[contains(text(),'Please enter name and description to save template')]")
	WebElement new_Template_Pop_Up_Error;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement Pop_Up_Cancel_Button;
	@FindBy(xpath = "//p[contains(text(),'Template Saved successfully!')]")
	WebElement Save_Template_Pop_Up_Message_Text;
	@FindBy(xpath = "//input[@placeholder='Name your template']")
	WebElement new_Template_Name;
	@FindBy(xpath = "//h4[contains(text(),'Templates')]")
	WebElement get_Choose_Template_Edit_Button_Tittle;
	@FindBy(xpath = "//div[@class='pull-left create-template-button']/span/i[1]")
	WebElement chooseTemplate_Edit_Button;
	@FindBy(xpath = "//h4[contains(text(),'Templates')]/parent::div/button")
	WebElement choose_Template_Edit_Button_Pop_UP_Window_Cross_Button;
	@FindBy(xpath = "//button[@class='btn-custom orange-button small cancel ng-star-inserted']")
	WebElement choose_Template_Edit__Button_Pop_Up_Window_Cancel_Button;
	@FindBy(xpath = "//div[contains(text(),'Are you sure you want to delete this template?')]/parent::div/div/div[1]")
	WebElement get_Delete_Template_Text;
	@FindBy(xpath = "//div[contains(text(),'Are you sure you want to delete this template?')]/parent::div/following::div[1]/button[1]")
	WebElement delete_Template_Pop_Up_Cancel_Button;
	@FindBy(xpath = "//div[contains(text(),'Are you sure you want to delete this template?')]/parent::div/following::div[1]/button[2]")
	WebElement delete_Template_Pop_Up_Continue_Button;
	@FindBy(xpath = "//p[contains(text(),'Template deleted successfully!')]")
	WebElement get_Delete_Template_Successfully_Message;
	@FindBy(xpath = "//input[@ng-confirm-click='Are you sure you want to cancel? Unsaved data will be lost.']")
	WebElement Cancel_Button;
	@FindBy(xpath = "//div[contains(text(),'Subject:')]/parent::div/child::div/i")
	WebElement subject_File_Button;
	@FindBy(xpath = "//h4[contains(text(),'Upload Attachment')]")
	WebElement upload_Pop_Up_Window_Title;
	@FindBy(xpath = "//h4[contains(text(),'Upload Attachment')]/parent::div/button")
	WebElement upload_Pop_Up_Window_Cancel_Button;
	@FindBy(xpath = "//input[@accept='.jpg,.jpeg,.png,.PNG,.gif,.doc,.docx,.ppt,.MP4,.MP3,.AVI,.mp4,.mp3,.avi,.pptx,application/pdf']")
	WebElement upload_File;
	@FindBy(xpath = "//div[contains(text(),'sample-calm-eloquence-resume.pdf')]")
	WebElement get_File_Name;
	@FindBy(xpath = "//div[@title='Remove']")
	WebElement remove_The_File;
	@FindBy(xpath = "//i[@title='View or Edit Template']")
	WebElement view_Button;
	@FindBy(xpath = "//i[@title='Hide Template']")
	WebElement hide_Template;
	@FindBy(xpath = "//a[contains(text(),'Save Draft')]")
	WebElement save_Draft;
	@FindBy(xpath="//input[@alt='Send'][1]")
	WebElement send_Button;
	@FindBy(xpath="//h4[contains(text(),'Confirmation')]")
	WebElement Confirmation_Text;
	@FindBy(xpath="//button[contains(text(),'Send Only')]")
	WebElement send_Only_Button;
	@FindBy(xpath="//button[contains(text(),'Save & Send')]")
	WebElement save_and_Send_Button;
	WebDriver driver;
	WebDriverUtil util;

	public SocialHiringPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_on_Select_Shops_For_Posting() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(select_Shops_For_Posting);
		Thread.sleep(2000);
		select_Shops_For_Posting.click();
	}

	public String get_Select_Shop_Pop_Up_Window_Text() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(select_Shops_Pop_Up_Window_Text);
		String text = select_Shops_Pop_Up_Window_Text.getText();
		return text;
	}

	public void clickon_Select_Window_Pop_Up_Cancel_Button() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(create_Custom_Shop);
		select_Shop_Pop_Up_Window_Cancel_Button.click();
	}

	public void clickon_Create_Custom_Shop() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(create_Custom_Shop);
		Thread.sleep(1000);
		create_Custom_Shop.click();
	}

	public void eneter_Shop_Number(String shop) throws InterruptedException {
		shop_number.clear();
		shop_number.sendKeys(shop);
	}

	public void enter_Adderrs_Text1(String address) throws InterruptedException {
		adderss_Text1.clear();
		adderss_Text1.sendKeys(address);
	}

	public void enter_City_Text(String city) throws InterruptedException {
		City_Text.clear();
		City_Text.sendKeys(city);
	}

	public void select_State_Drop_Down(String state) throws InterruptedException {
		util = new WebDriverUtil();
		util.selectByVisibleText(state_Drop_Down, state);
	}

	public void enetr_Zip_Code(String code) throws InterruptedException {
		zip_Code.clear();
		util = new WebDriverUtil();
		util.waitForElementVisiblity(zip_Code);
		zip_Code.sendKeys(code);
	}

	public void clickon_create_Custom_Confirm_Button() {
		create_custom_Confirm_Button.click();
	}

	public String get_Create_custom_Shop_Error_Pop_Up() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(create_custom_Shop_Pop_up_Message);
		String text = create_custom_Shop_Pop_up_Message.getText();
		return text;
	}

	public void clickon_Create_Custom_Shop_Pop_Up_cancel_Button() {
		create_custom_Shop_Pop_up_Cancel_Button.click();
	}

	public String get_Company_Text() {
		String text = get_Company_Text.getText();
		return text;
	}

	public void select_Shops_For_Pop_Up_Window_Search_box(String name) {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(select_Shops_For_Pop_Up_Window_Search_Box);
		select_Shops_For_Pop_Up_Window_Search_Box.sendKeys(name);
	}

	public void Clickon_Select_Shops_For_Window_First_Check_Box() throws InterruptedException {
		util = new WebDriverUtil();
		WebDriverWait waiter = new WebDriverWait(DriverFactory.getDriver(), 5000);
		waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//input[@placeholder='Enter store number']/parent::div/following-sibling::div/div/div[2]/label/span")));
		util.waitForElementVisiblity(select_Shops_For_Pop_Up_Window_Shops_First_Check_Box);
		/// util.waitForElementToBeClickable(select_Shops_For_Pop_Up_Window_Shops_First_Check_Box);
		Thread.sleep(2000);
		// util.waitForElementJavaScript(select_Shops_For_Pop_Up_Window_Shops_First_Check_Box);
		select_Shops_For_Pop_Up_Window_Shops_First_Check_Box.click();
	}

	public void clickon_Select_Shops_Window_Submit_Button() {
		select_Shops_For_Pop_Up_Window_Shops_Submit_Buttton.click();
	}

	public String get_Slected_Shop_Number() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Selected_Shop_Number_For_Hiring);
		String num = Selected_Shop_Number_For_Hiring.getText();
		return num;
	}

	public void clikon_Plus_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(to_Plus_Button);
		util.waitForElementJavaScript(to_Plus_Button);
		// to_Plus_Button.click();
	}

	public boolean isEnable_457_Shop() throws InterruptedException {
		boolean s = false;
		List<WebElement> element = DriverFactory.getDriver()
				.findElements(By.xpath("//div[@class='col-lg-2 col-md-2 col-sm-3 col-xs-6 ng-star-inserted']"));
		for (WebElement ele : element) {
			String innerHTMLText = ele.getAttribute("innerHTML");
			if (innerHTMLText.contains("id=\"stores_checked_457\" value=\"true\"")) {
				s = true;
				break;
			}
		}
		return s;
	}

	public void enter_Subject_Text(String text) {
		util = new WebDriverUtil();
		//util.wait_Untill_Page_Load();
		subject_Text.clear();
		subject_Text.sendKeys(text);
	}

	public void clickon_Preview_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(clickon_Preview);
		util.waitForElementJavaScript(clickon_Preview);
		//clickon_Preview.click();
	}

	public String get_Preview_Pop_Window_Text() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Preview_Pop_Up_Window_Text);
		String name = Preview_Pop_Up_Window_Text.getText();
		return name;
	}

	public void clickon_Preview_Pop_Up_WinDow_Cancel_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Preview_Pop_Up_WinDow_Cancel_Button);
		Preview_Pop_Up_WinDow_Cancel_Button.click();
	}

	public String get_Pop_Up_Window_Preview_Subject_Text() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(get_Preview_Pop_Window_Subject_Text);
		String text = get_Preview_Pop_Window_Subject_Text.getText();
		String str = StringUtils.remove(text, "Subject : ");
		return str;
	}

	public void choose_Template_Drop_Down(String name) {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(choose_Template);
		util.selectByVisibleText(choose_Template, name);
	}

	public void enter_Text_For_New_Template(String text) {
		enter_Text_For_New_element.sendKeys(text);
	}

	public void clickon_Save_New_Template() {
		util = new WebDriverUtil();
		WebElement ele=DriverFactory.getDriver().findElement(By.xpath("//div[@class='social-hiring-button-container']/child::div/div/a"));
		util.waitForElementToBeClickable(ele);
		util.waitForElementJavaScript(ele);
		util.waitForElementJavaScript(save_Template_Button);
		//save_Template_Button.click();
	}

	public String get_Pop_Up_Error_Message_For_NewTemplate() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(new_Template_Pop_Up_Error);
		String text = new_Template_Pop_Up_Error.getText();
		return text;
	}

	public void Pop_Up_Cancel_Button() {
		Pop_Up_Cancel_Button.click();
	}

	public String save_Template_Pop_Up_Message() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Save_Template_Pop_Up_Message_Text);
		String text = Save_Template_Pop_Up_Message_Text.getText();
		return text;
	}

	public void Clickon_Save_Button_Drop_Down() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(save_button_Drop_Down);
		//save_button_Drop_Down.click();
	}

	public void enter_New_Template_Name(String name) {
		new_Template_Name.sendKeys(name);
	}

	public String get_New_Template_Success_Pop_Up_Message() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Save_Template_Pop_Up_Message_Text);
		String text = Save_Template_Pop_Up_Message_Text.getText();
		return text;
	}

	public String get_Edit_Button_Pop_Up_Window_Tittle() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(get_Choose_Template_Edit_Button_Tittle);
		String text = get_Choose_Template_Edit_Button_Tittle.getText();
		return text;
	}

	public void clickon_Choose_Template_Edit_Button() {
		chooseTemplate_Edit_Button.click();
	}

	public void clickon_Choose_Template_Edit_Button_Pop_Up_Cross_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(choose_Template_Edit_Button_Pop_UP_Window_Cross_Button);
		choose_Template_Edit_Button_Pop_UP_Window_Cross_Button.click();
	}

	public void clickon_Choose_Template_Edit_Button_Pop_Up_Cancel_Button() {
		choose_Template_Edit__Button_Pop_Up_Window_Cancel_Button.click();
	}

	public void delete_Template(String name) {
		util = new WebDriverUtil();
		WebElement ele = DriverFactory.getDriver()
				.findElement(By.xpath("//td[contains(text(),'" + name + "')]/parent::tr/td/i"));
		util.waitForElementToBeClickable(ele);
		ele.click();
	}

	public String get_Delete_Template_Name_Text() {
		String text = get_Delete_Template_Text.getText();
		String str = StringUtils.remove(text, "Template Name: ");
		return str;
	}

	public void clickon_Delete_Pop_Up_Window_Cancel_Button() {
		delete_Template_Pop_Up_Cancel_Button.click();
	}

	public void clickon_Delete_Pop_Up_Window_Continue_Button() {
		delete_Template_Pop_Up_Continue_Button.click();
	}

	public String get_Delete_Pop_Up_Success_Message() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(get_Delete_Template_Successfully_Message);
		String text = get_Delete_Template_Successfully_Message.getText();
		return text;
	}

	public void clickon_Cancel_Button() {
		Cancel_Button.click();
	}

	public void Clickon_Subject_File_Button() throws InterruptedException {
		util = new WebDriverUtil();
		//Thread.sleep(2000);
		util.waitForElementVisiblity(subject_File_Button);
		util.waitForElementJavaScript(subject_File_Button);
		//subject_File_Button.click();
	}

	public String get_Upload_Pop_Up_Window_Title() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(upload_Pop_Up_Window_Title);
		String text = upload_Pop_Up_Window_Title.getText();
		return text;
	}

	public void clickon_Upload_File_Pop_Up_Window_Cancel_Button() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(upload_Pop_Up_Window_Cancel_Button);
		//Thread.sleep(1000);
		util.waitForElementJavaScript(upload_Pop_Up_Window_Cancel_Button);
		//upload_Pop_Up_Window_Cancel_Button.click();
	}

	public void Upload_File() throws InterruptedException {
		upload_File.sendKeys(
				System.getProperty("user.dir") + "./src/test/resources/Files/sample-calm-eloquence-resume.pdf");
	}

	public String get_File_Name() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(get_File_Name);
		String name = get_File_Name.getText();
		return name;
	}

	public void food_Cost_Distributor_Alphabetical_Order() throws InterruptedException {
		util = new WebDriverUtil();
		// util.waitForElementVisiblity(select_Shops_For_Window_Pop_Up_Role_Drop_Down);
		Select food = new Select(select_Shops_For_Window_Pop_Up_Role_Drop_Down);
		List<WebElement> elementCount = food.getOptions();
		List<WebElement> list = driver
				.findElements(By.xpath("//input[@id='is_all_shops_checked']/parent::label/following::label[1]"));
		int size = list.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			String option = list.get(i).getText();
			System.out.println(option);
		}
		// System.out.println(getDropDowmlist.getText());
		// label[text()='Role']/parent::div/select/option[3]

	}

	public Boolean file_Verify(String nam) {
		Boolean ele = false;
		try {
			util = new WebDriverUtil();
			util.waitForElementToBeClickable(get_File_Name);
			String name = get_File_Name.getText();
			if (name.contains(nam)) {
				return false;
			}
		} catch (NoSuchElementException e) {
			return true;
		}
		return ele;
	}

	public void clickon_Remove_Button() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(remove_The_File);
		util.waitForElementJavaScript(remove_The_File);
		//remove_The_File.click();
	}

	public void clickon_View_Buton() {
		view_Button.click();
	}

	public String get_Text_Of_Template_Subject(String name) {
		String text = DriverFactory.getDriver().findElement(By.xpath("//div[contains(text(),'" + name + "')]"))
				.getText();
		return text;
	}

	public void clickon_Hide_Template() {
		hide_Template.click();
	}

	public void clickon_Save_Draft() {
		save_Draft.click();
	}
	public void Clickon_Send_Button() {
		send_Button.click();
	}
	public String get_Confirmation_text() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Confirmation_Text);
		String text=Confirmation_Text.getText();
		return text;
	}
	public void clickon_Send_Only_Button() {
		send_Only_Button.click();
	}
	public void clickon_Save_And_Send_Button() {
		save_and_Send_Button.click();
	}
	public String get_Send_Button_Text() {
		String text=send_Button.getAttribute("value");
		return text;
	}
	public String get_PreView_Button_Text() {
		String text=clickon_Preview.getAttribute("value");
		return text;
	}
	public String get_Cancel_Button_Text() {
		String text=Cancel_Button.getAttribute("value");
		return text;
	}
	/* SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); */

}
