package Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		//System.out.println(rows.size());
		List<WebElement> column=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		//System.out.println(column.size());
		
		
		//Print the total price of all books
		
		int totalPrice=0;
		
		for(int i=2;i<=rows.size();i++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			totalPrice=totalPrice+Integer.parseInt(price);
		}
		
		System.out.println("Total price of all books ="+totalPrice);
		
		//Print Mukesh book names
		/*
		for(int i=2;i<=rows.size();i++)
		{
		String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]")).getText();
		
		if(name.equals("Mukesh"))
				{
			
			     String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]")).getText();
			     System.out.println(name+" is the author of "+bookName+" book");
			
				}
		}
		
		
		*/
		
		//Print all table data
		/*
        List<WebElement> tableHeaders=driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		
		for(WebElement header:tableHeaders)
		{
			System.out.print(header.getText()+"\t");
		}
		System.out.println();
		
		for(int r=2;r<=rows.size();r++)
		{
			for(int c=1;c<=column.size();c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		*/
		
		
		
		/*
		//Print header
		List<WebElement> tableHeaders=driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		
		for(WebElement header:tableHeaders)
		{
			System.out.print(header.getText()+"\t");
		}
		System.out.println();
		*/
		
		
		/*
		//Print all table data 
		List<WebElement> tableData=driver.findElements(By.xpath("//table[@name='BookTable']//tr/td"));
		
		for(int i=0;i<tableData.size();i++)
		{
			System.out.print(tableData.get(i).getText()+"\t");
		}
		System.out.println();
		*/
		
		
		//Print specific data from table
		//WebElement cellData=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/td[1]"));
		//System.out.println(cellData);
		
		//Print specific header data from table
		//WebElement cellData=driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[1]"));
		//System.out.println(cellData);
	}

}
