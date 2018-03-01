package com.usa.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsSignUPFunction {
	
	
WebDriver driver;
	
	@Given("^User able to open browser$")
	public void user_able_to_open_browser() throws Throwable {
		
		driver = new FirefoxDriver();
	    
	}

	@Given("^go to UPS home page$")
	public void go_to_UPS_home_page() throws Throwable {
	    
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^User Navigate to Sign Up button link$")
	public void user_Navigate_to_Sign_Up_button_link() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[2]/a")).click();
		
	}

	@When("^User able to put valid Name- Samin Masnun$")
	public void user_able_to_put_valid_Name_Samin_Masnun() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='ups-full_name_input']")).sendKeys("Samin Masnun");;
	    
	}

	@When("^User able to put valid Email- saminmasnun@gmail\\.com$")
	public void user_able_to_put_valid_Email_saminmasnun_gmail_com() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='ups-email_input']")).sendKeys("saminmasnun@gmail.com");;
	    
	}

	@When("^User able to put valid User ID- saminmasnun$")
	public void user_able_to_put_valid_User_ID_saminmasnun() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='ups-user_id_input']")).sendKeys("saminmasnun");;
	    
	}

	@When("^User able to put valid Password- Upspass123$(\\d+)$")
	public void user_able_to_put_valid_Password_upspass(int arg1) throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='ups-user_password_input']")).sendKeys("Upspass123$");;
		
	}

	@Then("^Registration Successful$")
	public void registration_Successful() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='ups-checkbox_group']/div/label")).click();
		
		driver.findElement(By.xpath(".//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button")).click();
		
		driver.quit();
		System.out.println("Test passed");
	    
	}

}
