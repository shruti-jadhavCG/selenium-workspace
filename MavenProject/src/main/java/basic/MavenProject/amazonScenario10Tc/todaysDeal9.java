package basic.MavenProject.amazonScenario10Tc;

import org.openqa.selenium.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class todaysDeal9 extends base
{

//	9.Launch home page->click on todays deals->deals of the day->click on the 1st product 	

	@Test
	@Parameters("browser")
	public void test9() throws InterruptedException 
	{
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
