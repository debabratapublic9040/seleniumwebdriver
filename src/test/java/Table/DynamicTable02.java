package Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable02 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		int tableColumnSize=driver.findElements(By.xpath("//h2[contains(text(),'Pagination Table')]/following::div/table/thead/tr/th")).size();
		System.out.println(tableColumnSize);
		int tableRowSize=driver.findElements(By.xpath("//h2[contains(text(),'Pagination Table')]/following::div[@class='widget-content']//table/tbody/tr")).size();
		System.out.println(tableRowSize);
		
		int size=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
		
		
		for(int k=1;k<=size;k++)
		{
			driver.findElement(By.xpath("//ul[@class='pagination']//li["+k+"]")).click();
		
		
		for(int i=1;i<=tableRowSize;i++)
		{
			for(int j=1;j<=tableColumnSize-1;j++)
			{
				String CellData=driver.findElement(By.xpath("//h2[contains(text(),'Pagination Table')]/following::div[@class='widget-content']//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(CellData+"\t");
				
			}
			driver.findElement(By.xpath("//h2[contains(text(),'Pagination Table')]/following::div[@class='widget-content']//table/tbody/tr["+i+"]/td[4]//input")).click();
			System.out.println();
		}
		}
		



	}

}
