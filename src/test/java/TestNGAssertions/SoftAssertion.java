package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
	@Test
	void hardAssertion()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println(" hardAssertion testing 01");
		//sa.assertEquals("Raja", "Raja");
		sa.assertEquals("Raja", "Raka");
		System.out.println(" hardAssertion testing 02");
		
		sa.assertAll();
		
		//Always we write assertAll() method in last line, so it will do the exact validation, if we will not mention same then all it will pass our method.
	}
}
