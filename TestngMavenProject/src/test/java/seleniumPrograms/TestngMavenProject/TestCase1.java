package seleniumPrograms.TestngMavenProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends base

{
	WebDriver driver = new ChromeDriver();

	@Test
	public void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Amazon_Login_Page a1=new Amazon_Login_Page(driver);
		a1.un();
		a1.cntn_Click();
		a1.pw();
		a1.signin();
		Amazon_Home_Page a2 = new Amazon_Home_Page(driver);
		a2.SearchShoe();
		Thread.sleep(2000);
		
//		Set<String> s = driver.getWindowHandles();
//		int sizeSet = s.size();
//		System.out.println(sizeSet);
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe", "Unable to search shoe");
		
	}

}
