package DatePicket01;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BSDatePicker {
	
	//User defined method to convert month from string to moth
	static Month convertMonth(String month)
	{
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("Septmber", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth==null)
		{
			System.out.println("Invalid Month");
		}
		return vmonth;
	}
	
	public static void selectDate(WebDriver driver,String reqYear,String reqMonth,String reqDate)
	{
		
		
		//Select Year
		WebElement yearDropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select drpOption=new Select(yearDropdown);
		drpOption.selectByVisibleText(reqYear);  
		
		
		//Select Month
				while(true)
				{
				String displayMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				//Convert to month object
				Month exceptedMonth=convertMonth(reqMonth);
				Month currentMonth=convertMonth(displayMonth);
				
				
				//Compare
				int result=exceptedMonth.compareTo(currentMonth);
				
				
				if(result<0)//past
				{
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
				else if(result>0)//future
				{
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
				else
				{
					break;
				}
				}

		//Select Date
		List<WebElement> allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		
		for(WebElement date:allDate)
		{
			if(date.getText().equals(reqDate))
			{
				date.click();
				break;
			}
		}

	}

	

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String reqYear="2022";
		String reqMonth="May";
		String reqDate="10";
		

		//WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		//driver.switchTo().frame(iframe);
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		selectDate(driver,reqYear,reqMonth,reqDate);
		
		
		
	}

}
