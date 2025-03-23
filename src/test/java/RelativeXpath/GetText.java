package RelativeXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
		System.out.println(text);
		boolean status=driver.findElement(By.xpath("//a[text()='MacBook']")).isDisplayed();
		System.out.println(status);
	}

}
