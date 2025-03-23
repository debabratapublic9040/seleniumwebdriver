package POM01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Process to use POM
 * 
 * first: Declare Constructor
 * Second: Locator
 * Third: Action Methods
 * 
 * 
 * 
 */

public class LoginPage {

	//globally driver initialization 
		WebDriver driver;
		
		//Constructor 
		LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		//Locator 
		
		By userName_txt=By.xpath("//input[@placeholder='Username']");
		By password_txt=By.xpath("//input[@placeholder='Password']");
		By login_BTN=By.xpath("//button[normalize-space()='Login']");
		
		//Action Methods
		
		public void setUserName(String userName)
		{
			driver.findElement(userName_txt).sendKeys(userName);
		}
		public void setPassword(String password)
		{
			driver.findElement(password_txt).sendKeys(password);
		}
		public void clickLoginBTN()
		{
			driver.findElement(login_BTN).click();
		}

	
}
