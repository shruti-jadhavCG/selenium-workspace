package basic.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void test1(String nameofBrowser ) 
	{
		if(nameofBrowser.equals("chrome"))
		{
			driver =new ChromeDriver();
			
		}
		if(nameofBrowser.equals("edge"))
		{
			driver =new EdgeDriver();
			
		}
		if(nameofBrowser.equals("firefox"))
		{
			driver =new FirefoxDriver();
			
		}
	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement textarea = driver.findElement(By.id("APjFqb"));
		textarea.sendKeys("India");
		textarea.sendKeys(Keys.ENTER);
	}
	
}
