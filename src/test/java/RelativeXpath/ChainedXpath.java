package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChainedXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div [@class='col-md-5']/div [@id='search']/input")).sendKeys("T-Shirt");
		boolean status=driver.findElement(By.xpath("//div [@id='logo']/a ")).isDisplayed();
		System.out.println(status);

	}

}
