package Popup_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement myAlert=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		myAlert.click();
		Thread.sleep(2000);
		

	}

}
