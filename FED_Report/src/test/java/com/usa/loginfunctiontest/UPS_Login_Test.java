package com.usa.loginfunctiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UPS_Login_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void test() {
	
	driver = new FirefoxDriver();
	
	driver.navigate().to("https://www.ups.com/us/en/Home.page");
	}
	
	@Test
	public void test1() {
		// Step 1. Open browser
		
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
	
	@AfterTest
	public void test3() {
	
	driver.quit();
	
	System.out.println("Test passed");

	}
}
