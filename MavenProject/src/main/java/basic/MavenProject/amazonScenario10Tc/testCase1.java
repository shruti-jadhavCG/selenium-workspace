package basic.MavenProject.amazonScenario10Tc;

import java.util.List;
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

public class testCase1 extends base
{

//	1. Serach shoe->click on 1st shoe	
	

	@Test

	public void test1() throws InterruptedException 
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoe",Keys.ENTER);		
		WebElement shoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first product : shoe");
		
	}

}