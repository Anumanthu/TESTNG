package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {


    //Day5 d=new Day5();


    // TODO Auto-generated method stub

    @BeforeTest

    public void firstexecution() {
        System.out.println("It will execute first");

    }


    @AfterTest
    public void lastexecution() {
        System.out.println("It will execute last");

    }

    @Test
    public void Demo() {
        System.out.println("hello");//automation
        //Assert.assertTrue(false);
    }

    @AfterSuite

    public void afterSuite() {
        System.out.println("I am the no 1 from last ");
    }

    @Test
    public void SecondTest() {
        System.out.println("bye");
    }


}
