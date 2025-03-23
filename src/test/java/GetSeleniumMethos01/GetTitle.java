package GetSeleniumMethos01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://aguat.indecomm.net/AuditGenius_External_UAT/");
		driver.manage().window().maximize();
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#loginModal']")).click();
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Debabrata1");
		driver.findElement(By.xpath("//input[@id='txtPwd']")).sendKeys("Password16$");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		String title=driver.getTitle();
		System.out.println(title);

	}

}
