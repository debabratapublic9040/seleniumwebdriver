package WaitMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWaitMethod {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		/*WebElement ele=myWait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")));
		
		ele.click();
		*/
		
		
		WebElement userName=myWait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//input[@placeholder='Username']")));
		userName.sendKeys("Admin");
		
		WebElement password=myWait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement submit=myWait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[normalize-space()='Login']")));
		submit.click();
		
		
		
		

	}

}
