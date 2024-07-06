package seleniumPrograms.TestngMavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Searchresult_Page {
	WebDriver driver ;
	@FindBy(xpath ="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement shoe1;
	
	public void selectProduct() throws InterruptedException
	{
		shoe1.click();
		Thread.sleep(2000);
		
	}

	public Amazon_Searchresult_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
