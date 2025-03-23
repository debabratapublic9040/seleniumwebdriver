package TestNGMultipleBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidationInMultipleBrowser {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setUp(String br,String url) throws InterruptedException
	{
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		case "firefox" : driver=new FirefoxDriver();break;
		default: System.out.println("Invalid Browser");return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void logoValidation()
	{
		boolean status=driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority=2)
	void titleValidation()
	{
		Assert.assertEquals(true,driver.getTitle().equals("Account Login"));
	}
	@Test(priority=3)
	void urlValidation()
	{
		Assert.assertEquals(true,driver.getCurrentUrl().equals("https://tutorialsninja.com/demo/index.php?route=account/login"));
	}
	
	@AfterClass
	void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
