package NavigationalMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		
		
		//Refresh
		//driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
	    driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")).click();
	    Thread.sleep(2000);
		driver.navigate().back();//back
		Thread.sleep(2000);
		driver.navigate().forward();//forward
		
		
		
		//driver.navigate().to("https://demo.nopcommerce.com/register");
		
		/*
		 * driver.get() will implement the string object
		 * driver.navigate().to() will execute both string url and url object
		 * 
		 * Ex-1
		 * String url=driver.get("https://www.opencart.com/index.php?route=cms/demo");
		 * driver.navigate().to(url);
		 */

	}

}
