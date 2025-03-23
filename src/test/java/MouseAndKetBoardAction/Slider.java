package MouseAndKetBoardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act=new Actions(driver);
		
		/*//Min/start Slider
		WebElement slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println(slider.getLocation());
		
		
		//Right scroll
		act.dragAndDropBy(slider, 100, 233).perform();
		System.out.println(slider.getLocation());*/
		
		//Max/end Slider
		WebElement maxSlider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println(maxSlider.getLocation());
		
		//left scroll
		act.dragAndDropBy(maxSlider, -70, 233).perform();
		System.out.println(maxSlider.getLocation());

	}

}
