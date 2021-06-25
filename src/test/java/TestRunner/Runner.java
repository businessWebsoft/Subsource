package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\BWS-Tester\\git\\SubSource\\src\\test\\resources\\Parallel\\Socialhiring.feature", glue = {
		"Parallel" }, dryRun = false, monochrome = true,  plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:target/HtmlReports",
				"json:target/JsonReports/report.json", "junit:target/JunitReports/report.junit" })

public class Runner {
	
	//tags = " @persent",
}
