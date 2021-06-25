package com.qa.factory;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class WebDriverUtil {
	/**
	 * wait for element status based on visibility
	 * 
	 * @param driver
	 */
	// WebDriver driver;
	// WebDriverCommonLib wlib = new WebDriverCommonLib();

	public void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/*
	 * public void wait_Untill_Page_Load() { WebDriverWait wait = new
	 * WebDriverWait(DriverFactory.getDriver(), 10);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.
	 * xpath("//div[@class='backdrop ng-star-inserted']"))); }
	 */
	public void page_Load_Method() {
		JavascriptExecutor jsDriver = (JavascriptExecutor) DriverFactory.getDriver();
		NgWebDriver ngDriver = new NgWebDriver(jsDriver);
		ngDriver.withRootSelector("\"app-root\"").waitForAngularRequestsToFinish();
	}
	public void button_Refresh() {
		JavascriptExecutor jsDriver = (JavascriptExecutor) DriverFactory.getDriver();
		NgWebDriver ngDriver = new NgWebDriver(jsDriver);
		ngDriver.waitForAngularRequestsToFinish();
	}

	public void waitForElementVisiblity(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForinvisibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void waitForElementJavaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
		js.executeScript("arguments[0].click();", element);
	}

	public void passTheValueUsingJavaScript(WebElement element, String value) {
		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("arguments[0].value='" + value + "';", element);
	}

	/**
	 * wait for title based on availability
	 * 
	 *
	 */
	public void waitForTitleContain(String title) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void invisiablitiy_Of_Element(WebElement ele) {
		WebDriverWait wait3 = new WebDriverWait(DriverFactory.getDriver(), 10);
		// wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ele)));
		wait3.until(ExpectedConditions.invisibilityOf(ele));
	}

	public void wait_For_Page_Load(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void javaViewPoint(WebElement ele) {
		JavascriptExecutor jse2 = (JavascriptExecutor) DriverFactory.getDriver();
		jse2.executeScript("arguments[0].scrollIntoView()", ele);
	}

	/**
	 * wait for element load
	 *
	 */
	public void waitForElement() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * used to select content of the dropdown based on text
	 * 
	 * 
	 */
	public void selectText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void deSelectText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.deselectByValue(text);
	}

	/**
	 * used to select content of the dropdown based on index
	 * 
	 * 
	 */
	public void selectIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * used to take mouse cursor on the element
	 * 
	 *
	 */
	public void moveToElement(WebElement element) {
		Actions ac = new Actions(DriverFactory.getDriver());
		ac.moveToElement(element).perform();
	}

	/**
	 * use to rightclick by mouse
	 *
	 * 
	 */
	public void rightClick(WebElement element) {
		Actions ac = new Actions(DriverFactory.getDriver());
		ac.contextClick(element).perform();
	}

	/**
	 * use to double click by mouse
	 *
	 *
	 */
	public void doubleClick(WebElement element) {
		Actions ac = new Actions(DriverFactory.getDriver());
		ac.doubleClick(element).perform();
	}

	/**
	 * used to drag and drop element
	 * 
	 * 
	 * 
	 */
	public void dragandDrops(WebElement src, WebElement desti) {
		Actions ac = new Actions(DriverFactory.getDriver());
		ac.dragAndDrop(src, desti).perform();
	}

	/**
	 * used to switch to any window based in page title
	 * 
	 * 
	 */
	public void switchToNewTab(String pageTitle) {
		Set<String> setlist = DriverFactory.getDriver().getWindowHandles();
		Iterator<String> it = setlist.iterator();

		while (it.hasNext()) {
			DriverFactory.getDriver().switchTo().window(it.next());
			String actPageTitle = DriverFactory.getDriver().getTitle();

			if (actPageTitle.contains(pageTitle)) {
				break;
			}
		}
	}

	/**
	 * used to click on alert
	 *
	 */
	public void acceptAlert() {
		DriverFactory.getDriver().switchTo().alert().accept();
	}

	/**
	 * used to click dismis on alert
	 *
	 */
	public void cancelAlert() {
		DriverFactory.getDriver().switchTo().alert().dismiss();
	}

	/**
	 * used to get title of webpage
	 * 
	 *
	 */
	public String getTitlePage() {
		String title = DriverFactory.getDriver().getTitle();
		return title;
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void select(String value, WebElement element) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void select1(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void switch_To_Frame(String name) {
		DriverFactory.getDriver().switchTo().frame(name);
	}

	public void switch_To_Frame(int number) {
		DriverFactory.getDriver().switchTo().frame(number);
	}

}
