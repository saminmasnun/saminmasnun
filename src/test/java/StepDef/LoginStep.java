package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	WebDriver driver;
	
	@Given("^Admin Navigate to HRM Login page$")
	public void admin_Navigate_to_HRM_Login_page() throws Throwable {
	
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("^Admin Enter valid UserName and Password$")
	public void admin_Enter_valid_UserName_and_Password() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//for custom xpath - ("//tagname[@locator = 'value']")
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
	    
	}

	@When("^click on Loging Button$")
	public void click_on_Loging_Button() throws Throwable {
	    
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
	}

	@Then("^Admin will Land in Admin home Page$")
	public void admin_will_Land_in_Admin_home_Page() throws Throwable {
	    
		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.quit();
	    
	}

	
	
	
	
	
} //end class
