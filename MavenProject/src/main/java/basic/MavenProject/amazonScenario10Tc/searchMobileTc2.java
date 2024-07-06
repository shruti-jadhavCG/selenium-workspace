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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class searchMobileTc2 extends base
{

//	2. serach mobile->click on the 1st mobile	
//	WebDriver driver;
	@Test
//	@Parameters("browser")
	public void test2() throws InterruptedException 
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile",Keys.ENTER);
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		mobile.click();
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
//		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first product : mobile");
	
		
}
}
