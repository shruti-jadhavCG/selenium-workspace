package skipTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class skipTestCaseDemo 
{

	@Test
	public void login()
	{
		Assert.assertEquals(true, false);
	}
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Assert.assertEquals(true, false);
	}
}
