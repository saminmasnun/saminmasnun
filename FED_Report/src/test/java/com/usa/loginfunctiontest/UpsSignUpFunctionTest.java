/*package com.usa.loginfunctiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UpsSignUpFunctionTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//URL
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Click Sign UP
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[2]/a")).click();
		
		//Name
		driver.findElement(By.xpath(".//*[@id='ups-full_name_input']")).sendKeys("Samin Masnun");;
		
		//Email
		driver.findElement(By.xpath(".//*[@id='ups-email_input']")).sendKeys("saminmasnun@gmail.com");;
		
		//User ID
		driver.findElement(By.xpath(".//*[@id='ups-user_id_input']")).sendKeys("saminmasnun");;
				
		
		//Password
		driver.findElement(By.xpath(".//*[@id='ups-user_password_input']")).sendKeys("Upspass123$");;
		
		//Click Check Box
		driver.findElement(By.xpath(".//*[@id='ups-checkbox_group']/div/label")).sendKeys(Keys.SPACE);
				
		//Click Sign Up
		
		driver.findElement(By.xpath(".//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button")).sendKeys(Keys.SPACE);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//To close the WebDriver
		driver.quit();
		
		System.out.println("Test Passed");
		
	}


	}


*/