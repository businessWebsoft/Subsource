package com.qa.factory;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pages.HomePage;
import com.pages.QuizPage;
import com.qa.util.JSONFileClass;

public class UtilMethods {
	HomePage home;
	WebDriverUtil util;
	QuizPage page;
	JSONFileClass file;
	JSONObject user;

	public void navigation_Preferences(String preference) throws InterruptedException {
		home = new HomePage(DriverFactory.getDriver());
		home.Clickon_HomePage();
		home.clickon_Settings();
		WebElement element = DriverFactory.getDriver()
				.findElement(By.xpath("//a[contains(text(),'" + preference + "')]"));
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(element);
		util.waitForElementJavaScript(element);
	}

	public void navigation_Account_Settings(String account) {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(
				DriverFactory.getDriver().findElement(By.xpath("//h2[contains(text(),'" + account + "')]")));
	}

	public void navigation_HumanResources(String humanResource) throws InterruptedException {
		home = new HomePage(DriverFactory.getDriver());
		home.Clickon_HomePage();
		home.clickon_HumanResources();
		WebElement resource = DriverFactory.getDriver()
				.findElement(By.xpath("//a[contains(text(),'" + humanResource + "')]"));
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(resource);
		util.waitForElementJavaScript(resource);
	}

	public void navigate_To_The_Email_Employee(String Employee) throws InterruptedException {
		WebElement employee = DriverFactory.getDriver()
				.findElement(By.xpath("//a[contains(text(),'" + Employee + "')]"));
		util = new WebDriverUtil();
		//util.page_Load_Method();
		util.waitForElementToBeClickable(employee);
		util.waitForElementJavaScript(employee);
		//util.page_Load_Method();
		// employee.click();
		// util.wait_For_Page_Load(3000);
	}

	public void creating_Quiz_For_Employees(String quiz, String title, String description, String percentage)
			throws InterruptedException, IOException, ParseException {
		page = new QuizPage(DriverFactory.getDriver());
		page.choose_New_Template();
		page.enter_New_Template_Name(quiz);
		page.enter_Title_Text(title);
		page.enter_Description_Text(description);
		page.enter_Passing_Text(percentage);
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray userLogInArray = (JSONArray) user.get("Questiontext");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			page.enetr_Question1((String) details.get("questionone"));
			page.select_Question_Drop_Down1((String) details.get("OptionType"));
			page.enter_Question1_Option1((String) details.get("Question1Option1"));
			page.enter_Question1_Option2((String) details.get("Question1Option2"));
			page.enter_Question1_Option3((String) details.get("Question1Option3"));
			page.clickon_Question_Plus_Button();
			page.enetr_Question2((String) details.get("questiontwo"));
			page.select_Questions_Drop_Down2((String) details.get("OptionType"));
			page.enter_Question2_Option1((String) details.get("Question2Option1"));
			page.enter_Question2_Option2((String) details.get("Question2Option2"));
			page.enter_Question2_Option3((String) details.get("Question2Option3"));
			page.clickon_Question_Plus_Button();
			page.enetr_Question3((String) details.get("Questionthree"));
			page.select_Questions_Drop_Down3((String) details.get("OptionType"));
			page.enter_Question3_Option1((String) details.get("Question3Option1"));
			page.enter_Question3_Option2((String) details.get("Question3Option2"));
			page.enter_Question3_Option3((String) details.get("Question3Option3"));
			page.clickon_save_Template();
			String text = page.required_field_Pop_Up();
			Assert.assertEquals((String) details.get("reuirefiled"), text);
			page.clickon_Error_Pop_Up_Window();

		}
	}

	public void quiz_save_Successfully(String pop) throws InterruptedException {
		page.question_One_Answer();
		page.question_Two_Answer();
		page.question_Three_Answer();
		page.clickon_save_Template();
		String text = page.template_Save_Pop_up();
		Assert.assertEquals(pop, text);
		page.clickon_SuccessfullTemplateSave_Pop_Up_WindowCancel();

	}
	public void CustomWait() throws InterruptedException {
		Thread.sleep(3000);
	}
}
