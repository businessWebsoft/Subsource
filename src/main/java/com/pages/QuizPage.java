package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;

public class QuizPage {
	@FindBy(xpath = "//div[contains(text(),'To')]//parent::div/div/div/i")
	WebElement to_Button;
	@FindBy(xpath = "//i[@title='View/Edit']")
	WebElement to_Edit_Button;
	@FindBy(xpath = "//p[contains(text(),'Please click on any of the checkboxes to view the ')]")
	WebElement to_Edit_Button_Pop_Up_Message;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement to_Edit_Button_Pop_Up_cancel;
	@FindBy(xpath = "//div[@class='pull-left create-template-div ng-star-inserted']")
	WebElement choose_Templte;
	@FindBy(xpath = "//div[@class='pull-left create-template-div ng-star-inserted']/select")
	WebElement choose_Template_Drop_Down;
	@FindBy(xpath = "//span[contains(text(),'Choose Template')]/parent::div/following::div[2]")
	WebElement choose_Template_Edit_Button;
	@FindBy(xpath = "//h4[contains(text(),'Templates')]")
	WebElement Choose_Template_Edit_Button_Title;
	@FindBy(xpath = "//h4[contains(text(),'Templates')]/parent::div/button")
	WebElement choose_Template_Pop_up_Cancel_Button;
	@FindBy(xpath = "//div[@class='pull-left create-template-div ng-star-inserted']/select/option[contains(text(),'Create new template...')]")
	WebElement choose_New_Template;
	@FindBy(xpath = "//input[@placeholder='Name your template']")
	WebElement new_Template_Name_Text;
	@FindBy(xpath = "//div[@class='text-box']/input[@name='name' and @type='text']")
	WebElement title_Text;
	@FindBy(xpath = "//label[contains(text(),'Description')]/parent::div/child::textarea")
	WebElement Description_Text;
	@FindBy(xpath = "//input[@type='number']")
	WebElement passing_Text;
	@FindBy(xpath = "//input[@placeholder='Please enter your question here']")
	WebElement question_Text;
	@FindBy(xpath = "//input[@id='option-0-0']")
	WebElement Question1option1;
	@FindBy(xpath = "//input[@id='option-0-1']")
	WebElement Question1option2;
	@FindBy(xpath = "//input[@id='option-0-2']")
	WebElement Question1option3;
	@FindBy(xpath = "//input[@id='option-1-0']")
	WebElement Question2option1;
	@FindBy(xpath = "//input[@id='option-1-1']")
	WebElement Question2option2;
	@FindBy(xpath = "//input[@id='option-1-2']")
	WebElement Question2option3;
	@FindBy(xpath = "//input[@id='option-2-0']")
	WebElement Question3option1;
	@FindBy(xpath = "//input[@id='option-2-1']")
	WebElement Question3option2;
	@FindBy(xpath = "//input[@id='option-2-2']")
	WebElement Question3option3;
	@FindBy(xpath = "//*[contains(text(),' Q1. ')]/parent::div/div[@class='row question-box']/div/input")
	WebElement Questiontex1;
	@FindBy(xpath = "//*[contains(text(),' Q2. ')]/parent::div/div[@class='row question-box']/div/input")
	WebElement Questiontex2;
	@FindBy(xpath = "//*[contains(text(),' Q3. ')]/parent::div/div[@class='row question-box']/div/input")
	WebElement Questiontex3;
	@FindBy(xpath = "//*[contains(text(),' Q1. ')]/parent::div/div[@class='row question-box']/div/select")
	WebElement question_Drop_Down1;
	@FindBy(xpath = "//*[contains(text(),' Q2. ')]/parent::div/div[@class='row question-box']/div/select")
	WebElement question_Drop_Down2;
	@FindBy(xpath = "//*[contains(text(),' Q3. ')]/parent::div/div[@class='row question-box']/div/select")
	WebElement question_Drop_Down3;
	@FindBy(xpath = "//input[@id='option-0-0']/parent::div/child::div/label/span")
	WebElement question1_Check1;
	@FindBy(xpath = "//input[@id='option-0-1']/parent::div/child::div/label/span")
	WebElement question1_Check2;
	@FindBy(xpath = "//input[@id='option-0-2']/parent::div/child::div/label/span")
	WebElement question1_Check3;
	@FindBy(xpath = "//input[@id='option-1-0']/parent::div/child::div/label/span")
	WebElement Question2_Check1;
	@FindBy(xpath = "//input[@id='option-1-1']/parent::div/child::div/label/span")
	WebElement Question2_Check2;
	@FindBy(xpath = "//input[@id='option-1-2']/parent::div/child::div/label/span")
	WebElement Question2_Check3;
	@FindBy(xpath = "//input[@id='option-2-0']/parent::div/child::div/label/span")
	WebElement Question3_Check1;
	@FindBy(xpath = "//input[@id='option-2-1']/parent::div/child::div/label/span")
	WebElement Question3_Check2;
	@FindBy(xpath = "//input[@id='option-2-2']/parent::div/child::div/label/span")
	WebElement Question3_Check3;
	@FindBy(xpath = "//i[@title='Add Question']")
	WebElement plus_Button;
	@FindBy(xpath = "//body/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]")
	WebElement filter_Button;
	@FindBy(xpath = "//i[@title='Copy Question']")
	WebElement copy_Button;
	@FindBy(xpath = "//input[@class='btn-broadcast btn-broadcast-orange lmargin10 ng-star-inserted']")
	WebElement send_Button;
	@FindBy(xpath = "//input[@class='btn-broadcast btn-broadcast-cancel lmargin10']")
	WebElement cancel_Button;
	@FindBy(xpath = "//input[@value='Save Template']")
	WebElement save_Template;
	@FindBy(xpath = "//input[@title='Send']/parent::div/child::div[1]/div/a")
	WebElement save_Template_Drop_Down;
	@FindBy(partialLinkText = "Save Templa")
	WebElement save_Template_Update;
	@FindBy(linkText = "Save New Template")
	WebElement save_New_Template;
	@FindBy(linkText = "Update Template")
	WebElement update_Template;
	@FindBy(xpath = "//input[@id='option-0-0']/following::i[@title='Remove Option'][1]")
	WebElement cros_Button;
	@FindBy(xpath = "//input[@id='option-0-0']/parent::div/descendant::div/label/span")
	WebElement check_Box;
	@FindBy(xpath = "//p[contains(text(),'Please select at least one employee to continue!.')]")
	WebElement pop_Up_Message_For_No_Selected_Emplooyes;
	@FindBy(xpath = "//p[contains(text(),'Please check all Required Fields')]")
	WebElement required_Field_Pop_Up;
	@FindBy(xpath = "//p[contains(text(),'Quiz template saved successfully.')]")
	WebElement template_Save_Pop_Up;
	@FindBy(xpath = "//input[@class='form-control table-input ng-untouched ng-pristine ng-valid']")
	WebElement new_Template_Name1;
	@FindBy(xpath = "//input[@class='form-control table-input ng-pristine ng-valid ng-touched']")
	WebElement new_Template_Name;
	@FindBy(xpath = "//a[contains(text(),'Update Template')]")
	WebElement update_Template_Name;
	@FindBy(xpath = "//button[@title='Save Update Selected']")
	WebElement update_Template_Right_button;
	@FindBy(xpath = "//p[contains(text(),'Template name updated successfully.')]")
	WebElement update_Template_Name_Pop_Up;
	@FindBy(xpath = "//button[@class='btn-custom orange-button small ng-star-inserted']")
	WebElement continue_Delete_button;
	@FindBy(xpath = "//p[contains(text(),'Quiz Template deleted successfully!')]")
	WebElement quiz_Delete_Pop_up;
	@FindBy(xpath = "//a[contains(text(),' Subscriptions ')]")
	WebElement subscription_Button;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement Error_Pop_Up_WinDow;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement successsaveTemplate_Pop_Up_WinDow;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement templateEditName_Pop_Up_Message;
	@FindBy(xpath = "//body/app-root[1]/p-growl[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement SuccesfullDelete_Pop_Up_WinDow;
	@FindBy(xpath = "//div[contains(text(),'This template can not be deleted as this is mapped')]")
	WebElement subscription_Pop_up;
	@FindBy(xpath = "//body/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]/following-sibling::label")
	WebElement get_Employee;
	@FindBy(xpath = "//body/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[3]/quiz-setup-link[1]/ol[1]/li[2]/a[1]")
	WebElement sent_Button;
	@FindBy(xpath = "//div[contains(text(),'This template can not be deleted as this is mapped with the subscription(s).')]")
	WebElement quiz_SubScription_Delete_Pop_Up_Message;
	@FindBy(xpath = "//button[contains(text(),' Cancel ')]")
	WebElement subscription_Pop_Up_Cancel_Button;
	@FindBy(xpath = "//body/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[5]/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement subscription_Pop_Up_Cross_Button;
	@FindBy(xpath = "//label[@class='show-email-label ng-star-inserted']")
	WebElement selected_To_List;
	@FindBy(xpath = "//li[@class='ng-tns-c5-77 ui-dropdown-item ui-corner-all ng-star-inserted']/span")
	WebElement get_Roles;
	@FindBy(xpath = "//li[@class='ui-multiselect-item ui-corner-all ng-tns-c6-79 ng-star-inserted']/label")
	WebElement get_Status;
	@FindBy(xpath = "//button[contains(text(),'Save & Send')]")
	WebElement save_And_Send_Button;
	@FindBy(xpath = "//button[contains(text(),'Send Only')]")
	WebElement sendOnly_Button;
	@FindBy(xpath = "//body[1]/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]/span[1]")
	WebElement clickon_Manager_Check_Box;
	@FindBy(xpath = "//p[contains(text(),'Quiz template updated successfully.')]")
	WebElement template_Update_Pop_up;
	@FindBy(xpath = "//body/app-root[1]/admin-root[1]/div[1]/div[1]/ng-component[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
	WebElement update_Conformation_Pop_Up_Cancel_Button;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement update_Conformation_Pop_Up_Continue_Button;
	@FindBy(xpath = "//label[contains(text(),'Select Roles')]")
	WebElement select_Roles_Button;
	@FindBy(xpath = "//h4[contains(text(),'Additional Roles')]")
	WebElement additional_Roles;
	@FindBy(xpath = "//h4[contains(text(),'Additional Roles')]/parent::div/parent::div/div/button[contains(text(),'Cancel')]")
	WebElement additional_Roles_Cancel_Button;
	@FindBy(xpath = "//h4[contains(text(),'Additional Roles')]/parent::div/parent::div/div/button[contains(text(),'Save')]")
	WebElement additional_Role_Save_Button;
	@FindBy(xpath = "//h4[contains(text(),'Additional Roles')]/parent::div/parent::div/div/button[1]")
	WebElement additional_Role_Cross_Button;
	@FindBy(xpath = "//i[@title='Add Question']/parent::div/div/div[2]/select")
	WebElement drop_Down_Get_Text;
	@FindBy(xpath = "//a[contains(text(),'Save New Template')]")
	WebElement save_New_Template_Drop_Down;
	@FindBy(xpath = "//h4[contains(text(),'Template Name')]/parent::div/button")
	WebElement template_Name_Cross_Button;
	@FindBy(xpath = "//h4[contains(text(),'Template Name')]/parent::div/following-sibling::div/button[text()='Cancel']")
	WebElement template_Name_Cancel_Button;
	@FindBy(xpath = "//h4[contains(text(),'Template Name')]/parent::div/following-sibling::div/button[text()='Save']")
	WebElement template_Name_Save_Button;
	@FindBy(xpath = "//h4[contains(text(),'Template Name')]/parent::div/following-sibling::div/div/input")
	WebElement enetr_New_Template_Name;
	@FindBy(xpath = "//p[contains(text(),'Quiz template saved successfully.')]")
	WebElement new_Template_Pop_Up_Message_Display;
	@FindBy(xpath = "//input[@id='8535']/parent::div")
	WebElement manager_Text;
	WebDriverUtil util;
	WebDriver driver;

	public QuizPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickon_To_Button() {
		util = new WebDriverUtil();
		// util.invisiablitiy_Of_Element(to_Button);
		// WebDriverWait wait3 = new WebDriverWait(DriverFactory.getDriver(), 10);
		// wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[@class='fa
		// fa-caret-down expand-email']")));
		//util.waitForElementToBeClickable(to_Button);
		util.waitForElementJavaScript(to_Button);
		//to_Button.click();
	}

	public void clickon_To_Edit_Button() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(to_Edit_Button);
		/*util.waitForElementToBeClickable(to_Edit_Button);
		to_Edit_Button.click();*/
	}

	public String get_Edit_Button_Pop_Up_Text() {
		String text = to_Edit_Button_Pop_Up_Message.getText();
		return text;
	}

	public void to_Edit_Button_Cancel() {
		to_Edit_Button_Pop_Up_cancel.click();
	}

	public void choose_Template_Drop_Down(String name) throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(choose_Template_Drop_Down);
		util.selectText(choose_Template_Drop_Down, name);
	}

	public void choose_New_Template() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(choose_Template_Drop_Down);
		util.selectText(choose_Template_Drop_Down, "Create new template...");
		// util.waitForElementJavaScript(choose_Template_Drop_Down);
		// util.waitForElementJavaScript(choose_New_Template);
		// choose_Template_Drop_Down.click();
		// choose_New_Template.click();

	}

