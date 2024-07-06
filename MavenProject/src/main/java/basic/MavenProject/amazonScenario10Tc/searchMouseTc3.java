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

public class searchMouseTc3 extends base
{

//	3. serach mouse -> sort Get It in 2 Days->click on 1st product	

	@Test
	
	public void test3() throws InterruptedException 
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mouse",Keys.ENTER);
		WebElement checkbox = driver.findElement(By.linkText("Get It in 2 Days"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		Thread.sleep(2000);

//		Assert.assertEquals(driver.getTitle(), "Amazon.in: Mouse - Get It In 2 Days", "Get It in 2 Days checkbox is not selected");
		Thread.sleep(2000);
		WebElement mouse = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		mouse.click();
		
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first shoe");
	}
}
