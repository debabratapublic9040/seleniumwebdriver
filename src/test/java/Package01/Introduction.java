package Package01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new FirefoxDriver();
		//WebDriver driver2=new EdgeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		
		if(title.equals("Your Store"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Correct Title");
		}
		
		//driver.close();
		driver.quit();
		
		
		
	}

}
