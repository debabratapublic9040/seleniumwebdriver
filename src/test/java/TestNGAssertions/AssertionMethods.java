package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionMethods {
	
	@Test
	void test()
	{
		//Assert.assertEquals("Raja", "Raja");
		//Assert.assertEquals("Raja", "Raka");
		//Assert.assertEquals(123, 123);
		//Assert.assertEquals(123,"123");
		//Assert.assertNotEquals("Raja", "Raja");
		//Assert.assertNotEquals("Raja", "Raka");
		//Assert.assertEquals(123, 123);
		//Assert.assertEquals(123, "123");
		//Assert.assertTrue(true);
		//Assert.assertTrue(false);
		Assert.fail();
	}

}
