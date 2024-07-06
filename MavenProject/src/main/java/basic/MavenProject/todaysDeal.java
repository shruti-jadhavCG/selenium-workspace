package basic.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class todaysDeal {

	@Test
	public void test1() throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement todaysDeal = driver.findElement(By.linkText("Today's Deals"));
		todaysDeal.click();
		Thread.sleep(2000);
		WebElement dealsOfTheDay = driver.findElement(By.xpath("(//ol[@class='a-carousel'])[1]//li[2]"));
		dealsOfTheDay.click();
		Thread.sleep(2000);
		WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='GridRow-module__container_q6XsDi4clqdE6jhYFSBW'])[1]/div[1]"));
		firstProduct.click();
	}
}
