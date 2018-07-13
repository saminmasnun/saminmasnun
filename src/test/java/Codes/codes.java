/*package Codes;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pagefactory.LoginPageFactory;
import com.util.onlyExcelColmSpecificExcelFactory;

public class codes {

	static WebDriver driver;
	
	@Test
	public void codetest() throws Throwable {
		
		java.lang.String path="./Test Data/List.xlsx";
		ArrayList<java.lang.String> excelColumnValue =new ArrayList<java.lang.String>();
		
		
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.overstock.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPageFactory pf= PageFactory.initElements(driver, LoginPageFactory.class);
		
		
		
	    try{ 
	        Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
	        if(a!=null){
	            System.out.println("Alert is present");
	            Alert alert=driver.switchTo().alert();
	    		alert.dismiss();
	        } 
	       
	    } 
	    catch (Throwable e) {
	        System.out.println("Alert isn't present!!");
	       
	    }
		
		Actions act =new Actions(driver);
		act.keyDown(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		act.keyUp(Keys.ESCAPE).perform();
	
		Thread.sleep(5000);
		act.keyDown(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		act.keyUp(Keys.ESCAPE).perform();
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.delay(1500);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(pf.getAccountLink()));
		
		
		pf.getAccountLink().click();

		
		
		Thread.sleep(5000);
		
		while(1<9) {
			System.out.println("Looking for email input box");
			
			if(pf.getEmail().getSize().height>0) {
				
				System.out.println("Found email");
				Actions act =new Actions(driver);
				act.moveToElement.perform();
		break;
			}
		
		}
		
		java.lang.String email="ctschallenge20@gmail.com";
		java.lang.String password="Challenge2018";
		
		
		
		 StringSelection stringSelection = new StringSelection(email);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	
	    
	     robot.mouseMove(803,306);
	     
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        
	 
		//pf.getPassword().sendKeys("Challenge2018");
		//pf.getSigninbtn().click();
		
	        excelColumnValue= onlyExcelColmSpecificExcelFactory.ReadcolumValue(0, path);
		
		System.out.println(excelColumnValue);
		
		
	//	driver.findElement(By.xpath(".//*[@id='search-input']")).sendKeys(excelColumnValue.get(1));
		LoginPageFactory pf= PageFactory.initElements(driver, LoginPageFactory.class);
		List<WebElement> allproduct= pf.getProductdetails();
	
		
		
		WebElement nextbtn= driver.findElement(By.xpath("//*[@class='next-wrapper pagination-btn']"));
		WebElement lastPageNumber= driver.findElement(By.xpath("//*[@id='last-page-popup']"));
		
		int pageNumber= Integer.parseInt(lastPageNumber.getText());
		ArrayList<java.lang.String> priceList =new ArrayList<java.lang.String>();
		ArrayList<java.lang.String> productList =new ArrayList<java.lang.String>();
	
	for(int j=0;j<pageNumber;j++) {
		
		if(j==1) {
			nextbtn.click();
		}
		for(int i=0;i<allproduct.size();i++) {
			
			java.lang.String productNmaeWithPricer= allproduct.get(i).toString();
			
			System.out.println(productNmaeWithPricer);
			
			
			
			java.lang.String [] s=productNmaeWithPricer.split("\n");
			System.out.println("Price::"+s[0]);
		
			priceList.add(s[0]);
			
			System.out.println("Product Name::"+s[1]);
		
			productList.add(s[1]);
			
			
			
		}
		
		}
	
			
	for(java.lang.String price:priceList) {
		
		if(price.equals("$149.95")) {
			
			System.out.println("Found my price");
		}
		

		
		
		else {
			System.out.println("price not found");
		}
		
	}
	
	
for(java.lang.String productName:productList) {
	


if(productName.equals("San Disk 256GB Ultra ")) {
	
	System.out.println("Found my product");
}


else {
	System.out.println("product not found");
}

}
	
	}

}
*/