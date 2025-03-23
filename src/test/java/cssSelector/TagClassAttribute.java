package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagClassAttribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input.form-control[name=\"search\"]")).sendKeys("T-Shirt");
		//driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("T-Shirt");
		driver.findElement(By.cssSelector(".form-control[name='search']")).sendKeys("T-Shirt");
		
	}

}
