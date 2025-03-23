package JavaScriptExecutor01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		/*//scroll down
		js.executeScript("window.scrollBy(0,1770)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
		/*//scroll to particular element 
		WebElement ele=driver.findElement(By.xpath("//h5[normalize-space()='Customer Service']"));
		js.executeScript("argument[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
		//scroll page to till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//scroll page to top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	    System.out.println(js.executeScript("return window.pageYOffset;"));

	}

}
