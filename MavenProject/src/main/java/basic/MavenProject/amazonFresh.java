package basic.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonFresh {

	@Test
	public void test1() throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);	
		s1.selectByVisibleText("Amazon Fresh");
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mango",Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Amazon.in : mango", "tittle not matching");
		
	}
}
