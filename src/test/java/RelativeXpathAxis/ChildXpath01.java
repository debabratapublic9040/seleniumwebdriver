package RelativeXpathAxis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildXpath01 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//ex-1
		//driver.findElement(By.xpath("//li[@class='nav-item']/child::a")).click();
		driver.findElement(By.xpath("//li[@class='nav-item']/..")).click();
		
		//ex-2
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[1]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[2]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[3]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[4]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[5]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[6]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[7]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[8]")).click();
		
		

	}

}
