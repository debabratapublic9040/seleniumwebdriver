package RelativeXpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentXpath01 {

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Desktops']/parent::li")).click();
		//driver.findElement(By.xpath("//a[text()='Desktops']/..")).click();
		driver.findElement(By.xpath("//li[a[text()='Desktops']]")).click();
		
		
	
	
	}

}
