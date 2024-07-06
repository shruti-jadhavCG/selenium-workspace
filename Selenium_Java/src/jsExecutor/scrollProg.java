package jsExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class scrollProg 
{
	@Test
	public void scrollDemo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement aboutus = driver.findElement(By.linkText("About Us"));
		Point p1=	aboutus.getLocation();	
		int x=	p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		
	}

}
