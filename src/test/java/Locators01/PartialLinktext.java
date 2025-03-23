package Locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Tab")).click();// we can also use Tab/lets/Tablet/able instead of Tablets. We can pass portion of a link

	}

}
