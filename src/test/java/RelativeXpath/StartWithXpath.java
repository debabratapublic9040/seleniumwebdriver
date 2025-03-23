package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartWithXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[starts-with(@name,'search')]")).sendKeys("T-Shirt");
		driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys("T-Shirt");

	}

}
