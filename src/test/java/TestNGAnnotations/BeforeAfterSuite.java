package TestNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterSuite{
	
	@Test
	void SuiteMethod()
	{
		System.out.println("Test01 method");
	}
	
	@BeforeSuite
	void beforeSuiteAnnotationMethod()
	{
		System.out.println("I am in beforeSuiteAnnotationMethod");
	}
	@AfterSuite
	void afterSuiteAnnotationMethod()
	{
		System.out.println("I am in afterSuiteAnnotationMethod");
	}

}
