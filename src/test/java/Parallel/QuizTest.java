package Parallel;

import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;

import com.pages.CommunicationPage;
import com.pages.QuizPage;
import com.pages.SentPage;
import com.pages.Subscriptionpage;
import com.qa.factory.DriverFactory;
import com.qa.factory.UtilMethods;
import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuizTest {
	UtilMethods util;
	CommunicationPage employee;
	QuizPage page;
	JSONFileClass file;
	JSONObject user;
	Subscriptionpage sub;
	SentPage sent;
	String Template;
	WebDriverUtil webUtil;

	@Given("^user navigate to the Quiz page$")
	public void user_navigate_to_the_quiz_page() throws Throwable {
		util = new UtilMethods();
		util.navigation_HumanResources("Communications");
		employee = new CommunicationPage(DriverFactory.getDriver());
		employee.clickon_Email_Employee_Drop_Down();
		util.navigate_To_The_Email_Employee("Quiz");
		webUtil= new WebDriverUtil();
		//webUtil.page_Load_Method();
	}

	@When("^To Leave as a emty and click on To Edit button$")
	public void to_leave_as_a_emty_and_click_on_to_edit_button() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		webUtil= new WebDriverUtil();
		//util.CustomWait();
		webUtil.page_Load_Method();
		page.clickon_To_Button();
		page.clickon_To_Edit_Button();
	}

	@Then("^Edit button pop up message should be displayed$")
	public void edit_button_pop_up_message_should_be_displayed() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		String popup = page.get_Edit_Button_Pop_Up_Text();
		Assert.assertEquals("Please click on any of the checkboxes to view the emails.", popup);
		page.to_Edit_Button_Cancel();
	}

	@When("^TO text Leave as a emty and choose the Test template$")
	public void to_text_leave_as_a_emty_and_choose_the_test_template() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		page.choose_Template_Drop_Down("Test template");
	}

	@Then("^Quiz Should not be sent to the employees$")
	public void quiz_should_not_be_sent_to_the_employees() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		page.clickon_Send_Button();
		String pop = page.get_Pop_UP_Text_For_No_Selected_Employee();
		Assert.assertEquals("Please select at least one employee to continue!.", pop);
	}

	@When("^Click on choose template edit button$")
	public void click_on_choose_template_edit_button() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		webUtil.page_Load_Method();
		util.CustomWait();
		page.clickon_Choose_template_Edit_Buttton();
	}

	@Then("^The Edit pop up window should be displayed$")
	public void the_edit_pop_up_window_should_be_displayed() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		String title = page.get_Choose_Template_Pop_Up_Text();
		Assert.assertEquals(title,"Templates");
		page.clickon_Choose_Template_Pop_Up_Cancel_Button();
	}

	@When("^creating new Quiz Template as \"([^\"]*)\" , title is \"([^\"]*)\", Description \"([^\"]*)\" and passing percentage is \"([^\"]*)\"$")
	public void creating_new_quiz_template_as_something_title_is_something_description_something_and_passing_percentage_is_something(
			String Templatename, String title, String description, String percentage) throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		webUtil.page_Load_Method();
		util.CustomWait();
		page.choose_New_Template();
		page.enter_New_Template_Name(Templatename);
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

	@Then("^New Quiz Template should be created and Pop up message Sholud be displayed as \"([^\"]*)\"$")
	public void new_quiz_template_should_be_created_and_pop_up_message_sholud_be_displayed_as_something(String pop)
			throws Throwable {
		webUtil.page_Load_Method();
		page.question_One_Answer();
		page.question_Two_Answer();
		page.question_Three_Answer();
		page.clickon_save_Template();
		String text = page.template_Save_Pop_up();
		Assert.assertEquals(pop, text);
		page.clickon_Error_Pop_Up_Window();
	}

	@When("^Edit \"([^\"]*)\" template name to \"([^\"]*)\"$")
	public void edit_something_template_name_to_something(String Quizname, String editQuizname) throws Throwable {
		page.clickon_Choose_template_Edit_Buttton();
		webUtil.page_Load_Method();
		page.template_Edit(Quizname);
		webUtil.page_Load_Method();
		page.new_Template_Name(editQuizname);
		page.clickon_Update_Template_Button();
	}

	@Then("^Template Name should be Changed and pop up message should be displayed as \"([^\"]*)\"$")
	public void template_name_should_be_changed_and_pop_up_message_should_be_displayed_as_something(
			String updateMessage) throws Throwable {
		String text = page.update_Template_Pop_Up();
		Assert.assertEquals(text, updateMessage);
		page.clickon_TemplateEdit_Pop_Up_Cancel();
	}

	@When("^Click on \"([^\"]*)\" Delete button$")
	public void click_on_something_delete_button(String qizDelete) throws Throwable {
		page.quiz_delete(qizDelete);
	}

	@Then("^Quiz Template Should be Deleted and pop up Message Shoud be displayed as \"([^\"]*)\"$")
	public void quiz_template_should_be_deleted_and_pop_up_message_shoud_be_displayed_as_something(String deleteMsg)
			throws Throwable {
		String text = page.quiz_delete_Pop_up();
		Assert.assertEquals(text, deleteMsg);
		page.Clickon_Successfulltemplate_delete_Pop_Up_Window();
	}

	@Then("^Quiz Template Should not be created and PopUp message should be displayed as \"([^\"]*)\"$")
	public void quiz_template_should_not_be_created_and_popup_message_should_be_displayed_as_something(String popupMsg)
			throws Throwable {
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray userLogInArray = (JSONArray) user.get("QuizTemplateWithInvaliddata");
		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			page = new QuizPage(DriverFactory.getDriver());
			webUtil.page_Load_Method();
			util.CustomWait();
			page.choose_New_Template();
			page.enter_New_Template_Name((String) details.get("Templatename"));
			page.enter_Title_Text((String) details.get("title"));
			page.enter_Description_Text((String) details.get("description"));
			page.enter_Passing_Text((String) details.get("Pass"));
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
			page.question_One_Answer();
			page.question_Two_Answer();
			page.question_Three_Answer();
			page.clickon_save_Template();
			String text = page.required_field_Pop_Up();
			Assert.assertEquals((String) details.get("reuirefiled"), text);
		}
	}

	@When("^creating new Quiz as \"([^\"]*)\" , title is \"([^\"]*)\", Description \"([^\"]*)\" and passing percentage is \"([^\"]*)\"$")
	public void creating_new_quiz_as_something_title_is_something_description_something_and_passing_percentage_is_something(
			String quiz, String title, String description, String percentage) throws Throwable {
		util = new UtilMethods();
		webUtil.page_Load_Method();
		util.CustomWait();
		util.creating_Quiz_For_Employees(quiz, title, description, percentage);

	}

	@Then("^the quiz should be creadted and Pop up message Sholud be displayed as \"([^\"]*)\"$")
	public void the_quiz_should_be_creadted_and_pop_up_message_sholud_be_displayed_as_something(String pop)
			throws Throwable {
		util.quiz_save_Successfully(pop);
	}

	@When("^navigate to the subscription page$")
	public void navigate_to_the_subscription_page() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		page.clickon_Subscription();
	}

	@And("^creating new subscription list as \"([^\"]*)\"$")
	public void creating_new_subscription_list_as_something(String subs) throws Throwable {
		sub = new Subscriptionpage(DriverFactory.getDriver());
		util.CustomWait();
		webUtil.page_Load_Method();
		sub.clickon_PlusButton();
		sub.enter_SubScription_Name(subs);
	}

	@And("^select template name as \"([^\"]*)\"$")
	public void select_template_name_as_something(String quizname) throws Throwable {
		sub.choose_Template(quizname);
		sub.select_Recipients("All Active Employees");
		sub.clickon_role();
		sub.select_Frequency("One Time");
		sub.select_Date();
	}

	@Then("^save the subscription list and Pop up Should be displayed as \"([^\"]*)\"$")
	public void save_the_subscription_list_and_pop_up_should_be_displayed_as_something(String pop) throws Throwable {
		sub.clickon_Save_Button();
		String text = sub.subScription_Successfull_Message();
		Assert.assertEquals(pop, text);
		sub.clickon_Pop_Up_Cancel();
	}

	@When("^user navigate to the message page$")
	public void user_navigate_to_the_message_page() throws Throwable {
		webUtil.page_Load_Method();
		util.CustomWait();
		sub.clickon_Message_Page();
	}

	@Then("^Let delete the Subscription quiz\"([^\"]*)\" but user not able to delete delete the subscritpion Quiz and get the text as \"([^\"]*)\"$")
	public void let_delete_the_subscription_quizsomething_but_user_not_able_to_delete_delete_the_subscritpion_quiz_and_get_the_text_as_something(
			String quiz, String pop) throws Throwable {
		util.CustomWait();
		webUtil.page_Load_Method();
		page.clickon_Choose_template_Edit_Buttton();
		page.subscription_Delete_Button(quiz);
		webUtil.page_Load_Method();
		String text = page.subScription_Delete_Pop_Up_Text();
		Assert.assertEquals(pop, text);
		page.clickon_SubScription_Pop_Up_Cancel();
		page.subscription_Delete_Button(quiz);
		page.clickon_SubScription_Pop_Up_Cross_Button();

	}

	@When("^navigate to the subscription list page$")
	public void navigate_to_the_subscription_list_page() throws Throwable {
		page.clickon_Subscription();
	}

	@Then("^Validate The \"([^\"]*)\" Subscription Quiz list edit Button function$")
	public void validate_the_something_subscription_quiz_list_edit_button_function(String quiz) throws Throwable {
		util.CustomWait();
		webUtil.page_Load_Method();
		sub.clickon_Subscription_Edit_Button(quiz);

	}

	@When("^Changing the Subscription name \"([^\"]*)\" to \"([^\"]*)\" of \"([^\"]*)\" quiz$")
	public void changing_the_subscription_name_something_to_something_of_something_quiz(String teasting, String Edting,
			String quiz) throws Throwable {
		sub.changing_The_Subcription_Name(Edting);
		sub.clickon_Edit_Save_Button();
	}

	@Then("^Verify the basic functionality for \"([^\"]*)\" quiz delete button and get the validation text as \"([^\"]*)\"$")
	public void verify_the_basic_functionality_for_something_quiz_delete_button_and_get_the_validation_text_as_something(
			String quiz, String pop) throws Throwable {
		sub.clickon_Delete_Button(quiz);
		sub.clickon_delete_No_Button();
		sub.clickon_Delete_Button(quiz);
		sub.clickon_delete_Yes_Button();
		String text = sub.get_Delete_Pop_Up_Text();
		Assert.assertEquals(pop, text);
		sub.clickon_Pop_Up_Cancel();
	}

	@Then("^Let delete the \"([^\"]*)\" quiz and successfull Message get as \"([^\"]*)\"$")
	public void let_delete_the_something_quiz_and_successfull_message_get_as_something(String Quiz, String pop)
			throws Throwable {
		util.CustomWait();
		webUtil.page_Load_Method();
		page.clickon_Choose_template_Edit_Buttton();
		page.quiz_delete(Quiz);
		String text = page.quiz_delete_Pop_up();
		Assert.assertEquals(text, pop);
		page.Clickon_Successfulltemplate_delete_Pop_Up_Window();
	}

	 @When("^Click on to button and Choose the to recipients$")
	    public void click_on_to_button_and_choose_the_to_recipients() throws Throwable {
		page = new QuizPage(DriverFactory.getDriver());
		util.CustomWait();
		webUtil.page_Load_Method();
		page.clickon_To_Button();
		page.clickon_Manager_Check_Box();
	}

	@And("^creating the new quiz as \"([^\"]*)\"$")
	public void creating_the_new_quiz_as_something(String Quiz) throws Throwable {
		util = new UtilMethods();
		util.creating_Quiz_For_Employees(Quiz, "Assign", "Checking the functionality", "60");
		page.question_One_Answer();
		page.question_Two_Answer();
		page.question_Three_Answer();
	}

	@Then("^Lets click on Send only button then the quiz is assigned to the recipients and pop up message is displayed as \"([^\"]*)\"$")
	public void lets_click_on_send_only_button_then_the_quiz_is_assigned_to_the_recipients_and_pop_up_message_is_displayed_as_something(
			String pop) throws Throwable {
		page.clickon_Send_Button();
		page.clickon_Send_Only_Button();
		sent=new SentPage(DriverFactory.getDriver());
		String text=sent.get_Quiz_Successfull_Message();
		Assert.assertEquals(text, pop);
	}
    @Then("^Lets click on Save and Send button then the quiz is saved,assigned to the recipients and pop up message is displayed as \"([^\"]*)\"$")
    public void lets_click_on_save_and_send_button_then_the_quiz_is_savedassigned_to_the_recipients_and_pop_up_message_is_displayed_as_something(String pop) throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	page.clickon_Send_Button();
		page.clickon_Save_And_Send_Button();
		sent=new SentPage(DriverFactory.getDriver());
		String text=sent.get_Quiz_Successfull_Message();
		Assert.assertEquals(text, pop);
		sent.clickon_Pop_Up_Cancel();
    }
    @When("^navigate to the quiz message page and click on teamplate Edit button$")
    public void navigate_to_the_quiz_message_page_and_click_on_teamplate_edit_button() throws Throwable {
        sent.clickon_Message();
        page.clickon_Choose_template_Edit_Buttton();
    }
    @Then("^to validate wheather the \"([^\"]*)\" quiz saved or not$")
    public void to_validate_wheather_the_something_quiz_saved_or_not(String quiz) throws Throwable {
    String name=page.get_Template_Name_Text(quiz);
    Assert.assertEquals(quiz, name);
    }
    @Then("^Let delete the \"([^\"]*)\" quiz and successfull Message is displayed as \"([^\"]*)\"$")
    public void let_delete_the_something_quiz_and_successfull_message_is_displayed_as_something(String quiz, String pop) throws Throwable {
		page.quiz_delete(quiz);
		String text = page.quiz_delete_Pop_up();
		Assert.assertEquals(text, pop);
		page.Clickon_Successfulltemplate_delete_Pop_Up_Window();
    }

    @When("^creating Quiz as \"([^\"]*)\" , title is \"([^\"]*)\", Description \"([^\"]*)\" and passing percentage is \"([^\"]*)\"$")
    public void creating_quiz_as_something_title_is_something_description_something_and_passing_percentage_is_something(String quiz, String title, String description, String percentage) throws Throwable {
    	util = new UtilMethods();
    	util.CustomWait();
		webUtil.page_Load_Method();
		util.creating_Quiz_For_Employees(quiz, title, description, percentage);
    }

    @Then("^Quiz should be creadted and Pop up message Sholud be displayed as \"([^\"]*)\"$")
    public void quiz_should_be_creadted_and_pop_up_message_sholud_be_displayed_as_something(String pop) throws Throwable {
    	util.quiz_save_Successfully(pop);
    }
    @When("^select new Template as \"([^\"]*)\"$")
    public void select_new_template_as_something(String template) throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	page.choose_Template_Drop_Down(template);
    }
    @When("^Let changing the template title as \"([^\"]*)\"$")
    public void let_changing_the_template_title_as_something(String title) throws Throwable {
        page.enter_Title_Text(title);
    }
    @Then("^click on update Template button then The template should be Updated and PopUp message should be displayed as \"([^\"]*)\"$")
    public void click_on_update_template_button_then_the_template_should_be_updated_and_popup_message_should_be_displayed_as_something(String pop) throws Throwable {
       page.clickon_Save_Template_Drop_Down();
       page.clickon_Update_Template_Button();
       String text=page.get_template_update_Pop_Text();
       Assert.assertEquals(text, pop);
       page.clickon_SuccessfullTemplateSave_Pop_Up_WindowCancel();
    }
    @Then("^let delete the \"([^\"]*)\" quiz and pop up message should be displayed as \"([^\"]*)\"$")
    public void let_delete_the_something_quiz_and_pop_up_message_should_be_displayed_as_something(String quiz, String pop) throws Throwable {
    	page.clickon_Choose_template_Edit_Buttton();
		page.quiz_delete(quiz);
		String text = page.quiz_delete_Pop_up();
		Assert.assertEquals(text, pop);
		page.Clickon_Successfulltemplate_delete_Pop_Up_Window();
    }

    @When("^Click on To button and nagivate to Select Role$")
    public void click_on_to_button_and_nagivate_to_select_role() throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	util = new UtilMethods();
    	util.CustomWait();
		webUtil.page_Load_Method();
    	page.clickon_To_Button();
    	page.clickon_Select_Role_Button();
    }

    @Then("^The \"([^\"]*)\" window is Dispalyed$")
    public void the_something_window_is_dispalyed(String text) throws Throwable {
        String title=page.get_Additional_Roles_text();
        Assert.assertEquals(text, title);
    }
    @And("^Click on all the check boxes$")
    public void click_on_all_the_check_boxes() throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	page.clickon_Additional_Roles_Check_Box();
    }
    @And("^Click on save button$")
    public void click_on_save_button() throws Throwable {
        page.clickon_Additional_roles_Cancel_Button();
        page.clickon_Select_Role_Button();
        page.clickon_Additional_roles_Cross_Button();
        page.clickon_Select_Role_Button();
        page.clickon_Additional_Roles_Save_Button();
    }
    @Then("^all \"([^\"]*)\" roles shoulb be selected$")
    public void all_something_roles_shoulb_be_selected(String number) throws Throwable {
       String num=page.get_Selected_To_List();
       Assert.assertEquals(number, num);
    }
    @When("^Select the new Template as \"([^\"]*)\"$")
    public void select_the_new_template_as_something(String newTemp) throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	util = new UtilMethods();
    	util.CustomWait();
		webUtil.page_Load_Method();
    	page.choose_Template_Drop_Down(newTemp);
    }
    @Then("^Click on Plus button up to 100 Questions then the \"([^\"]*)\" should be created.$")
    public void click_on_plus_button_up_to_100_questions_then_the_something_should_be_created(String Questions) throws Throwable {
        String text=page.clickon_100Question(Questions);
        Assert.assertEquals(text, Questions);
    }
    @And("^Fill The \"([^\"]*)\"text,Select\"([^\"]*)\" option,fill the options as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select answer$")
    public void fill_the_somethingtextselectsomething_optionfill_the_options_as_somethingsomethingsomething_and_select_answer(String question, String select, String ans1, String ans2, String ans3) throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	page.enetr_Question1(question);
    	page.select_Question_Drop_Down1(select);
    	page.enter_Question1_Option1(ans1);
    	page.enter_Question1_Option2(ans2);
    	page.enter_Question1_Option3(ans3);
    	page.question_One_Answer();
    }

    @And("^Click on copy button$")
    public void click_on_copy_button() throws Throwable {
        page.clickon_Copy_Button();
    }

    @Then("^The copy \"([^\"]*)\" should be created with the \"([^\"]*)\"option,options as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void the_copy_something_should_be_created_with_the_somethingoptionoptions_as_somethingsomethingsomething(String question, String select, String ans1, String ans2, String ans3) throws Throwable {
        String questionText=page.get_Question_Text();
        System.out.println(questionText);
        List<String> list=page.get_Options_Text();
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
        	String option= itr.next();
        	System.out.println(option);
        }
        //page.verifying_Questions_Check_Box();
       // Boolean check= Assert.assertTrue(check);
    }

    @When("^clickon save new template button$")
    public void clickon_save_new_template_button() throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	page.clickon_Save_Template_Drop_Down();
    	page.clickon_Save_New_Template_Drop_Down();
    	page.clickon_Template_Name_Cross();
    	page.clickon_Save_Template_Drop_Down();
    	page.clickon_Save_New_Template_Drop_Down();
    	page.clickon_Template_Name_Cancel_Button();
    }
    @When("^Enter the new \"([^\"]*)\"$")
    public void enter_the_new_something(String newName) throws Throwable {
    	 Template=newName;
       page.template_Name(newName);
       page.clickon_Template_Name_Save_Button();
    }
    @Then("^the pop up message should be display as\"([^\"]*)\"$")
    public void the_pop_up_message_should_be_display_assomething(String pop) throws Throwable {
    	String name=page.clickon_New_Template_Pop_Up_Message();
    	Assert.assertEquals(name, pop);
    	webUtil.page_Load_Method();
    	page.clickon_Choose_template_Edit_Buttton();
    	page.quiz_delete(Template);
    }

    @When("^Click on To button and Manager Check box$")
    public void click_on_to_button_and_manager_check_box() throws Throwable {
    	page = new QuizPage(DriverFactory.getDriver());
    	page = new QuizPage(DriverFactory.getDriver());
    	util = new UtilMethods();
    	util.CustomWait();
    	page.clickon_To_Button();
    	page.clickon_Manager_Check_Box();
    	page.get_manager_Text();
    	
    }
}
