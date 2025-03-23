package GetSeleniumMethos01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dictionary.cambridge.org/dictionary/english/milestone");
		driver.manage().window().maximize();
		/*
		String url=driver.getPageSource();
		System.out.println(url);*/
		Thread.sleep(10000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}
