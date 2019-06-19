package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {

	@Test
	public void test1()
	{
		Assert.assertEquals(12, 13);			
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test case 2 started");
		Assert.assertEquals(10, 12, "Please check with developer");
		System.out.println("Test case 2 failed");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("Test case 3 started");
		Assert.assertEquals("Hello", "Hello", "Words does not match please raise a bug");
		System.out.println("Test case 3 failed");
	}
	
}
