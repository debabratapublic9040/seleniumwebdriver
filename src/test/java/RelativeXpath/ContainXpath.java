package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("//input[contains(@name,'sea')]")).sendKeys("T-Shirt");
		driver.findElement(By.xpath("//input[contains(@name,'rch')]")).sendKeys("T-Shirt");

	}

}
