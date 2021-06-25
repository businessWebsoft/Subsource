package Parallel;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import com.pages.AccountSettings;
import com.pages.HomePage;
import com.pages.ShopPage2;
import com.pages.ShopPage1;
import com.qa.factory.DriverFactory;
import com.qa.util.JSONFileClass;
import io.cucumber.java.en.*;

public class ShopTest {
	WebDriver driver;
	ShopPage1 shop_Details;
	JSONFileClass file1;
	JSONObject user1;
	String shoppy;
	String email_New_Hire;
	String email_Weekly_Schedule;
	String email_engagement_Email;
	String email_BGC_Email;
	String email_Verify;
	String email_Applicant;
	AccountSettings account;
	ApplicationHooks base;
	ShopPage2 new_Shop_Details;
	HomePage home;

	@Given("user navigate to the shop page")
	public void user_navigate_to_the_shop_page() throws InterruptedException {
		home = new HomePage(DriverFactory.getDriver());
		home.Clickon_HomePage();
		home = new HomePage(DriverFactory.getDriver());
		account = new AccountSettings(DriverFactory.getDriver());
		home.clickon_Settings();
		home.clickon_Account_Settings();
		account.click_Shop();
	}

	@When("Click on shop link")
	public void Click_on_shop_link() throws InterruptedException {
		Thread.sleep(1000);
	}

	@When("Go to shop page")
	public void Go_to_shop_page() throws InterruptedException {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_Toggle_Button();
		shop_Details.click_AddNew();
	}

