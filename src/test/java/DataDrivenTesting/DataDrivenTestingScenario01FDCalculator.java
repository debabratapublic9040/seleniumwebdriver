package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ExcelUtils.Excel01;

public class DataDrivenTestingScenario01FDCalculator {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div/button[@class='No thanks']")).click();
		
		String filePath=System.getProperty("user.dir")+"\\testData\\caldata.xlsx";
		
		int rowCount=Excel01.getRowCount(filePath, "Sheet1");
		//int colCount=Excel01.getColumnCount(filePath, "Sheet1", 1);// not required since we know the column count
		
		
		for(int i=1;i<=rowCount;i++)
		{
			//Read data from excel
			String principle01=Excel01.getCellData(filePath, "Sheet1", i, 0);
			String rateofInterest01=Excel01.getCellData(filePath, "Sheet1", i, 1);
			String period01=Excel01.getCellData(filePath, "Sheet1", i, 2);
			String period02=Excel01.getCellData(filePath, "Sheet1", i, 3);
			String frequency01=Excel01.getCellData(filePath, "Sheet1", i, 4);
			String expMaturityVaule=Excel01.getCellData(filePath, "Sheet1", i, 5);
			
			//Write Data in app
			
			WebElement principal=driver.findElement(By.xpath("//input[@id='principal']"));
			principal.sendKeys(principle01);
			WebElement interest=driver.findElement(By.xpath("//input[@id='interest']"));
			interest.sendKeys(rateofInterest01);
			WebElement tenure=driver.findElement(By.xpath("//input[@id='tenure']"));
			tenure.sendKeys(period01);
			WebElement tenurePeriodDrp=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
			Select drp01=new Select(tenurePeriodDrp);
			drp01.selectByVisibleText(period02);
			WebElement frequencyDrp=driver.findElement(By.xpath("//select[@id='frequency']"));
			Select drp02=new Select(frequencyDrp);
			drp02.selectByVisibleText(frequency01);
			WebElement calculatebtn=driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
			calculatebtn.click();
			
			//Compare Data or validation
			
			String actMaturityVaule=driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(Double.parseDouble(expMaturityVaule)==Double.parseDouble(actMaturityVaule))
			{
				System.out.println("Test Passed");
				Excel01.setCellData(filePath, "Sheet1", i, 7,"Passed");
				Excel01.fillGreenColour(filePath, "Sheet1", i, 7);
				
			}
			else
			{
				System.out.println("Test Failed");
				Excel01.setCellData(filePath, "Sheet1", i, 7,"Failed");
				Excel01.fillRedColour(filePath, "Sheet1", i, 7);
			}
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
		}

	}

}
