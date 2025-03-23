package TestNG01;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	//We can add 0, -1 and any other priority in the test annotation, the sequence or order can be anything. 
	//If we we provide - priority then that method will execute first
	//If any method having 0 priority then same will execute first if any - annotations are not there
	
    @Test(priority=1)//@Test(priority=0)//@Test(priority=-1)//@Test(priority=2)//@Test(priority=3)
	void openURL()
	{
		System.out.println("Open URL method-----");
	}
    @Test(priority=2)
	void login()
	{
    	System.out.println("Login method-----");
	}
	
    @Test(priority=3)
	void logout()
	{
    	System.out.println("Logout method-----");
	}

}
