package RelativeXpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AncestorXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Tablets']/ancestor::ul")).click();
		driver.findElement(By.xpath("//span[text()='Checkout']/ancestor::a")).click();
		                            

	}

}
