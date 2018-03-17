package com.usa.loginfunctiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppURL {
	
	WebDriver driver;
	
	private String AppURL = "https://www.ups.com/us/en/Home.page";
	
	private WebElement LoginLinkbtn = driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a"));
	
	private WebElement UserName = driver.findElement(By.xpath(".//*[@id='email']"));
			
	private WebElement Password = driver.findElement(By.xpath(".//*[@id='pwd']"));
	
	private WebElement OKbtn = driver.findElement(By.xpath(".//*[@id='submitBtn']"));

	public String getAppURL() {
		return AppURL;
	}

	public WebElement getLoginLinkbtn() {
		return LoginLinkbtn;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getOKbtn() {
		return OKbtn;
	}
	
	

}
