package FrameIframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrameSwitch {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		/*//frame-1
		WebElement searchBox = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(searchBox);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();*/
		
		//frame-3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");
		driver.switchTo().frame(0);
		WebElement rdButton=driver.findElement(By.xpath("div[id='i8'] div[class='AB7Lab Id5V1']"));
		Thread.sleep(5000);
		rdButton.click();
		
		/*
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", rdButton);
		*/
	}

}
