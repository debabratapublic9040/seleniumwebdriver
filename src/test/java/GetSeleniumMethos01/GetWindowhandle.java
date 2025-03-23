package GetSeleniumMethos01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dictionary.cambridge.org/dictionary/english/milestone");
		driver.manage().window().maximize();
		
		String windowID=driver.getWindowHandle();
		System.out.println(windowID);

	}

}
