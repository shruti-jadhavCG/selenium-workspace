package basic.MavenProject.amazonScenario10Tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class base 
{
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofBrowser ) throws InterruptedException 
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
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
		
		@AfterMethod
		public void driverclose()
		{
			driver.quit();
		}

}
