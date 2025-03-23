package TestNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider01 {
	
WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="dp")
	void testLogin(String email,String password)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		WebElement logo=driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']"));
		boolean status=logo.isDisplayed();
		
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	@AfterClass
	void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="dp")
	Object[][] loginData()
	{
		Object data[][]= {
				{"raja@gmail.com","test@12345"},
				{"raka@gmail.com","test@1234567"},
				{"rahul@gmail.com","test@1234589"},
				{"pavanol123@gmail.com","test@123"},
				{"chacha@gmail.com","test@12"}};
				return data;
	}
}

	


