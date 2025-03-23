package ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {
	
	//DOM Host ===>DOM Root ===>DOM Tree/DOM Element

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   		driver.get("https://books-pwakit.appspot.com/");
   		driver.manage().window().maximize();
   		
   		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
   		Thread.sleep(1000);
   		shadow.findElement(By.cssSelector("#input")).sendKeys("Raja");

	}

}
