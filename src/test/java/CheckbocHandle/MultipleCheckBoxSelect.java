package CheckbocHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxSelect {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/register");
		
		//Xpath for all check box
		List<WebElement> checkboxs=driver.findElements(By.xpath("//table[@id=\"productTable\"]/descendant::input"));
		
		
		//Select and unselect check box
		/*for(WebElement checkbox:checkboxs)
			
		{
			checkbox.click();
		}
		
		Thread.sleep(2000);
		
        for(WebElement checkbox:checkboxs)
			
		{
			checkbox.click();
		}*/
		
	
	
		
		//Select all check box
		/*for(int i=0;i<checkboxs.size();i++)
			
		    {
			   checkboxs.get(i).click();
		    }*/
		
		
		
		//Select specific check box
				/*for(int i=0;i<checkboxs.size();i++)
					
				    if(i>3)
				    {
					    checkboxs.get(i).click();
				    }*/
		
		
		
		
		//UnSelect check box which is selected
		    for(int i=0;i<3;i++)
			
		    {
			    checkboxs.get(i).click();
		    }
		
		    Thread.sleep(2000);
		    
            for(int i=0;i<checkboxs.size();i++)
			
		    if(checkboxs.get(i).isSelected())
		    {
			    checkboxs.get(i).click();
		    }

	}

}
