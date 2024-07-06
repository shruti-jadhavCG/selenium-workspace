package basic.MavenProject.amazonScenario10Tc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.*;

public class searchMobileCoverTc4 extends base
{

//	4. serach mobile cover->Include Out of Stock checkbox	
	
//	WebDriver driver;
	@Test
//	@Parameters("browser")
	public void test4() throws InterruptedException 
	{
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile cover",Keys.ENTER);
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.linkText("Include Out of Stock"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
			
		}
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Mobile Cover - Include Out Of Stock" , "tittle not matching");	}
}
