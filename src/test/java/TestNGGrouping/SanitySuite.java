package TestNGGrouping;

import org.testng.annotations.Test;

public class SanitySuite {
	
	@Test(priority=1,groups={"sanity"})
	void loginByMobNo()
	{
		System.out.println("Login by mobile number");
	}
	@Test(priority=1,groups={"sanity"})
	void loginByTwitter()
	{
		System.out.println("Login by Twitter");
	}
	@Test(priority=1,groups={"sanity"})
	void loginByFaceBook()
	{
		System.out.println("Login by FaceBook");
	}

}
