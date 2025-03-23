package SVGElementHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementOrangeHRM {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   		driver.manage().window().maximize();
   		
   		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
   		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
   		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
   		
   		//Abs xpath
   		//driver.findElement(By.xpath("//body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > svg:nth-child(1)")).click();
   		
   		//Relative Xpath---click on admin menu
   		//driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
   		
   	    //Relative Xpath---click on svgicon
   		driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']//*[name()='svg']")).click();
   	    //a[normalize-space()='']//*[name()='svg']
   		
   		

	}

}
