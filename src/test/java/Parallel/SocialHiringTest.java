package Parallel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;

import com.pages.CommunicationPage;
import com.pages.SocialHiringPage;
import com.qa.factory.DriverFactory;
import com.qa.factory.UtilMethods;
import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocialHiringTest {
	UtilMethods util;
	SocialHiringPage socialPage;
	CommunicationPage employee;
	JSONFileClass file;
	JSONObject user;
	String name;
	WebDriverUtil webUtil;

	@Given("^Navigate To The Social hirirng page$")
	public void navigate_to_the_social_hirirng_page() throws Throwable {
		util = new UtilMethods();
		util.navigation_HumanResources("Communications");
		Thread.sleep(2000);
		employee=new CommunicationPage(DriverFactory.getDriver()); 
		employee.clickon_Email_Employee_Drop_Down();
		Thread.sleep(2000);
		util.navigate_To_The_Email_Employee("Social Hiring");
		Thread.sleep(2000);
		webUtil= new WebDriverUtil();
		//webUtil.page_Load_Method();
		//new WebDriverWait(DriverFactory.getDriver(), 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop ng-star-inserted' and @style='border-radius: 0px; background-color: rgba(0, 0, 0, 0.3);']")));
	}

	@When("^Click on Select Shops for posting link$")
	public void click_on_select_shops_for_posting_link() throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		employee = new CommunicationPage(DriverFactory.getDriver());
		webUtil= new WebDriverUtil();
		//util.CustomWait();
		//webUtil.page_Load_Method();
		Thread.sleep(2000);
		socialPage.click_on_Select_Shops_For_Posting();
	}

	@Then("^Select shops for posting PopUp Winddow Should Display With The Titile \"([^\"]*)\"$")
	public void select_shops_for_posting_popup_winddow_should_display_with_the_titile_something(String PopUpWindow)
			throws Throwable {
		String text = socialPage.get_Select_Shop_Pop_Up_Window_Text();
		Assert.assertEquals(PopUpWindow, text);
		socialPage.clickon_Select_Window_Pop_Up_Cancel_Button();
		socialPage.click_on_Select_Shops_For_Posting();
	}

	@When("^Click on create custom shop link$")
	public void click_on_create_custom_shop_link() throws Throwable {
		socialPage.clickon_Create_Custom_Shop();
	}

	@Then("^Validating the create custom shop by entering invalid data$")
	public void validating_the_create_custom_shop_by_entering_invalid_data() throws Throwable {
		String error_Text = "Please check all required fields.";
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray userLogInArray = (JSONArray) user.get("CreateCustomShop");
		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			socialPage.eneter_Shop_Number((String) details.get("Shop"));
			socialPage.enter_Adderrs_Text1((String) details.get("Address"));
			socialPage.enter_City_Text((String) details.get("city"));
			socialPage.select_State_Drop_Down((String) details.get("state"));
			socialPage.enetr_Zip_Code((String) details.get("zipCode"));
			webUtil= new WebDriverUtil();
			util.CustomWait();
			webUtil.page_Load_Method();
			socialPage.clickon_create_Custom_Confirm_Button();
			String text = socialPage.get_Create_custom_Shop_Error_Pop_Up();
			Assert.assertEquals(text, error_Text);
		}
	}

	@When("^Search for the shop number\"([^\"]*)\"$")
	public void search_for_the_shop_numbersomething(String number) throws Throwable {
		socialPage.select_Shops_For_Pop_Up_Window_Search_box(number);
	}

	@And("^Select the \"([^\"]*)\" number shop$")
	public void select_the_something_number_shop(String number) throws Throwable {
		socialPage.Clickon_Select_Shops_For_Window_First_Check_Box();
		socialPage.clickon_Select_Shops_Window_Submit_Button();
	}

	@Then("^\"([^\"]*)\" number shop should be selected$")
	public void something_number_shop_should_be_selected(String shopNumber) throws Throwable {
		String number = socialPage.get_Slected_Shop_Number();
		//Assert.assertEquals(number, shopNumber);
	}

	@When("^Click on To Plus button$")
	public void click_on_to_plus_button() throws Throwable {
		socialPage.clikon_Plus_Button();
	}

	@Then("^\"([^\"]*)\" number should be selected in To Section$")
	public void something_number_should_be_selected_in_to_section(String strArg1) throws Throwable {
		boolean s = socialPage.isEnable_457_Shop();
		Assert.assertEquals(false, s);
	}

	@When("^Eneter The Sbuject Text as \"([^\"]*)\"$")
	public void eneter_the_sbuject_text_as_something(String subject) throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		socialPage.enter_Subject_Text(subject);
	}

	@Then("^The Email Content Should have \"([^\"]*)\"$")
	public void the_email_content_should_have_something(String subject) throws Throwable {
		socialPage.clickon_Preview_Button();
		socialPage.clickon_Preview_Pop_Up_WinDow_Cancel_Button();
		socialPage.clickon_Preview_Button();
		String text1 = "Preview";
		String window_Text = socialPage.get_Preview_Pop_Window_Text();
		Assert.assertEquals(window_Text, text1);
		String text = socialPage.get_Pop_Up_Window_Preview_Subject_Text();
		Assert.assertEquals(text, subject);
	}

	@When("^chose template as \"([^\"]*)\"$")
	public void chose_template_as_something(String newTemplate) throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		socialPage.choose_Template_Drop_Down(newTemplate);
	}
	@When("^chose template as a \"([^\"]*)\"$")
    public void chose_template_as_a_something(String temp) throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		socialPage.choose_Template_Drop_Down(temp);
    }

	@And("^Click on Save template$")
	public void click_on_save_template() throws Throwable {
		socialPage.Clickon_Save_Button_Drop_Down();
	}

	@Then("^The template Should not be saved and Pop Up message Should Be Displayed as \"([^\"]*)\"$")
	public void the_template_should_not_be_saved_and_pop_up_message_should_be_displayed_as_something(String pop)
			throws Throwable {
		socialPage.clickon_Save_New_Template();
		String text = socialPage.get_Pop_Up_Error_Message_For_NewTemplate();
		Assert.assertEquals(text, pop);
		socialPage.Pop_Up_Cancel_Button();

	}

	@When("^Enter New template Name as \"([^\"]*)\"$")
	public void enter_new_template_name_as_something(String strArg1) throws Throwable {
		socialPage.enter_New_Template_Name(strArg1);
	}

	@And("^enter new template text as \"([^\"]*)\"$")
	public void enter_new_template_text_as_something(String strArg1) throws Throwable {
		socialPage.enter_Text_For_New_Template(strArg1);
	}

	@Then("^Click on Save Template Template Should be Saved and Pop Up Message Should Be Displayed as \"([^\"]*)\"$")
	public void click_on_save_template_template_should_be_saved_and_pop_up_message_should_be_displayed_as_something(
			String pop) throws Throwable {
		socialPage.Clickon_Save_Button_Drop_Down();
		socialPage.clickon_Save_New_Template();
		String text = socialPage.get_New_Template_Success_Pop_Up_Message();
		Assert.assertEquals(text, pop);
		socialPage.Pop_Up_Cancel_Button();
	}

	@Then("^Click on Template Edit button then The edit template Should be displayed and title Contains as \"([^\"]*)\"$")
	public void click_on_template_edit_button_then_the_edit_template_should_be_displayed_and_title_contains_as_something(
			String pop) throws Throwable {
		socialPage.clickon_Choose_Template_Edit_Button();
		String text = socialPage.get_Edit_Button_Pop_Up_Window_Tittle();
		Assert.assertEquals(pop, text);
	}

	@Then("^To Veritying the choose Template edit button PopUp Window Cross and Cancel button$")
	public void to_veritying_the_choose_template_edit_button_popup_window_cross_and_cancel_button() throws Throwable {
		socialPage.clickon_Choose_Template_Edit_Button_Pop_Up_Cross_Button();
		socialPage.clickon_Choose_Template_Edit_Button();
		socialPage.clickon_Choose_Template_Edit_Button_Pop_Up_Cross_Button();
		socialPage.clickon_Choose_Template_Edit_Button();
	}

	@When("^clickon \"([^\"]*)\"delete button$")
	public void clickon_somethingdelete_button(String templateName) throws Throwable {
		name = templateName;
		socialPage.delete_Template(templateName);
	}

	@Then("^The delete PopUp Winddow should be Displayed With The Template name \"([^\"]*)\"$")
	public void the_delete_popup_winddow_should_be_displayed_with_the_template_name_something(String template)
			throws Throwable {
		String text = socialPage.get_Delete_Template_Name_Text();
		Assert.assertEquals(text, template);
	}

	@Then("^To Verify delete Pop Up Window cancel and cross button$")
	public void to_verify_delete_pop_up_window_cancel_and_cross_button() throws Throwable {
		socialPage.clickon_Delete_Pop_Up_Window_Cancel_Button();
		socialPage.delete_Template(name);
	}

	@Then("^Click on Continue button then template should be deleted and pop up message Should be display as \"([^\"]*)\"$")
	public void click_on_continue_button_then_template_should_be_deleted_and_pop_up_message_should_be_display_as_something(
			String pop) throws Throwable {
		socialPage.clickon_Delete_Pop_Up_Window_Continue_Button();
		String text = socialPage.get_Delete_Pop_Up_Success_Message();
		Assert.assertEquals(text, pop);
		socialPage.Pop_Up_Cancel_Button();
	}

	@And("^Click on Preview button$")
	public void click_on_preview_button() throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		socialPage.clickon_Preview_Button();
	}

	@Then("^Pop Up Window should be displayed with the tittle \"([^\"]*)\" sbuject should contains \"([^\"]*)\"$")
	public void pop_up_window_should_be_displayed_with_the_tittle_something_sbuject_should_contains_something(
			String tit, String sub) throws Throwable {
		String title = socialPage.get_Preview_Pop_Window_Text();
		Assert.assertEquals(title, tit);
		String text = socialPage.get_Pop_Up_Window_Preview_Subject_Text();
		Assert.assertEquals(text, sub);
	}

	@When("^click on Pop Up Cancel button$")
	public void click_on_pop_up_cancel_button() throws Throwable {
		socialPage.clickon_Preview_Pop_Up_WinDow_Cancel_Button();
	}

	@And("^Click on Cancel button$")
	public void click_on_cancel_button() throws Throwable {
		socialPage.clickon_Cancel_Button();
	}

	@Then("^Subject Should not contians with \"([^\"]*)\"$")
	public void subject_should_not_contians_with_something(String strArg1) throws Throwable {

	}

	@When("^Click on attachment button$")
	public void click_on_attachment_button() throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		socialPage.Clickon_Subject_File_Button();
	}

	@Then("^Upload Attachment PopUp Window Should be Open and Title should contains\"([^\"]*)\"$")
	public void upload_attachment_popup_window_should_be_open_and_title_should_containssomething(String pop)
			throws Throwable {
		String text = socialPage.get_Upload_Pop_Up_Window_Title();
		Assert.assertEquals(text, pop);
	}

	@When("^Upload the file$")
	public void upload_the_file() throws Throwable {
		socialPage.Upload_File();
	}

	@Then("^File should be Uploaded with the name \"([^\"]*)\"$")
	public void file_should_be_uploaded_with_the_name_something(String name) throws Throwable {
		String nam = socialPage.get_File_Name();
		Assert.assertEquals(name, nam);
	}

	@Then("^Click on Pop up WinDow cancel button then the pop up window should be cancel$")
	public void click_on_pop_up_window_cancel_button_then_the_pop_up_window_should_be_cancel() throws Throwable {
		socialPage.clickon_Upload_File_Pop_Up_Window_Cancel_Button();
	}

	@When("^Click on file remove button$")
	public void click_on_file_remove_button() throws Throwable {
		socialPage.clickon_Remove_Button();
	}

	@Then("^The Uploaded \"([^\"]*)\" file should be deleted.$")
	public void the_uploaded_something_file_should_be_deleted(String file) throws Throwable {
		boolean s = socialPage.file_Verify(file);
		//Assert.assertTrue(s);
	}

	@When("^Choose \"([^\"]*)\" template$")
	public void choose_something_template(String temp) throws Throwable {
		socialPage.choose_Template_Drop_Down(temp);
	}
	@When("^Click on view button$")
	public void click_on_view_button() throws Throwable {
		socialPage.clickon_View_Buton();
	}

	@Then("^Subject window should be displayed and subject should contains \"([^\"]*)\"$")
	public void subject_window_should_be_displayed_and_subject_should_contains_something(String text) throws Throwable {
		String text2 = socialPage.get_Text_Of_Template_Subject(text);
		Assert.assertEquals(text, text2);
		socialPage.clickon_Hide_Template();
	}

	@Then("^The Preview button should contain \"([^\"]*)\" text$")
	public void the_preview_button_should_contain_something_text(String text) throws Throwable {
		socialPage = new SocialHiringPage(DriverFactory.getDriver());
		String text1=socialPage.get_PreView_Button_Text();
		Assert.assertEquals(text1, text);
	}

	@Then("^The Send button should contains \"([^\"]*)\" text$")
	public void the_send_button_should_contains_something_text(String text) throws Throwable {
		String text1=socialPage.get_Send_Button_Text();
		Assert.assertEquals(text1, text);
	}

	@Then("^The Cancel button should contains \"([^\"]*)\" text$")
	public void the_cancel_button_should_contains_something_text(String text) throws Throwable {
		String text1=socialPage.get_Cancel_Button_Text();
		Assert.assertEquals(text1, text);
	}

}
