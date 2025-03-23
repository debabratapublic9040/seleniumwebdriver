package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagClass {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("T-Shirt");
		driver.findElement(By.cssSelector(".form-control")).sendKeys("T-Shirt");
		
		
	}

}