	@Then("Click on shop number text field and verify")
	public void Click_on_shop_number_text_field_and_verify() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopField");
		for (int i = 0; i <= 0; i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
		}
	}

	@Then("Fill all the details")
	public void Fill_all_the_details() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopValidEmail");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.click_Save_Button();
	}

	@Then("delete the shop")
	public void delete_the_shop() throws InterruptedException {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.delete(shoppy);
	}

	@Then("Again go to shop page")
	public void Again_go_to_shop_page() throws InterruptedException {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_Toggle_Button();
		shop_Details.click_AddNew();
	}

	@Then("Again Fill all the details")
	public void Again_Fill_all_the_details() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopInvalidEmail");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
		}

	}

	@Then("click on region dropdown to check alphabetical order")
	public void click_on_region_dropdown_to_check_alphabetical_order() throws InterruptedException {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.region_Alphabetical_Order();
	}

	@Then("click all the toggle buttons")
	public void click_all_the_toggle_buttons() throws InterruptedException {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.click_All_Toggle_Buttons();
	}

	@Then("check address field")
	public void check_address_field() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopAddress");
		for (int i = 0; i <= 0; i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
		}
	}

	@Then("click on state dropdown to check alphabetical order")
	public void click_on_state_dropdown_to_check_alphabetical_order() throws InterruptedException {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.state_Alphabetical_Order();
	}

	@Then("Fill the details")
	public void Fill_the_details() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopValidZipcode");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("Again Fill the details")
	public void Again_Fill_the_details() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopInalidZipcode");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("Fill the details to check Variable Rent and Royality")
	public void Fill_the_details_to_check_Variable_Rent_and_Royality()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopValidVariableRentAndRoyality");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("Again Fill the details to check Variable Rent and Royality")
	public void Again_Fill_the_details_to_check_Variable_Rent_and_Royality()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopInvalidVariableRentAndRoyality");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("Fill the details to check Fixed Misc Costs")
	public void Fill_the_details_to_check_Fixed_Misc_Costs() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopValidFixedMiscCosts");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("Again Fill the details to check Fixed Misc Costs")
	public void Again_Fill_the_details_to_check_Fixed_Misc_Costs()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopInvalidFixedMiscCosts");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

	@Then("click on cancel button")
	public void click_on_cancel_button() throws InterruptedException {
		Thread.sleep(2000);
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.click_Cancel_Button();
	}

	@Then("Fill the details including dates")
	public void Fill_the_details_including_dates() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopDateCheck");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}
		Thread.sleep(1000);
		new_Shop_Details.select_Wrong_Date();
	}

	@When("Go to edit misc page")
	public void Go_to_edit_misc_page() throws InterruptedException {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_Toggle_Button();
		shop_Details.click_Edit_Misc();
		Thread.sleep(1000);
	}

	@Then("select the shop")
	public void select_the_shop() throws InterruptedException {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_shop();
	}

	@Then("click on cancel")
	public void click_on_cancel() throws Throwable {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.cancel1();
	}

	@Then("go to the shop and update city")
	public void go_to_the_shop_and_update_city() throws InterruptedException {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.update_City(shoppy);
		Thread.sleep(2000);
		shop_Details.check_Update(shoppy);
	}

	@Then("Fill the details to check email notification section")
	public void Fill_the_details_to_check_email_notification_section()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.click_All_Toggle_Buttons();
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopEmailFormat");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			email_New_Hire = (String) details.get("email1");
			email_Weekly_Schedule = (String) details.get("email2");
			email_engagement_Email = (String) details.get("email3");
			email_BGC_Email = (String) details.get("email4");
			email_Verify = (String) details.get("email5");
			email_Applicant = (String) details.get("email6");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.select_Right_Date();
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
			new_Shop_Details.enterNewHire((String) details.get("email1"));
			Thread.sleep(1000);
			new_Shop_Details.enterWeeklyScheduleEmail((String) details.get("email2"));
			Thread.sleep(1000);
			new_Shop_Details.enterEngagementEmail((String) details.get("email3"));
			Thread.sleep(1000);
			new_Shop_Details.enterBGCEmail((String) details.get("email4"));
			Thread.sleep(1000);
			new_Shop_Details.enterE_Verify((String) details.get("email5"));
			Thread.sleep(1000);
			new_Shop_Details.enter_Applicant((String) details.get("email6"));
		}

	}

	@Then("update an email")
	public void update_an_email() throws InterruptedException {
		Thread.sleep(2000);
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		shop_Details.click_On_Shop(shoppy);
		new_Shop_Details.update_Emails();
	}

	@Then("Again to the shop and remove an email")
	public void Again_to_the_shop_and_remove_an_email() throws InterruptedException {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_On_Shop(shoppy);
		shop_Details.scroll_Down();
		shop_Details.remove_Email(email_New_Hire);
		Thread.sleep(1000);
		shop_Details.remove_Email(email_Weekly_Schedule);
		Thread.sleep(1000);
		shop_Details.remove_Email(email_engagement_Email);
		Thread.sleep(1000);
		shop_Details.remove_Email(email_BGC_Email);
		Thread.sleep(1000);
		shop_Details.remove_Email(email_Verify);
		Thread.sleep(1000);
		shop_Details.remove_Email(email_Applicant);
	}

	@Then("Enter numeric data in shop number text field")
	public void Enter_numeric_data_in_shop_number_text_field()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopTextFieldNumber");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			new_Shop_Details.enterShop((String) details.get("shop"));
			Thread.sleep(1000);
		}
	}

	@Then("Enter character data in shop number text field")
	public void Enter_character_data_in_shop_number_text_field()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopTextFieldCharacter");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			new_Shop_Details.enterShop((String) details.get("shop"));
			Thread.sleep(1000);
		}
	}

	@Then("Fill the details except mandatory fields")
	public void Fill_the_details_except_mandatory_fields() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.click_All_Toggle_Buttons();
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopPageValidation");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.select_Right_Date();
			new_Shop_Details.enterNewHire((String) details.get("email1"));
			Thread.sleep(1000);
			new_Shop_Details.enterWeeklyScheduleEmail((String) details.get("email2"));
			Thread.sleep(1000);
			new_Shop_Details.enterEngagementEmail((String) details.get("email3"));
			Thread.sleep(1000);
			new_Shop_Details.enterBGCEmail((String) details.get("email4"));
			Thread.sleep(1000);
			new_Shop_Details.enterE_Verify((String) details.get("email5"));
			Thread.sleep(1000);
			new_Shop_Details.enter_Applicant((String) details.get("email6"));
		}
	}

	@Then("click on save button and scroll up")
	public void click_on_save_button_and_scroll_up() throws InterruptedException {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		new_Shop_Details.click_Save_Button();
		shop_Details.scroll_Up();
		new_Shop_Details.displayMessage();
	}

	@Then("Fill the details except some mandatory fields")
	public void Fill_the_details_except_some_mandatory_fields()
			throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.click_All_Toggle_Buttons();
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopPageValidationAgain");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.select_Right_Date();
			new_Shop_Details.enterNewHire((String) details.get("email1"));
			Thread.sleep(1000);
			new_Shop_Details.enterWeeklyScheduleEmail((String) details.get("email2"));
			Thread.sleep(1000);
			new_Shop_Details.enterEngagementEmail((String) details.get("email3"));
			Thread.sleep(1000);
			new_Shop_Details.enterBGCEmail((String) details.get("email4"));
			Thread.sleep(1000);
			new_Shop_Details.enterE_Verify((String) details.get("email5"));
			Thread.sleep(1000);
			new_Shop_Details.enter_Applicant((String) details.get("email6"));
		}
	}

	@Then("click on delete icon and match shop number")
	public void click_on_delete_icon_and_match_shop_number() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.shop_Match(shoppy);
	}

	@Then("delete shop")
	public void delete_shop() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_Delete_Yes_Button();
	}

	@When("click on export button")
	public void click_on_export_button() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_Export();
		Thread.sleep(2000);
	}

	@Then("click on PDF")
	public void click_on_PDF() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_PDF();
		Thread.sleep(2000);
	}

	@Then("click on excel")
	public void click_on_excel() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_Excel();
		Thread.sleep(3000);
	}

	@Then("click on delete icon")
	public void click_on_delete_icon() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.delete_Icon(shoppy);
	}

	@Then("click on No button")
	public void click_on_No_button() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_No_Button();
	}

	@Then("click on Cross button")
	public void click_on_Cross_button() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_Cross_Button();
	}

	@Then("click on Yes button")
	public void click_on_Yes_button() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_Delete_Yes_Button();
	}

	@When("Go to shop import page")
	public void Go_to_shop_import_page() throws InterruptedException {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_Toggle_Button();
		shop_Details.clickOn_Import_Button();
	}

	@Then("click on choose button and select file")
	public void click_on_choose_button_and_select_file() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.select_Wrong_File();
	}

	@Then("click on Food Cost Distributor dropdown to check alphabetical order")
	public void click_on_Food_Cost_Distributor_dropdown_to_check_alphabetical_order() throws Throwable {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.food_Cost_Distributor_Alphabetical_Order();
	}

	@Then("click on company dropdown to check alphabetical order")
	public void click_on_company_dropdown_to_check_alphabetical_order() throws Throwable {
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.company_Alphabetical_Order();
	}

	@Then("go to the shop and update variable rent and fixed misc")
	public void go_to_the_shop_and_update_variable_rent_and_fixed_misc() throws InterruptedException {
		Thread.sleep(2000);
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		new_Shop_Details.update_VariableRent_And_FixedMisc(shoppy);
	}

	@Then("click on download sample file link")
	public void click_on_download_sample_file_link() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.download_File();
	}

	@Then("click on choose button and select the file to be uploaded")
	public void click_on_choose_button_and_select_the_file_to_be_uploaded() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.select_Add_File();
	}

	@Then("click on shop upload button")
	public void click_on_shop_upload_button() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.clickOn_Upload_Button();
	}

	@Then("Go to recently added shop")
	public void Go_to_recently_added_shop() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		shop_Details.click_On_Shop("125");
		shop_Details.scroll_Down();
		new_Shop_Details.click_Cancel_Button();
	}

	@Then("delete the recently added shop")
	public void delete_the_recently_added_shop() throws InterruptedException {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.delete("125");
		Thread.sleep(3000);
	}

	@Then("select the file to create new shop")
	public void select_the_file_to_create_new_shop() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		shop_Details.add_Shop();
		shop_Details.clickOn_Upload_Button();
		shop_Details.click_On_Shop("125");
		shop_Details.scroll_Down();
		new_Shop_Details.click_Cancel_Button();
	}

	@Then("again go to shop import page")
	public void again_go_to_shop_import_page() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.click_Toggle_Button();
		shop_Details.clickOn_Import_Button();
	}

	@Then("select the file to update newly created shop")
	public void select_the_file_to_update_newly_created_shop() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		shop_Details.update_Shop();
	}

	@Then("Go to the shop to check for updation")
	public void Go_to_the_shop_to_check_for_updation() throws Throwable {
		shop_Details = new ShopPage1(DriverFactory.getDriver());
		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		shop_Details.click_On_Shop("125");
		shop_Details.scroll_Down();
		new_Shop_Details.click_Cancel_Button();
	}

	@Then("Fill the details to check updation")
	public void Fill_the_details_to_check_updation() throws InterruptedException, IOException, ParseException {

		new_Shop_Details = new ShopPage2(DriverFactory.getDriver());
		file1 = new JSONFileClass();
		user1 = file1.readJsonShop();
		JSONArray userLogInArray1 = (JSONArray) user1.get("shopUpdate");
		for (int i = 0; i < userLogInArray1.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray1.get(i);
			shoppy = (String) details.get("shop");
			new_Shop_Details.enterShop((String) details.get("shop"));
			new_Shop_Details.enterEmail((String) details.get("email"));
			new_Shop_Details.select_Region((String) details.get("region"));
			new_Shop_Details.enterAddress1((String) details.get("address1"));
			new_Shop_Details.enterAddress2((String) details.get("address2"));
			new_Shop_Details.enterCity((String) details.get("city"));
			new_Shop_Details.stateDropDown((String) details.get("state"));
			new_Shop_Details.enterZipoCode((String) details.get("zipCode"));
			new_Shop_Details.enterRent((String) details.get("rent"));
			new_Shop_Details.enterCost((String) details.get("cost"));
			new_Shop_Details.foodCostDistributorDropDown((String) details.get("food_Cost_Distributor"));
			new_Shop_Details.companyIDDropDown((String) details.get("company"));
		}

	}

}
