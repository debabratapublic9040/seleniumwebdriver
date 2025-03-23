package Genaral;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtention {

	public static void main(String[] args) {
		
		//Add CRX Extractor/Downloader to chrome browser 
		//Add selectorHub plugin to chrome browser
		//Capture crx file path for selectorshub extensiom
		//Pass crx file path in automation script in chrome option
		//same steps for other extentios also
		
	    	ChromeOptions options=new ChromeOptions(); 
	    	File path=new File("D:\\Debabrata Rout\\Eclipse Workplace\\Extensionfiles\\SelectorsHub.crx");
	    	options.addExtensions(path);
	   		
	   		WebDriver driver=new ChromeDriver(options);
	   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   		driver.manage().window().maximize();
	   		
	   		
	}

}
