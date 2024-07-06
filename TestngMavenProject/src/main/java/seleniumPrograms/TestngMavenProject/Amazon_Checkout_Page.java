package seleniumPrograms.TestngMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Checkout_Page 
{

	WebDriver driver;
	@FindBy(id = "addressChangeLinkId")
	WebElement changeAddress;
	
	@FindBy(xpath = "(//div[@class='a-box-inner'])[1]/fieldset/div[2]")
	WebElement selectAddr;
	
	public void selectAddressonCheckout()
	{
		changeAddress.click();
	}

	public Amazon_Checkout_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
