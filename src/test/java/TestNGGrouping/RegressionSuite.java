package TestNGGrouping;

import org.testng.annotations.Test;

public class RegressionSuite {
	
	@Test(priority=1,groups={"regression"})
	void singUpByMobNo()
	{
		System.out.println("sing up by mobile number");
	}
	@Test(priority=1,groups={"regression"})
	void singUpByTwitter()
	{
		System.out.println("sing up by Twitter");
	}
	@Test(priority=1,groups={"regression"})
	void singUpByFaceBook()
	{
		System.out.println("sing up by FaceBook");
	}

}
