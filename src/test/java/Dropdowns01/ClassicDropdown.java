package Dropdowns01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassicDropdown {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdownEle=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select dropdown=new Select(dropdownEle);
		//dropdown.selectByValue("uk");
		//dropdown.selectByVisibleText("Canada");
		//dropdown.selectByIndex(5);
		
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
		
		/*for(WebElement option:options)
		{
			System.out.println(option.getText());
		}*/
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		

	}

}
