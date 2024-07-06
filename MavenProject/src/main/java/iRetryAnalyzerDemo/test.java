package iRetryAnalyzerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ListenersDemo.Test_Listeres;

public class test extends Test_Listeres {

	WebDriver driver;
	@Test(retryAnalyzer=iRetryAnalyzerDemo.demo.class)
	public void testmethod()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile",Keys.ENTER);
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline']"));
		mobile.click();
	}
}
