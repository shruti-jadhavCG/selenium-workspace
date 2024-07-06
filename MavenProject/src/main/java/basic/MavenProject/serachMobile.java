package basic.MavenProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class serachMobile {
	
//	//	2. serach mobile->click on the 1st mobile	

	@Test
	
	public void test1()
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile",Keys.ENTER);
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		mobile.click();
		
		Set<String> s = driver.getWindowHandles();
		int sizeSet = s.size();
//		System.out.println(sizeSet);
		Assert.assertEquals(sizeSet, 2, "Not able to click on first product : mobile");
	}

}
