package com.usa.loginfunctiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseandQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.bd/");
		System.out.println("Done");
		driver.quit();
		
	}

}