package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass01 {

	@BeforeClass
	void login()
	{
		System.out.println("login method");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println(" search method");
	}
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advanceSearch method");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("logout method");
	}
	
}
