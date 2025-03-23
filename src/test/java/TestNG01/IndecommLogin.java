package TestNG01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IndecommLogin {

	/*
	 open url
	 logo validation
	 login
	 logout
	 */
	WebDriver driver;
	@Test(priority=1)
	void openURL() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://aguat.indecomm.net/AuditGenius_External_UAT/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority=2)
	void logoValidation()
	{
		Boolean status=driver.findElement(By.xpath("//img[@src='/AuditGenius_External_UAT/Assets/Img/Audit-Genius-Logo_whiteletters.png']")).isDisplayed();
		if(status==true)
		{
			System.out.println("Logo Present and test execution passed");
		}
	}
	@Test(priority=3)
	void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='#loginModal']")).click();
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Debabrata1");
		driver.findElement(By.xpath("//input[@id='txtPwd']")).sendKeys("Password15$");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		
		String text=driver.findElement(By.xpath("//div[text()='You have already logged into AuditGenius."
				+ " Would you like to close the existing session and continue with this new session ?']")).getText();
		
		if(text.equals(text))
		{
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		}
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='bs-caret']")).click();
		//String workflowName=driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li")).getText();
		//driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li[1]")).click();
		//System.out.println(workflowName);
	}
	
}
