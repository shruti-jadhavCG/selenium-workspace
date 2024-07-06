package basic.MavenProject.amazonScenario10Tc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class amazonFreshTc7 extends base
{
//	7. launch home page->dropdown->amazon fresh->serach for mango	
	@Test
//	@Parameters("browser")
	public void test7() throws InterruptedException 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);	
		s1.selectByVisibleText("Amazon Fresh");
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mango",Keys.ENTER);
		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "Amazon.in : mango", "tittle not matching");

	}

}
