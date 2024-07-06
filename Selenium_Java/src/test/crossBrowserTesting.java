package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class crossBrowserTesting {

	@Test
	public static void login() throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getTitle());
		WebElement textarea = driver.findElement(By.id("APjFqb"));
		textarea.sendKeys("India");
		textarea.sendKeys(Keys.ENTER);
	}
	
}
