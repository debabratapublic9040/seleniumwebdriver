package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1: Linkhref=http://www.deadlinkcity.com/
 2: http://www.deadlinkcity.com/-->server--->status code
 3: status code>=400 broken link || status code<=400 active link
 */

public class BrokenLinks01 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   		driver.get("http://www.deadlinkcity.com/");
   		driver.manage().window().maximize();
   		
   		List<WebElement> links = driver.findElements(By.tagName("a"));
   		System.out.println(links.size());
   		
   		
   		
	/*	
		
		for(WebElement linkElement:links)
			
			String vaule=linkElement.getAttribute("href");
   		{
   			if(vaule==null || vaule.isEmpty())
   			{
   				System.out.println("hrefAttVaule is null or empty");
   				continue;
   			}
   			
   			try {
	   		    URL linkURL  =new URL(vaule);//converted href vaule from string to URL format
	   			HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection();//open connection to the server
	   			conn.connect();//connect to the server and hit the URL
	   			
	   			if(conn.getResponseCode()>=400)
	   			{
	   				System.out.println("Broken Link");
	   			}
	   			else
	   			{
	   				System.out.println("Active Link");
	   			}
   			
   			}
   			catch(Exception e)
   			{	
   			}

   		}
   		*/
   		
   		
   		

	}

}