	public void enter_New_Template_Name(String templatename) throws InterruptedException {
		//util.waitForElementVisiblity(new_Template_Name_Text);
		Thread.sleep(1000);
		new_Template_Name_Text.sendKeys(templatename);
	}

	public void enter_Title_Text(String text) {
		title_Text.clear();
		title_Text.sendKeys(text);
	}

	public void enter_Description_Text(String text) {
		Description_Text.sendKeys(text);
	}

	public void clickon_Choose_template_Edit_Buttton() {
		util = new WebDriverUtil();
		util.page_Load_Method();
		util.waitForElementJavaScript(choose_Template_Edit_Button);
		/*util.waitForElementToBeClickable(choose_Template_Edit_Button);
		choose_Template_Edit_Button.click();*/
	}

	public String get_Choose_Template_Pop_Up_Text() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(Choose_Template_Edit_Button_Title);
		String title = Choose_Template_Edit_Button_Title.getText();
		return title;
	}

	public void enter_Passing_Text(String pass) {
		passing_Text.clear();
		passing_Text.sendKeys(pass);
	}

	public void enter_Question_text(String questiontext) {
		question_Text.sendKeys(questiontext);
	}

	public void clickon_Question_Plus_Button() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(plus_Button);
		// plus_Button.click();
	}

	public void clickon_Copy_Button() {
		copy_Button.click();
	}

	public void clickon_Choose_Template_Pop_Up_Cancel_Button() {
		choose_Template_Pop_up_Cancel_Button.click();
	}

	public void clickon_Send_Button() {
		send_Button.click();
	}

	public void enetr_Question1(String Q1) {
		Questiontex1.sendKeys(Q1);
	}

	public void enetr_Question2(String Q2) {
		Questiontex2.sendKeys(Q2);
	}

	public void enetr_Question3(String Q3) {
		Questiontex3.sendKeys(Q3);
	}

	public void enter_Question1_Option1(String op1) {
		Question1option1.clear();
		Question1option1.sendKeys(op1);
	}

	public void enter_Question1_Option2(String op2) {
		Question1option2.clear();
		Question1option2.sendKeys(op2);
	}

	public void enter_Question1_Option3(String op3) {
		Question1option3.clear();
		Question1option3.sendKeys(op3);
	}

	public void enter_Question2_Option1(String op1) {
		Question2option1.clear();
		Question2option1.sendKeys(op1);
	}

	public void enter_Question2_Option2(String op2) {
		Question2option2.clear();
		Question2option2.sendKeys(op2);
	}

	public void enter_Question2_Option3(String op3) {
		Question2option3.clear();
		Question2option3.sendKeys(op3);
	}

	public void enter_Question3_Option1(String op1) {
		Question3option3.clear();
		Question3option1.sendKeys(op1);
	}

	public void enter_Question3_Option2(String op2) {
		Question3option2.clear();
		Question3option2.sendKeys(op2);
	}

	public void enter_Question3_Option3(String op3) {
		Question3option3.clear();
		Question3option3.sendKeys(op3);
	}

	public void select_Question_Drop_Down1(String option1) {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(question_Drop_Down1);
		util.selectText(question_Drop_Down1, option1);
	}

	public void select_Questions_Drop_Down2(String option2) {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(question_Drop_Down2);
		util.selectText(question_Drop_Down2, option2);
	}

	public void select_Questions_Drop_Down3(String option3) {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(question_Drop_Down3);
		util.selectText(question_Drop_Down3, option3);
	}

	public String get_Pop_UP_Text_For_No_Selected_Employee() {
		String name = pop_Up_Message_For_No_Selected_Emplooyes.getText();
		return name;
	}

	public void clickon_save_Template() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(save_Template);
		/*util.waitForElementVisiblity(save_Template);
		save_Template.click();*/
	}

	public String required_field_Pop_Up() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(required_Field_Pop_Up);
		String text = required_Field_Pop_Up.getText();
		return text;
	}

	public void question_One_Answer() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(question1_Check2);
		//question1_Check2.click();
	}

	public void question_Two_Answer() {
		Question2_Check1.click();
		Question2_Check3.click();
	}

	public void question_Three_Answer() {
		Question3_Check1.click();
		Question3_Check2.click();
		Question3_Check3.click();
	}

	public String template_Save_Pop_up() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(template_Save_Pop_Up);
		String text = template_Save_Pop_Up.getText();
		return text;
	}

	public void template_Edit(String name) {
		WebElement element = DriverFactory.getDriver().findElement(By.linkText(name));
		util = new WebDriverUtil();
		util.waitForElementJavaScript(element);
	}

	public void new_Template_Name(String name) {
		new_Template_Name1.click();
		new_Template_Name.clear();
		new_Template_Name.sendKeys(name);
	}

	public void clickon_Update_Template_Button() {
		util = new WebDriverUtil();
		util.page_Load_Method();
		util.waitForElementToBeClickable(update_Template_Right_button);
		update_Template_Right_button.click();
	}

	public String update_Template_Pop_Up() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(update_Template_Name_Pop_Up);
		String text = update_Template_Name_Pop_Up.getText();
		return text;
	}

	public void quiz_delete(String quiz) throws InterruptedException {

		WebElement element = DriverFactory.getDriver()
				.findElement(By.xpath("//a[contains(text(),'" + quiz + "')]/ancestor::td/following-sibling::td"));
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(element);
		element.click();
		continue_Delete_button.click();
	}

	public void subscription_Delete_Button(String quizName) {
		WebElement ele = DriverFactory.getDriver()
				.findElement(By.xpath("//a[contains(text(),'" + quizName + "')]/ancestor::td/following-sibling::td"));
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ele);
		System.out.println(ele.getText());
		ele.click();
		// util.waitForElementJavaScript(ele);
	}

	public String get_Template_Name_Text(String name) {
		WebElement ele = DriverFactory.getDriver().findElement(By.xpath("//a[contains(text(),'" + name + "')]"));
		util = new WebDriverUtil();
		util.waitForElementVisiblity(ele);
		String text = ele.getText();
		return text;
	}

	public String quiz_delete_Pop_up() {
		String text = quiz_Delete_Pop_up.getText();
		return text;
	}

	public void clickon_Subscription() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(subscription_Button);
		subscription_Button.click();
	}

	public void clickon_Error_Pop_Up_Window() {
		Error_Pop_Up_WinDow.click();
	}

	public void clickon_SuccessfullTemplateSave_Pop_Up_WindowCancel() {
		successsaveTemplate_Pop_Up_WinDow.click();
	}

	public void clickon_TemplateEdit_Pop_Up_Cancel() {
		templateEditName_Pop_Up_Message.click();
	}

	public void Clickon_Successfulltemplate_delete_Pop_Up_Window() {
		SuccesfullDelete_Pop_Up_WinDow.click();
	}

	public String get_SubScription_Pop_Up() {
		String name = subscription_Pop_up.getText();
		return name;
	}

	public String get_Employee_Number() {
		String number = get_Employee.getText();
		return number;
	}

	public void clickon_Sent() {
		sent_Button.click();
	}

	public String subScription_Delete_Pop_Up_Text() {
		util = new WebDriverUtil();
		util.page_Load_Method();
		util.waitForElementVisiblity(quiz_SubScription_Delete_Pop_Up_Message);
		String text = quiz_SubScription_Delete_Pop_Up_Message.getText();
		return text;
	}

	public void clickon_SubScription_Pop_Up_Cancel() {
		subscription_Pop_Up_Cancel_Button.click();
	}

	public void clickon_SubScription_Pop_Up_Cross_Button() {
		subscription_Pop_Up_Cross_Button.click();
	}

	public String get_Selected_To_List() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(selected_To_List);
		String text = selected_To_List.getText();
		String list = text.replaceAll("[^0-9]", "");
		return list;
	}

	public void clickon_Save_And_Send_Button() throws InterruptedException {
		save_And_Send_Button.click();
		Thread.sleep(2000);
	}

	public void clickon_Send_Only_Button() {
		sendOnly_Button.click();
	}

	public void clickon_Manager_Check_Box() {
		clickon_Manager_Check_Box.click();
	}

	public String get_template_update_Pop_Text() {
		String name = template_Update_Pop_up.getText();
		return name;
	}

	public void clickon_Update_Conformation_Pop_Up_Cancel() {
		update_Conformation_Pop_Up_Cancel_Button.click();
	}

	public void clickon_Update_Conformation_Pop_Up_Continue() {
		update_Conformation_Pop_Up_Continue_Button.click();
	}

	public void clickon_Save_Template_Drop_Down() {
		save_Template_Drop_Down.click();
	}

	public void clickon_Select_Role_Button() {
		select_Roles_Button.click();
	}

	public String get_Additional_Roles_text() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(additional_Roles);
		String text = additional_Roles.getText();
		return text;
	}

	public void clickon_Additional_Roles_Check_Box() {
		List<WebElement> element = DriverFactory.getDriver().findElements(By.xpath(
				"//label[contains(text(),'Include the following users for all Quiz/tasks?')]/parent::div/div/label/span"));
		for (WebElement ele : element) {
			ele.click();
		}
	}

	public void clickon_Additional_roles_Cancel_Button() {
		additional_Roles_Cancel_Button.click();
	}

	public void clickon_Additional_Roles_Save_Button() {
		additional_Role_Save_Button.click();
	}

	public void clickon_Additional_roles_Cross_Button() {
		additional_Role_Cross_Button.click();
	}

	public String get_Question_Text(String questionNumber) {
		WebElement ele = DriverFactory.getDriver().findElement(By.xpath(
				"//i[@class='fa fa-plus add-question-icon ng-star-inserted']/parent::div/div[1][contains(text(),' "
						+ questionNumber + " ')]"));
		util = new WebDriverUtil();
		util.waitForElementVisiblity(ele);
		String text = ele.getText();
		return text;
	}

	public String clickon_100Question(String QuestionNumber) {
		String text;
		while (true) {
			WebElement ele = DriverFactory.getDriver().findElement(
					By.xpath("//i[@class='fa fa-plus add-question-icon ng-star-inserted']/parent::div/div[1]"));
			util = new WebDriverUtil();
			util.waitForElementVisiblity(ele);
			plus_Button.click();
			text = ele.getText();
			if (QuestionNumber.equalsIgnoreCase(text)) {
				break;
			}
		}
		return text;
	}

	public String get_Drop_Down_Text() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(drop_Down_Get_Text);
		String name = drop_Down_Get_Text.getText();
		return name;
	}

	public String get_Question_Text() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Questiontex2);
		String name = Questiontex2.getText();
		return name;
	}

	public void verifying_Questions_Check_Box() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Question2_Check2);
		Boolean name = Question2_Check2.isSelected();
		Assert.assertTrue(name);
		// return name;
	}

	public List<String> get_Options_Text() {
		List<String> list = new ArrayList<String>();
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Question2option1);
		list.add(Question2option1.getText());
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Question2option2);
		list.add(Question2option2.getText());
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Question2option3);
		list.add(Question2option3.getText());
		return list;
	}

	public void clickon_Save_New_Template_Drop_Down() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(save_New_Template_Drop_Down);
		save_New_Template_Drop_Down.click();
	}

	public void clickon_Template_Name_Cross() {
		template_Name_Cross_Button.click();
	}

	public void clickon_Template_Name_Save_Button() {
		template_Name_Save_Button.click();
	}

	public void clickon_Template_Name_Cancel_Button() {
		template_Name_Cancel_Button.click();
	}

	public void template_Name(String name) {
		enetr_New_Template_Name.sendKeys(name);
	}

	public String clickon_New_Template_Pop_Up_Message() {
		String name = new_Template_Pop_Up_Message_Display.getText();
		return name;
	}

	public String get_manager_Text() {
		String Text = manager_Text.getText();
		String list = Text.replaceAll("[^0-9]", "");
		return list;
	}
}
