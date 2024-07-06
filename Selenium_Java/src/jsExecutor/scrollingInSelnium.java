package jsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollingInSelnium 
{
//in amazon home page scrolldown till about us
	@Test
	public void scrollDemo() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement aboutus = driver.findElement(By.linkText("About Us"));
		Point p1=	aboutus.getLocation();	
		int x=	p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		
				JavascriptExecutor e1=			driver;
				e1.executeScript("window.scrollBy(0,"+y+")");
	
		
		
		
	}
}
