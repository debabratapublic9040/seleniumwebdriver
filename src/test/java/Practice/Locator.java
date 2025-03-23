package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		driver.get("https://aguat.indecomm.net/AuditGenius_External_UAT/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
       // driver.findElement(By.xpath("//input[@name='search']")).sendKeys("raja");
		//driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("//input[contains(@name,'sea')]")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-Shirt");
		
		
     


	}

}
