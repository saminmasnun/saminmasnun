package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= "Feature",
		
		// Or "C:\\Users\\samin\\eclipse-workspace\\Project\\BootCamp\\Feature\\login2.feature",
		
		glue = "StepDef",
		
		tags = "@Login2"

		)

public class TC02_Login extends AbstractTestNGCucumberTests {

} //end class
