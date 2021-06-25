package Parallel;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					plugin = { 
								"pretty", 
								"html:target/cucumber", 
								"json:target/cucumber.json",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								"timeline:test-output-thread/" 
							  }, 
					monochrome = true, 
					dryRun = false, 
					glue = {"Parallel"},//tags = "@persent", 
					features = {"C:\\Users\\BWS-Tester\\git\\SubSource\\src\\test\\resources\\Parallel\\Quiz.feature"}
				)

public class ParallelRun extends AbstractTestNGCucumberTests 
	{
		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() 
			{
				return super.scenarios();
			}
		
	}
