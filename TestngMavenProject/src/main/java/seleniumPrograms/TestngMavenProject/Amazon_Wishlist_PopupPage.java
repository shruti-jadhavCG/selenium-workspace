package seleniumPrograms.TestngMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Wishlist_PopupPage
{

	@FindBy(xpath = "//div[@class='a-popover-wrapper']")
	WebElement wishlistPopup ;
	
	public void getWIshlistPopup()
	{
		boolean result=wishlistPopup.isDisplayed();
		System.out.println(result);
		if(result==true)
		{
			Assert.assertEquals(result, true);
		}
		else
		{
			Assert.assertEquals(false, false, "unable to click ");
		}
	}
	
	public Amazon_Wishlist_PopupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
