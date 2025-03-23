package Locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		boolean condition=driver.findElement(By.id("logo")).isDisplayed();
		if(condition==true)
		{
			System.out.println("Correct Logo and available in Dashboard page");
		}
		else
		{
			System.out.println("incorrect Logo and not available in Dashboard page");
		}

	}

}
