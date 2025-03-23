package TestNGGrouping;

import org.testng.annotations.Test;

public class FunctionalTestSuite {
	
	@Test(priority=1,groups={"regression","sanity","functional"})
	void paymentThroughRupee()
	{
		System.out.println("Rupee Payment");
	}
	@Test(priority=1,groups={"regression","sanity","functional"})
	void paymentThroughDollar()
	{
		System.out.println("Dollar Payment");
	}

}
