package test;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testcase1 
{

	@Test
	public static void login()
	{
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement hoverver = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement signin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		Actions a = new Actions(driver);
		a.moveToElement(hoverver);
		signin.click();
	}

}
