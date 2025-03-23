package IncognitoMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode01 {
	
       public static void main(String[] args) {
		
    	   ChromeOptions options=new ChromeOptions(); 
   		options.addArguments("--incognito");
   		
   		WebDriver driver=new ChromeDriver(options);
   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   		driver.manage().window().maximize();
   		
   		String title=driver.getTitle();
   		System.out.println(title);

	}

}
