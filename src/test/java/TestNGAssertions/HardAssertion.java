package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	void hardAssertion()
	{
		System.out.println(" hardAssertion testing 01");
		Assert.assertEquals("Raja", "Raja");
		//Assert.assertEquals("Raja", "Raka");
		System.out.println(" hardAssertion testing 02");
		
		//Always we write hard assertion in last line, so it will not impact other line code even its failed
	}

}
