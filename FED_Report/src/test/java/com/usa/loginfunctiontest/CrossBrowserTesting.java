package com.usa.loginfunctiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String fox = "Firefox";
		String chrome = "Chrome";
		String ie = "IE";
		
		if (fox.equalsIgnoreCase("Firefox")) {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("Firefox closed");
		}
		
		
		else if (chrome.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Chrome closed");
		}
		
		else if (ie.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.ups.com/us/en/Home.page");
		System.out.println("IE closed");
	}
		
		else {
			System.out.println("No browser found");
		}
	
}
}
