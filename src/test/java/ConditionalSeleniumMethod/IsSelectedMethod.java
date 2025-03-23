package ConditionalSeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gender-male']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
	

	}

}
