 package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	void test()
	{
		
		String actTitle="Raja";
	    String expTitle="Raja";
	    
	    
	  //First way of comparison-Classic
	   /* if(actTitle.equals(expTitle))
	    {
	    	System.out.println("Title Matched");
	    }
	    else
	    {
	    	System.out.println("Title not Matched");
	    }*/
	    
	    
	  //Second way of comparison-through TestNG Assertion
	  // Assert.assertEquals(actTitle, expTitle);
	    
	    
	  //Third way of comparison-through TestNG Assertion
	    
	    if(actTitle.equals(expTitle))
	    {
	    	System.out.println("Title Matched");
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	System.out.println("Title not Matched");
	    	Assert.assertTrue(false);
	    }
	}

}
