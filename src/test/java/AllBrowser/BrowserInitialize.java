package AllBrowser;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialize {
	
	WebDriver driver;
	
	public WebDriver ChooseBrowser() {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String B = rb.getString("Browser");
		
		if (B.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		//else if() {
			
			//use i.e. here you want to
			
		//}
		
		else {
			
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
		}
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		return driver;
	}

} //end class
