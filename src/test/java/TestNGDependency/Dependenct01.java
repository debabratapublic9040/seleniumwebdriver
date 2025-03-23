package TestNGDependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependenct01 {
	
	@Test(priority=1)
	void urlLaunch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"urlLaunch"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods= {"urlLaunch","login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=4, dependsOnMethods= {"urlLaunch","login","search"})
	void advSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5, dependsOnMethods= {"urlLaunch","login"})
	void logout()
	{
		Assert.assertTrue(true);
	}

}
