package basic.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchMobileCover {

//	//	4. serach mobile cover->Include Out of Stock checkbox	

	@Test
	public void test1() throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile cover",Keys.ENTER);
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.linkText("Include Out of Stock"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
			
		}
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Mobile Cover - Include Out Of Stock" , "tittle not matching");

	}
}
