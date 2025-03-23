package BrowserNavigationAndAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowsID {

	public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Official Documentation']")).click();
		
		Set<String> id=driver.getWindowHandles();
		
		List<String> ids= new ArrayList(id);
		
		//System.out.println(ids);
		
		for(String url:ids)
		{
			String title=driver.switchTo().window(url).getTitle();
			
			//if(title.equals("OpenCart - Demo") || title.equals("OpenCart Documentation"))
			//if(title.equals("OpenCart Documentation"))
			if(title.equals("OpenCart - Demo"))
			{
				driver.close();
			}
			else
			{
				System.out.println("No correct title");
			}
			
		}

	}

}
