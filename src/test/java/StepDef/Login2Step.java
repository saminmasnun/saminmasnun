package StepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import AllBrowser.BrowserInitialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login2Step {
	
	WebDriver driver;
	BrowserInitialize br;
	
	LoginPage page;
	
	
	@Given("^Admin Navigate to HRM Loginpage$")
	public void admin_Navigate_to_HRM_Loginpage() throws Throwable {
	    
	    br = new BrowserInitialize();
	    driver = br.ChooseBrowser();
		
	}

	@When("^Admin Enter validUserName and Password$")
	public void admin_Enter_validUserName_and_Password() throws Throwable {
	    
		page = new LoginPage(driver);
		page.EnterUserName1().sendKeys("Admin");;
		
		// For PageObMod - page.EnterUserName1(); (No send keys)
		
		page.EnterPassword1().sendKeys("admin");;
	    
		// For PageObMod - page.EnterPassword1(); (No send keys)
	}

	@When("^click on LogingButton$")
	public void click_on_LogingButton() throws Throwable {
	    
		page = new LoginPage(driver);
		page.ClickLoginButton1().click();;
	    
		// For PageObMod - page.ClickLoginButton1(); (No Click)
		
	}

	@Then("^Admin will Land in Admin homePage$")
	public void admin_will_Land_in_Admin_homePage() throws Throwable {
	    
		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.quit();
	    
	}


}
