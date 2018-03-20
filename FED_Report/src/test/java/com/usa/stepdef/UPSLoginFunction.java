package com.usa.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPSLoginFunction {
	
	WebDriver driver;
	
	@Given("^User able to open browser$")
	public void user_able_to_open_browser() throws Throwable {
		
		driver = new FirefoxDriver();
	    
	}

	@Given("^go to UPS home page$")
	public void go_to_UPS_home_page() throws Throwable {
	    
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^User Navigate to Login button link$")
	public void user_Navigate_to_Login_button_link() throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a")).click();
	    
	}

	@When("^User able to put valid user name- Sarower(\\d+)$")
	public void user_able_to_put_valid_user_name_Sarower(int arg1) throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");;
	    
	}

	@When("^User able to put valid password- Ttech(\\d+)\\$$")
	public void user_able_to_put_valid_password_Ttech_$(int arg1) throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");;
		driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
		
	}

	@Then("^Login Successful$")
	public void login_Successful() throws Throwable {
	    
		System.out.println("Test passed");
		driver.quit();
		
	}

}
