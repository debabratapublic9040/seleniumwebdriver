package MouseAndKetBoardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target01=driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target01).perform();
		
		//Reverse
		WebElement target02=driver.findElement(By.xpath("//div[@id='capitals']"));
		act.dragAndDrop(target01, target02).perform();

	}

}
