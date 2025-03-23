package GetSeleniumMethos01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dictionary.cambridge.org/dictionary/english/milestone");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='hao lpl-10 lpr-15 i i-facebook iw fs16']")).click();
		
		Set<String> windowIDS=driver.getWindowHandles();
		System.out.println(windowIDS);

	}

}
