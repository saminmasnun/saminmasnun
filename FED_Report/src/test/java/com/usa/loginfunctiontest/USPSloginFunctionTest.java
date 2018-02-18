package com.usa.loginfunctiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USPSloginFunctionTest {

	public static void main(String[] args) {
		// Step 1. Open browser
		
		WebDriver driver = new FirefoxDriver();

		// Webdriver = Interface
		// driver = object
		// FirefoxDriver = class
		// new = key word for creating new objects
		
		// How to send the URL 
		//Example: go to usps.com
		// use: driver.get("https://www.usps.com/");
		// this is the 'get' method
		
		//to use navigation
		driver.navigate().to("https://www.usps.com/");
		
	}

}
