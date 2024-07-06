package basic.MavenProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class serachMouse {
	
	@Test
	public void test1() throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mouse",Keys.ENTER);
		WebElement checkbox = driver.findElement(By.linkText("Get It in 2 Days"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Mouse - Get It In 2 Days", "Get It in 2 Days checkbox is not selected");
		Thread.sleep(2000);
		WebElement mouse = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		mouse.click();
		
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
//		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first Product : Mouse");
	}

}
