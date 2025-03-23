package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	
	  public void onStart(ITestContext context) {
		  System.out.println("Test Execution is started");
	  }
	  public void onTestStart(ITestResult result) {
		  System.out.println("Test method execution started");
	  }
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test method executed successfully");
	  } 
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test method Failed");
	  }
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test method Skipped");
	  }
	  public void onFinish(ITestContext context) {
		  System.out.println("Test Completed");
	  }

}
