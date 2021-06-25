package Parallel;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import com.pages.AccountSettings;
import com.pages.CompanyPage1;
import com.pages.CompanyPage2;
import com.pages.HomePage;
import com.pages.LogInPage;
import com.qa.factory.DriverFactory;
import com.qa.util.JSONFileClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyTest {
	WebDriver driver;
	LogInPage logIn;
	JSONFileClass file;
	JSONObject user;
	CompanyPage2 employee;
	CompanyPage1 companyAccount;
	String CompanyName;
	AccountSettings account;
	HomePage home;

	@Given("^user navigate to the company page$")
	public void user_navigate_to_the_company_page() throws InterruptedException {
		home = new HomePage(DriverFactory.getDriver());
		home.Clickon_HomePage();
		home = new HomePage(DriverFactory.getDriver());
		home.clickon_Settings();
		home.clickon_Account_Settings();
		account = new AccountSettings(DriverFactory.getDriver());
		account.clickon_company();
	}

	@When("^Go to company page and try to create new company without filling mandatory fields$")
	public void Go_to_company_page_and_try_to_create_new_company_without_filling_mandatory_fields()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetails");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and fill invalid EIN number$")
	public void Go_to_company_page_and_fill_invalid_EIN_number()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsEinFormat");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and do not fill EIN number$")
	public void Go_to_company_page_and_do_not_fill_EIN_number()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsEinVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and fill all the details$")
	public void Go_to_company_page_and_fill_all_the_details() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsSaveButton");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and left some mandatory fields$")
	public void Go_to_company_page_and_left_some_mandatory_fields()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsSaveVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and fill invalid zipcode$")
	public void Go_to_company_page_and_fill_invalid_zipcode() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsZipcodeVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and fill invalid phone number$")
	public void Go_to_company_page_and_fill_invalid_phone_number()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsphoneVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and check State drop down list box$")
	public void Go_to_company_page_and_check_State_drop_down_list_box() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		Thread.sleep(2000);
		employee.drop();
	}

	@When("^Go to company page and fill all the details without enabling any of the toggle button EVerify or Enable ACA$")
	public void Go_to_company_page_and_fill_all_the_details_without_enabling_any_of_the_toggle_button_EVerify_or_Enable_ACA()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailstoggleVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and on and off toggle buttons$")
	public void Go_to_company_page_and_on_and_off_toggle_buttons() throws InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.toggle();
	}

	@When("^Go to company page and on and off ACA toggle button$")
	public void Go_to_company_page_and_on_and_off_ACA_toggle_button() throws InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.ACA_toggle();
	}

	@When("^Go to company page enable EVerify toggle button and fill username and password fields$")
	public void Go_to_company_page_enable_EVerify_toggle_button_and_fill_username_and_password_fields()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsEVerifyCredentials");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_username_Everify((String) details.get("E_User_Name"));
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Go to company page and enable Everify toggle button and fill maximum length in UserName field$")
	public void Go_to_company_page_and_enable_Everify_toggle_button_and_fill_maximum_length_in_UserName_field()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsMaxLenghtUsernameEverify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_username_Everify((String) details.get("E_User_Name"));
		}
	}

	@When("^Go to company page and fill all the required fields$")
	public void Go_to_company_page_and_fill_all_the_required_fields()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsCancelVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and add new company$")
	public void Go_to_company_page_and_add_new_company() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsMessageVerify");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and enable Everify toggle button and fill password field and to check encrypted form$")
	public void Go_to_company_page_and_enable_Everify_toggle_button_and_fill_password_field_and_to_check_encrypted_form()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsEVerifyPassword");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Go to company page and enable Everify toggle button and fill maximum length in password field$")
	public void Go_to_company_page_and_enable_Everify_toggle_button_and_fill_maximum_length_in_password_field()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsEVerifyMaxPassword");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Go to company page and fill details and add new company$")
	public void Go_to_company_page_and_fill_details_and_add_new_company()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsNewAddition");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
			employee.enter_username_Everify((String) details.get("E_User_Name"));
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Go to company page and fill the details and create new company$")
	public void Go_to_company_page_and_fill_the_details_and_create_new_company()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsUpdation");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
			employee.enter_username_Everify((String) details.get("E_User_Name"));
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Create new company$")
	public void Create_new_company() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsDeletion");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
			employee.enter_username_Everify((String) details.get("E_User_Name"));
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Create new company and delete it to check display of confirmation message before deleting a company$")
	public void Create_new_company_and_delete_it_to_check_display_of_confirmation_message_before_deleting_a_company()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.checkToggle();
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsDeletion");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
			employee.enter_username_Everify((String) details.get("E_User_Name"));
			employee.enter_Password_Everify((String) details.get("E_Password"));
		}
	}

	@When("^Go to company page and fill duplicate EIN number$")
	public void Go_to_company_page_and_fill_duplicate_EIN_number()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsDuplicateEIN");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to import page and upload new file$")
	public void Go_to_import_page_and_upload_new_file() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.import_File();
		companyAccount.upload_File();
	}

	@When("^Go to import page and click on download sample file link$")
	public void Go_to_import_page_and_click_on_download_sample_file_link()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.import_File();
		companyAccount.download_File();
	}

	@When("^Go to import page$")
	public void Go_to_import_page() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.import_File();
	}

	@When("^import and upload wrong file format$")
	public void import_and_upload_wrong_file_format() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.import_File();
		companyAccount.upload_Wrong_File_Format();
	}

	@When("^Go to company page and check state dropdown alphabetical order$")
	public void Go_to_company_page_and_check_state_dropdown_alphabetical_order()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.drop_Down_Alphabetical_Order();
	}

	@When("^Go to company page and create new company$")
	public void Go_to_company_page_and_create_new_company() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsCheckSaveData");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@When("^Go to company page and click on export icon$")
	public void Go_to_company_page_and_click_on_export_icon() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_Export_Icon();
		Thread.sleep(2000);
	}

	@When("^Go to company page and fill the required details with duplicate company name$")
	public void Go_to_company_page_and_fill_the_required_details_with_duplicate_company_name()
			throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_ToggleButton();
		companyAccount.add_NewEmployee();
		employee = new CompanyPage2(DriverFactory.getDriver());
		file = new JSONFileClass();
		user = file.readJson1();
		JSONArray userLogInArray = (JSONArray) user.get("companyDetailsDuplicateComapanyName");

		for (int i = 0; i < userLogInArray.size(); i++) {
			JSONObject details = (JSONObject) userLogInArray.get(i);
			CompanyName = (String) details.get("companyname");
			employee.enter_Company_name((String) details.get("companyname"));
			employee.enter_EIN((String) details.get("EIN"));
			employee.enter_Address((String) details.get("Address"));
			employee.enter_Address2((String) details.get("Address2"));
			employee.enter_City((String) details.get("City"));
			employee.select_drop_Down((String) details.get("State"));
			employee.enter_Zip_Code((String) details.get("ZipCode"));
			employee.enter_Contact_Number((String) details.get("PhoneNumber"));
			employee.enter_Email((String) details.get("mail"));
			employee.enter_Pay_Roll((String) details.get("payroll"));
		}
	}

	@Then("^click on save button and check recently added company data and edit data$")
	public void click_on_save_button_and_check_recently_added_company_data_and_edit_data() throws Throwable {
		employee.click_Save_Button_And_Check_Data_Edit(CompanyName);
	}

	@Then("^click on save button and check updated data$")
	public void click_on_update_button_and_check_updated_data() throws Throwable {
		employee.upadteAndCheckForUpdate(CompanyName);
		employee.click_Cancel_Button();
	}

	@Then("^select the file to be imported and click on upload button$")
	public void select_the_file_to_be_imported_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_And_Click_Upload_Button();
	}

	@Then("^select the file to be updated and click on upload button$")
	public void select_the_file_to_be_updated_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Be_Updated_And_Click_Upload_Button();
	}

	@Then("^select the file to update and click on upload button$")
	public void select_the_file_to_update_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.update_Company_Through_Import_File();
	}

	@Then("^select the file to update phone number and click on upload button$")
	public void select_the_file_to_update_phone_number_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Update_Phone_And_Click_Upload_Button();
	}

	@Then("^select the file to update Everify and click on upload button$")
	public void select_the_file_to_update_Everify_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Update_Everify_And_Click_Upload_Button();
	}

	@Then("^select the file to update Everify Username and click on upload button$")
	public void select_the_file_to_update_Everify_Username_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Update_Everify_Username_And_Click_Upload_Button();
	}

	@Then("^select the file to check duplicate EIN and click on upload button and scroll down$")
	public void select_the_file_to_check_duplicate_EIN_and_click_on_upload_button_and_scroll_down() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Check_Duplicate_EIN_And_Click_Upload_Button();
	}

	@Then("^select the file to check invalid zip and click on upload button and scroll down$")
	public void select_the_file_to_check_invalid_zip_and_click_on_upload_button_and_scroll_down() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Check_Invalid_Zip_And_Click_Upload_Button();
	}

	@Then("^select the file to check add new functionality and click on upload button and scroll down$")
	public void select_the_file_to_check_add_new_functionality_and_click_on_upload_button_and_scroll_down()
			throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.select_File_To_Check_Add_New_And_Click_Upload_Button();
	}

	@Then("^select the file to add company and click on upload button$")
	public void select_the_file_to_add_company_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.Add_New_Company();
	}

	@Then("^select the file to update state of company and click on upload button$")
	public void select_the_file_to_update_state_of_company_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.update_Company_State();
	}

	@Then("^select the file to update City of company and click on upload button$")
	public void select_the_file_to_update_City_of_company_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.update_Company_City();
	}

	@Then("^select the file to verify EIN of company and click on upload button$")
	public void select_the_file_to_verify_EIN_of_company_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.check_EIN();
	}

	@Then("^select the file to update address of company and click on upload button$")
	public void select_the_file_to_update_address_of_company_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.update_Address();
	}

	@Then("^select the file to update company name and click on upload button$")
	public void select_the_file_to_update_company_name_and_click_on_upload_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.update_Company_Name();
	}

	@And("^click on save button and check recently added company data$")
	public void click_on_save_button_and_check_recently_added_company_data() throws Throwable {
		employee.click_Save_Button_And_Check_Data(CompanyName);
	}

	@And("^Click on PDF button$")
	public void Click_on_PDF_button() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_PDF_Button();
		Thread.sleep(2000);
	}

	@And("^Click on Excel button$")
	public void Click_on_Excel_button() throws IOException, ParseException, InterruptedException {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.clickon_Excel_Button();
		Thread.sleep(3000);
	}

	@And("^delete recently added company$")
	public void delete_recently_added_company() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.findElementUsingText(CompanyName);
		companyAccount.click_delete_Button();
	}

	@And("^click on Save Button$")
	public void click_on_save_button() throws Throwable {
		employee.click_Save_Button();
	}

	@And("^click on upload button$")
	public void click_on_upload_button() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.click_Upload_Button();
	}

	@And("^click on Save Button and delete company$")
	public void click_on_Save_Button_and_delete_company() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.click_Save_Button();
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.text_Of_Success_Message();
		companyAccount.successfull_Delete();
		companyAccount.findElementUsingText(CompanyName);
		companyAccount.click_delete_Button();
	}

	@And("^click on Cancel Button$")
	public void click_on_Cancel_Button() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.click_Cancel_Button();
	}

	@And("^delete confirmation window$")
	public void delete_confirmation_window() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.findElementUsingText(CompanyName);
		companyAccount.click_delete_Button();
	}

	@And("^click on import page cancel button$")
	public void click_on_import_page_cancel_button() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.import_Page_Cancel();
	}

	@And("^logout from company page$")
	public void logout_from_company_page() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(2000);
		companyAccount.clickon_Logout_Icon();
		companyAccount.clickon_Logout();
	}

	@And("^delete company$")
	public void delete_company() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.click_Yes_Button();
	}

	@And("^match the existing company with the deleting company$")
	public void match_the_existing_company_with_the_deleting_company() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		employee.company_Match(CompanyName);
	}

	@And("^click on Cancel Button and delete recently added company$")
	public void click_on_Cancel_Button_and_delete_recently_added_company() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		employee.click_Cancel_Button();
		Thread.sleep(1000);
		companyAccount.refresh();
		companyAccount.findElementUsingText("Business Shop");
		Thread.sleep(1000);
		companyAccount.click_delete_Button();
	}

	@And("^delete added company$")
	public void delete_added_company() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		employee.click_Cancel_Button();
		Thread.sleep(1000);
		companyAccount.refresh();
		companyAccount.findElementUsingText("Test purpose");
		Thread.sleep(1000);
		companyAccount.click_delete_Button();
	}

	@And("^click on company$")
	public void click_on_company() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("Testing");
	}

	@And("^click on company to check updation of state$")
	public void click_on_company_to_check_updation_of_state() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("Check state");
	}

	@And("^click on company to check$")
	public void click_on_company_to_check() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("Test Add And Delete");
	}

	@And("^click on company to check data$")
	public void click_on_company_to_check_data() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		companyAccount.refresh();
		Thread.sleep(2000);
		companyAccount.check_Company("Test purpose");
	}

	@And("^click on company to check updation of city$")
	public void click_on_company_to_check_updation_of_city() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("Update City test");
	}

	@And("^back and delete the company$")
	public void back_and_delet_the_company() throws Throwable {
		employee = new CompanyPage2(DriverFactory.getDriver());
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		employee.click_Cancel_Button();
		companyAccount.clickon_ToggleButton();
		companyAccount.import_File();
		companyAccount.delete_Company_Through_Import_File();
	}

	@And("^click on company to check EIN$")
	public void click_on_company_to_check_EIN() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("Wrong EIN test");
		Thread.sleep(1000);
	}

	@And("^click on company to check updated address$")
	public void click_on_company_to_check_updated_address() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("Update Address test");
		Thread.sleep(1000);
	}

	@And("^click on company to check updated name$")
	public void click_on_company_to_check_updated_name() throws Throwable {
		companyAccount = new CompanyPage1(DriverFactory.getDriver());
		Thread.sleep(1000);
		companyAccount.check_Company("CompanyTest");
		Thread.sleep(1000);
	}

}
