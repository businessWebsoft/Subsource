package Parallel;

import org.openqa.selenium.WebDriver;
import com.pages.HomePage;
import com.pages.ManageApplicants;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;

public class ManageApplicantsTest {

	WebDriver driver;
	HomePage home;
	ManageApplicants manage;

	@Given("^user navigate to the manage applicants page$")
	public void user_navigate_to_the_manage_applicants_page() throws InterruptedException {
		home = new HomePage(DriverFactory.getDriver());
		home.Clickon_HomePage();
		manage = new ManageApplicants(DriverFactory.getDriver());
		home.Clickon_Human_Resources();
		home.Clickon_Hire_New_Employee();
		manage.clickon_Dropdown();
		manage.clickon_Manage_Applicants();
	}

	@When("^Click on dropdown and select manage applicants$")
	public void Click_on_dropdown_and_select_manage_applicants() throws InterruptedException {
	}

	@When("^Click on applicants name to check applicants information window$")
	public void Click_on_applicants_name_to_check_applicants_information_window() throws InterruptedException {
		String name = "Sehgal k  Akhilesh";
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickon_Applicant_Name(name);
	}

	@Then("^click on buttons one by one available on the window$")
	public void click_on_buttons_one_by_one_available_on_the_window() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickon_Buttons();
	}

	@Then("^click on combined and then click on sections$")
	public void click_on_combined_and_then_click_on_sections() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickon_Combined();
		manage.clickon_Sections();
	}

	@Then("^click on share icon$")
	public void click_on_share_icon() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickon_Share_Icon();
	}

	@Then("^enter email id and click on send button$")
	public void enter_email_id_and_click_on_send_button() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.email();
		manage.clickon_Send_Button();
	}

	@When("^Click on right single arrow$")
	public void Click_on_right_single_arrow() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_right_Single_Arrow();
	}

	@When("^Click on left single arrow$")
	public void Click_on_left_single_arrow() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_left_Single_Arrow();
	}

	@Then("^Click on right double arrow$")
	public void Click_on_right_double_arrow() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_right_Double_Arrow();
	}

	@Then("^Click on left double arrow$")
	public void Click_on_left_double_arrow() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_left_Double_Arrow();
	}

	@Then("^Click on individual pages$")
	public void Click_on_individual_pages() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_Individual_Pages();
	}

	@When("^Click on view per page$")
	public void Click_on_view_per_page() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_View_Per_Page();
	}

	@When("^Click on days button one by one$")
	public void Click_on_days_button_one_by_one() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_today();
		manage.clickOn_7days();
		manage.clickOn_30days();
		manage.clickOn_90days();
		manage.clickOn_ViewAll();
		manage.clickOn_Referred();
	}

	@When("^Click on search button$")
	public void Click_on_search_button() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_Search_Filter();
	}

	@Then("^Select shop and status$")
	public void Select_shop_and_status() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.select_Shop();
		manage.select_Status();
	}

	@When("^Click on hire$")
	public void Click_on_hire() throws InterruptedException {
		String name = "Dominique S Faniel";
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.clickOn_Hire(name);
	}

	@Then("^Select shop for referred$")
	public void Select_shop_for_referred() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.select_Shop_Referred();
	}

	@And("^click on continue button$")
	public void click_on_continue_button() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.ClickOn_Continue();
	}

	@And("^Click on cancel$")
	public void Click_on_cancel() throws InterruptedException {
		manage = new ManageApplicants(DriverFactory.getDriver());
		manage.ClickOn_Cancel();
		Thread.sleep(10000);
	}

}
