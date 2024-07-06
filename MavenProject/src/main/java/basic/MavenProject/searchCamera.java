package basic.MavenProject;

import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class searchCamera 
{
	@Test
	public void test1() throws InterruptedException
	{
//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("camera",Keys.ENTER);
		Thread.sleep(2000);
		WebElement next =  driver.findElement(By.linkText("Next"));
		next.click();
		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "Amazon.in: Camera", "unable to click next button");
		WebElement camera = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		camera.click();
		Thread.sleep(2000);
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
//		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first product : Camera");
	}
}
