package Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='input-username']"));
		userName.clear();
		userName.sendKeys("demoadmin");
		
		WebElement userPassword=driver.findElement(By.xpath("//input[@id='input-password']"));
		userPassword.clear();
		userPassword.sendKeys("demopass");
		
		WebElement loginBTN=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginBTN.click();
		WebElement customersBTN=driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']"));
		customersBTN.click();
		
		WebElement customersBTNChild=driver.findElement(By.xpath("//div[@id='navigation']/following::ul//li[@id='menu-customer']//ul/li[1]"));
		customersBTNChild.click();
		
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		System.out.println(text);
		
		
		/*
		WebElement text=driver.findElement(By.xpath("//div[text()='Showing 1 to 20 of 875 (44 Pages)']"));
		String vaule=text.getText();
		int startIndex=vaule.indexOf("(");
		int endIndex=vaule.indexOf("Pages");
		String AllPages=vaule.substring(startIndex+1, endIndex-1);
		int totalPages=Integer.parseInt(AllPages);
		System.out.println(totalPages);
		*/
		
		//first way to get total pages number
		//int startIndex=text.indexOf("(");
		//int endIndex=text.indexOf("Pages");
		//String AllPages=text.substring(startIndex+1, endIndex-1);
		//int totalPages=Integer.parseInt(AllPages);
		//System.out.println(totalPages);
		
		//second way to get total pages number
		int totalPages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		//System.out.println(totalPages);
		
		String header1=driver.findElement(By.xpath("//form[@id='form-customer']//table//thead/tr[1]/td[2]")).getText();
		String header2=driver.findElement(By.xpath("//form[@id='form-customer']//table//thead/tr[1]/td[3]")).getText();
		System.out.println(header1+"\t"+header2);
		
		for(int i=1;i<=totalPages;i++)
		{
			if(i>1)
			{
				WebElement activePage=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+i+"]"));
				activePage.click();
				Thread.sleep(2000);
				
			}
			
			//Read data from table
			int numberOfRows=driver.findElements(By.xpath("//*[@id=\"form-customer\"]/table/tbody/tr")).size();
			//System.out.println(numberOfRows);
			
			for(int j=1;j<=numberOfRows;j++)
			{
		       String cusName=driver.findElement(By.xpath("//form[@id='form-customer']//table//tbody/tr["+j+"]/td[2]")).getText();
		       String cusEmailID=driver.findElement(By.xpath("//form[@id='form-customer']//table//tbody/tr["+j+"]/td[3]")).getText();
		       
		       System.out.println(cusName+"\t"+cusEmailID);
			}
			
			
			
		}
		
		
		
		
		

	}

}
