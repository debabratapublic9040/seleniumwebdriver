package MouseAndKetBoardAction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction02 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement regLink=driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']"));
		
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		Set<String> windows=driver.getWindowHandles();
		List<String> ids= new ArrayList(windows);
		System.out.println(ids.get(0));
		System.out.println(ids.get(1));
		
		String title=driver.switchTo().window(ids.get(1)).getTitle();
		System.out.println(title);
		
	
		
		
		
		

	}

}
