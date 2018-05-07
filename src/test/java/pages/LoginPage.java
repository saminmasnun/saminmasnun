package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"txtUsername\"]")
	@CacheLookup
	
	WebElement user_name;
	public WebElement EnterUserName1() {
		return user_name;
		
	}

	//public void EnterUserName( ) {
		
		// For PageObMod - driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
	//}
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"txtPassword\"]")
	@CacheLookup
	WebElement Password;
	public WebElement EnterPassword1() {
		return Password;
	}
	
	//public void EnterPassword() {
		
		//For PageObMod - driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
	//}
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"btnLogin\"]")
	@CacheLookup
	WebElement login;
	public WebElement ClickLoginButton1() {
		return login;
	}
	
	//public void ClickLoginButton() {
		
		//For PageObMod - driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();;
	//}
	
} //end class
