package FileUpload01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFileUpload {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Debabrata Rout\\Demo Data\\Raja.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Raja.txt"))
		{
			System.out.println("Doc Uploaded");
		}
		else
		{
			System.out.println("Doc not Uploaded");
		}
		
		

	}

}
