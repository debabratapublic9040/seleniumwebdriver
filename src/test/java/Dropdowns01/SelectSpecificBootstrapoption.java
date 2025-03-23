package Dropdowns01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSpecificBootstrapoption {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		

        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li"));
        System.out.println(options.size());
        
        for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
        
        for(WebElement option:options)
		{
			String op=option.getText();
			if(op.equals("Java") || op.equals("Python") || op.equals("MySQL"))
			{
				option.click();
			}
		}

	}

}
