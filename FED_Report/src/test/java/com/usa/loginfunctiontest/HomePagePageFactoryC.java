package com.usa.loginfunctiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePagePageFactoryC extends HomePagePageFactory {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		HomePagePageFactory obj = new HomePagePageFactory();
		driver.get(obj.getAppURL());

	}

}
