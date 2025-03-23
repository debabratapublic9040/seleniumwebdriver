package Screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		Thread.sleep(5000);
		
		/*
		//full page screenshot
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);//get path
		File targetFile =new File(".\\screenshots\\fullpage1.png");//set own path
		sourceFile.renameTo(targetFile);//copy
		*/
		
		/*
		//specific element screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        File sourceFile1 =logo.getScreenshotAs(OutputType.FILE);//get path
		File targetFile1 =new File(".\\screenshots\\logo.png");//set own path
		sourceFile1.renameTo(targetFile1);//copy
		*/
		
		//multiple element screenshots
		WebElement form=driver.findElement(By.xpath("//form[@class='oxd-form']"));
        File sourceFile2 =form.getScreenshotAs(OutputType.FILE);//get path
		File targetFile2 =new File(".\\screenshots\\form.png");//set own path
		sourceFile2.renameTo(targetFile2);//copy

	}

}
