package TestNGListeners;

/*

1st point:-
Create test case
Create Listeners Class
Create xml file and add test class and listeners class and execute

2nd point:-
There are 2 ways to implement listener class

Method 1:
class MyListeners extends ITestListener
{

}

Method 2:
class MyListener extends TestListenersAdapter
{

}

*/

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
@Listeners(TestNGListeners.MyListener.class)
above is the second option to run listeners and the first option is to add listener class in xml file
*/
public class NormalReport {
	
WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException
	{
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
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
	void urlValidation()
	{
		Assert.assertEquals(true,driver.getCurrentUrl().equals("https://tutorialsninja.com/demo/index.php?route=account/loginn"));
	}
	@Test(priority=3,dependsOnMethods= {"urlValidation"})
	void titleValidation()
	{
		Assert.assertEquals(true,driver.getTitle().equals("Account Loginn"));
	}
	
	
	@AfterClass
	void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
