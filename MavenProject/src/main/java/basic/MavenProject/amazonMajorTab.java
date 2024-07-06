package basic.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonMajorTab {

	@Test
	public void test1() throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement electronicsMajorTab = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
		electronicsMajorTab.click();
		Thread.sleep(2000);
		WebElement redmi = driver.findElement(By.xpath("(//span[text()='Redmi'])[1]")); //xpath not correct
		if(!redmi.isSelected())
		{
			redmi.click();
			
		}
			
		Assert.assertEquals(redmi.isSelected(), true, "redmi brand not selected");
	}
}
