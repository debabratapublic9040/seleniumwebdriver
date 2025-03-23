package HeadLeassTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting01 {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://dictionary.cambridge.org/dictionary/english/milestone");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Advantages
		//1-Faster
		//can perform multiple task at one time
		
		//Disadvantages
		//People can not see the action and they cannot understand the flow/functionality.

	}

}
