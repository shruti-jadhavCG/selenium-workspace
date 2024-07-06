package basic.MavenProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchShoe {

	
	@Test
	
	public void test1()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoe",Keys.ENTER);		
		WebElement shoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first shoe");
		
	}
}
