package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);

	}
	

	// Login function xpath
	
	@FindBy(how = How.XPATH, using = "//*[@class='hd-title-full hd-account-link']")
	private WebElement accountLink;

	@FindBy(how = How.XPATH, using = "(//*[@name='cst_email'])[2]")
	private WebElement email;

	
	
	@FindBy(how = How.XPATH, using = "//*[@id='loginPasswordInput']")
	private WebElement password;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='sign-in-button']")
	private WebElement signinbtn;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='product-info']")
	private List<WebElement> productdetails;
	
	
	
	
 // all getter method
	
	public WebElement getAccountLink() {
		return accountLink;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSigninbtn() {
		return signinbtn;
	}


	public List<WebElement> getProductdetails() {
		return productdetails;
	}
	
	
	
}