package Parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LogInPage;
import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	LogInPage logIn;
	HomePage home;
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	WebDriverUtil util;
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}

	@Before(order = 2)
	public void navigate_to_Subsource() throws InterruptedException {
		DriverFactory.getDriver().get(prop.getProperty("url"));
		//DriverFactory.getNgDriver().waitForAngularRequestsToFinish();
		logIn = new LogInPage(DriverFactory.getDriver());
		util = new WebDriverUtil();
		/*
		 * util.switch_To_Frame("widget-window");
		 * DriverFactory.getDriver().findElement(By.xpath("//div[@class='close']")).
		 * click(); DriverFactory.getDriver().switchTo().defaultContent();
		 */

		logIn.enterUserName(prop.getProperty("userName"));
		logIn.enterPassword(prop.getProperty("password"));
		logIn.clickOnLogin();
	}

	@After(order = 0)
	public void quitBrowser() throws InterruptedException {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
