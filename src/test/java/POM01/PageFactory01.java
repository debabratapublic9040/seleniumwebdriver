package POM01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactory01 {
	
	WebDriver driver;
	
	PageFactory01(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator 
	
			/*By userName_txt=By.xpath("//input[@placeholder='Username']");
			By password_txt=By.xpath("//input[@placeholder='Password']");
			By login_BTN=By.xpath("//button[normalize-space()='Login']");*/
			
	
	        @FindBy(how=How.XPATH, using="//input[@placeholder='Username']") WebElement userName_txt;
			//@FindBy(xpath="//input[@placeholder='Username']") WebElement userName_txt;
			@FindBy(xpath="//input[@placeholder='Password']") WebElement password_txt;
			@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_BTN;
			
			@FindBy(tagName="a") List<WebElement> links;
			
			//Action Methods
			
			public void setUserName(String userName)
			{
				userName_txt.sendKeys(userName);
			}
			public void setPassword(String password)
			{
				password_txt.sendKeys(password);
			}
			public void clickLoginBTN()
			{
				login_BTN.click();
			}
	
	

}
