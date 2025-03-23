package Locators01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		List<WebElement> headerLink=driver.findElements(By.tagName("li"));
		System.out.println("Header link in the page: "+headerLink.size());
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("link in the page: "+link.size());
		
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("Imgage in the page: "+ image.size());

	}

}
