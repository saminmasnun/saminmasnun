package com.usa.loginfunctiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class CheckTestng {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("This is google");
	}

	WebDriver driver;
	
	@Test
	public void test() {
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	System.out.println("This is facebook");
	}
	
	@Test
	public void test1() {
		driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	System.out.println("This is google");
	}
	
	@Test
	public void test2() {
		driver = new FirefoxDriver();
	driver.get("https://www.ups.com/us/en/Home.page");
	System.out.println("This is UPS");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		driver.quit();
	}

}
