package com.usa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
	//	snippets=SnippetType.CAMELCASE,
	//	strict=true,
	//	monochrome = true,
	//dryRun=true,
		features= {"src/main/resources/LoginFunctionTest.feature"},
		glue= {"com.usa.stepdef"}
				
		//,tags= {"@login"}
		)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	


}
