package seleniumPrograms.TestngMavenProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	public void SearchShoe()
	{
		searchBox.sendKeys("shoe"+Keys.ENTER);
	}

	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
