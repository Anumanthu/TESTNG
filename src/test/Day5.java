package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	

	public class Day5 {


	
		/*// TODO Auto-generated method stub
		
		@BeforeTest
		
		public void firstexecution()
		{
			System.out.println("It will execute first");
			
		}
		
		
		@AfterTest
		public void lastexecution()
		{
			System.out.println("It will execute last");
			
		}
		
		*/
		@Test
		public void Demo1()
		{
			System.out.println("hello(1)");//automation
			//Assert.assertTrue(false);
		}
		@AfterSuite
		
		public void afSyite1()
		{
			System.out.println("I am the no 1 from last(1) ");
		}
		@Test
		public void SecondTest1()
		{
			System.out.println("bye(1)");
		}



	}
	
	
	
	
 

