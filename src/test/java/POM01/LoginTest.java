package POM01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test
	void testLogin()
	{
		//LoginPage login1=new LoginPage(driver);
		PageFactory01 login1=new PageFactory01(driver);
		login1.setUserName("Admin");
		login1.setPassword("admin123");
		login1.clickLoginBTN();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
		
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
