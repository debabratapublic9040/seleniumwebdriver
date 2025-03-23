package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAttribute {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[name=\"search\"]")).sendKeys("T-Shairt");
		//driver.findElement(By.cssSelector("input[name='search']")).sendKeys("T-Shairt");
		driver.findElement(By.cssSelector("[name='search']")).sendKeys("T-Shirt");


	}

}
