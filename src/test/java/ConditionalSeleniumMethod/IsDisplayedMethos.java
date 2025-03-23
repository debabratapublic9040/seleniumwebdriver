package ConditionalSeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethos {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		boolean status=driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed();
		System.out.println(status);

	}

}
