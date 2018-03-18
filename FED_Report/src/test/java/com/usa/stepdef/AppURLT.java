/*package com.usa.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.usa.loginfunctiontest.AppURL;

import cucumber.api.java.en.Given;

public class AppURLT extends AppURL {
	
WebDriver driver;
	
	@Given("^User able to open browser$")
	public void user_able_to_open_browser() throws Throwable {
		
		driver = new FirefoxDriver();
	    
	}

	@Given("^go to UPS home page$")
	public void go_to_UPS_home_page() throws Throwable {
		driver = new FirefoxDriver();
		AppURLT obj = new AppURLT();
		driver.get(obj.getAppURL());
	}

}
*/