package seleniumPrograms.TestngMavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product_Page
{

	WebDriver driver;
	@FindBy(id = "add-to-wishlist-button-submit")
	WebElement wishListBtn;
	
	@FindBy(id ="add-to-cart-button")
	WebElement addToCartBtn;
	
	@FindBy(id ="buy-now-button")
	WebElement buyNowBtn;
	
		
	public void selectProduct()
	{
		wishListBtn.click();
	}
	public void addToCartProduct()
	{
		addToCartBtn.click();
	}
	public void clickBuyNow()
	{
		buyNowBtn.click();
	}

	public Amazon_product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
