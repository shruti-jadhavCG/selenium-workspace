package basic.MavenProject.amazonScenario10Tc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class searchCameraTc5 extends base
{

//	5. serach camera->click on 35th camera	
	
//	WebDriver driver;
	@Test
//	@Parameters("browser")
	public void test5() throws InterruptedException 
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("camera",Keys.ENTER);
		Thread.sleep(2000);
		WebElement next =  driver.findElement(By.linkText("Next"));
		next.click();
		Thread.sleep(2000);
//		Assert.assertEquals(driver.getTitle(), "Amazon.in: Camera", "unable to click next button");
		WebElement camera = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		camera.click();
		Thread.sleep(2000);
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
//		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first product : Camera");
		
	}
}
