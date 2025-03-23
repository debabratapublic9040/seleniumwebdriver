package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotation01 {
	
	@BeforeTest
	void beforeTestAnnotationMethod()
	{
		System.out.println("I am in beforeTestAnnotationMethod");
	}
	
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
	
	@AfterTest
	void afterTestAnnotationMethod()
	{
		System.out.println("I am in beforeTestAnnotationMethod");
	}

}
