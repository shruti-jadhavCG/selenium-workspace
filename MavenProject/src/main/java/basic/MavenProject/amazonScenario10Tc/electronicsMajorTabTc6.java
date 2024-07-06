package basic.MavenProject.amazonScenario10Tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class electronicsMajorTabTc6 extends base
{
//	6. after launch->click on electronics major tab->select brand as redmi	
	@Test
//	@Parameters("browser")
	public void test6() throws InterruptedException 
	{
		WebElement electronicsMajorTab = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
		electronicsMajorTab.click();
//		WebElement redmi = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[9]"));
		Thread.sleep(2000);
		WebElement redmi = driver.findElement(By.xpath("(//span[text()='Redmi'])[1]")); //xpath not correct
		if(!redmi.isSelected())
		{
			redmi.click();
			
		}
			
		Assert.assertEquals(redmi.isSelected(), true, "redmi brand not selected");
	
//		WebElement electronicsMajorTab = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
//		electronicsMajorTab.click();
//		Thread.sleep(2000);
//		WebElement redmi = driver.findElement(By.xpath("(//span[text()='Redmi'])[1]")); //xpath not correct
//		redmi.click();
	
		
	}

}
