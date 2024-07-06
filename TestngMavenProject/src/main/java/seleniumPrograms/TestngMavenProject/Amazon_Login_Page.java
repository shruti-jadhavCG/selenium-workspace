package seleniumPrograms.TestngMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page
{
	WebDriver driver ;

	@FindBy(name="email")
	WebElement mobileno;
	
	@FindBy(id="continue")
	WebElement cntn;
	
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	public void un()
	{
		mobileno.sendKeys("8237446190");
	}
	public void cntn_Click()
	{
		cntn.click();
	}
	public void pw()
	{
																																																											password.sendKeys("Trigger@123");
	}
	
	public void signin()
	{
		signin.click();
	}
	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
