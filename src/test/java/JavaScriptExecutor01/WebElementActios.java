package JavaScriptExecutor01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementActios {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inpField=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement radButton=driver.findElement(By.xpath("//input[@id='male']"));
		
		
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('vaule','Deb@gmail.com')",inpField);//send data
				js.executeScript("arguments[0].click()",radButton);//click
		

	}

}
