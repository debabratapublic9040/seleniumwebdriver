package RelativeXpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/search/label/selenium%20practice%20page");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='B2']/preceding::div[@id='X1']"));

	}

}
