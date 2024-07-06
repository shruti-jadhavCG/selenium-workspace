package basic.MavenProject.amazonScenario10Tc;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class serachnGobackTc10 extends base
{

//	10. serach shoe->go back go home page
	@Test
//	@Parameters("browser")
	public void test10() throws InterruptedException
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoe", Keys.ENTER);
		WebElement shoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
//		Assert.assertEquals(shoe.isDisplayed(), "shoe visible");
		Thread.sleep(2000);
		driver.navigate().back();
		

		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Navigate to back functionality is not working");

	}
	
}
