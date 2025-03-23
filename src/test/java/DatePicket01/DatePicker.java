package DatePicket01;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		String reqMonth="May";
		String reqDate="1";
		String reqYear="2025";
		
		driver.switchTo().frame(0);
		
		//Method-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(reqMonth+"/"+reqDate+"/"+reqYear);
		
		//Method-2
		WebElement datePicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		
		
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(reqMonth) && currentYear.equals(reqYear))
			{
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Past Date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Feature Date
		
		}
		
		//Select Date
		List<WebElement> allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement date:allDate)
		{
			if(date.getText().equals(reqDate))
			{
				date.click();
				break;
			}
		}
		
		
	}

}
