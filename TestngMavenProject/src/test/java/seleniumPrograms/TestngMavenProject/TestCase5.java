package seleniumPrograms.TestngMavenProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class TestCase5 {

	@Test
	public void selectAddress() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
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
		Amazon_Searchresult_Page a3 = new Amazon_Searchresult_Page(driver);
		a3.selectProduct();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> id1 = id.iterator();
		String pid=  id1.next();
		String cid= id1.next();
		driver.switchTo().window(cid);
		Amazon_product_Page a4 = new Amazon_product_Page(driver);
		a4.clickBuyNow();
		Amazon_Checkout_Page a5 = new Amazon_Checkout_Page(driver);
		a5.selectAddressonCheckout();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), " Amazon.in Checkout", "Unable to select address");
	}

}
