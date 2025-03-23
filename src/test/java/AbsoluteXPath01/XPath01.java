package AbsoluteXPath01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath01 {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("T-Shirt");

	}

}
