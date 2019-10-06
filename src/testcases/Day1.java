package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	

	@AfterTest
	public void lastexecution()
	{
		System.out.println("Day1 It will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Day1 hello");//automation code
		//Assert.assertTrue(false);
	}
	

	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Day1 I'm the no 1 from LAST");
	}
	
	
	
	@Test
	public void SecondTest()
	{
		System.out.println("Day1 bye");//automation code
		//Assert.assertTrue(false);
	}

}
