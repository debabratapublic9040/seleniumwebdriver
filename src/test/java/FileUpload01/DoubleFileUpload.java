package FileUpload01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleFileUpload {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		String file1="D:\\Debabrata Rout\\Demo Data\\Raja.txt";
		String file2="D:\\Debabrata Rout\\Demo Data\\Raja1.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1);
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file2);
		
		int size=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(size==2)
		{
			System.out.println("Doc Uploaded");
		}
		
		else
		{
			System.out.println("Doc not Uploaded");
		}


	}

}
