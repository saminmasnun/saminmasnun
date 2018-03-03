package com.usa.loginfunctiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		
		// Step 2. Go to Login and use user name and password
		// Username: Sarower2017
		// Password: Ttech123$
		
		//But here App will take longer to work than the tool (because of slow net connection). 
		//so we hadriver.findElement(By.className("ups-analytics")).click();
		//ups-analytics is from the HTML link from the App.
		
		//ve to do synchronization
		//Here try implicit wait synchronization
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Now here Login is an object
		//To find object> use locator 
		//For Locator> Use findElement/ findElements
		// But it's better to use XPATH
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a")).click();
		
				
		//Username
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");;
		
		//Password
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");;
		
		//Click login
		driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
		
		//To close the WebDriver
		driver.quit();
		
		System.out.println("Test passed");
		
	}

}
