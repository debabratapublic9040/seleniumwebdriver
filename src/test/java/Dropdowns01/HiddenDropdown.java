package Dropdowns01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.clear();
		userName.sendKeys("Admin");
		
		WebElement userPassword=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userPassword.clear();
		userPassword.sendKeys("admin123");
		
		WebElement loginBTN=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginBTN.click();
		WebElement pmiBTN=driver.findElement(By.xpath("//span[normalize-space()='PIM']"));
		pmiBTN.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();
		
		
		
		//Get all options and get index
	
		List<WebElement> drpOptions=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		//Size
		System.out.println(drpOptions.size());
		
		//opt-01
		/*for(int i=0;i<drpOptions.size();i++)
		{
			System.out.println( drpOptions.get(i).getText());
		}*/
		
		//opt-02
		/*
		for(WebElement option:drpOptions)
		{
			
			{
				System.out.println( option.getText());
			  
		}
		}
		*/

	}

}
