package basicTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annatations {
	@BeforeMethod
	public void BeforeMethodTestCase1()
	{
		System.out.println("This code will run before every testcase");
	}
	@AfterMethod
	public void AfterMethodTestCase1()
	{
		System.out.println("This code will run After every testcase");
	}
    @Test
    public void BookFlight_RoundTrip_TestCase1() 
    {
	    System.out.println("TestCase1");
    }
    @Test(dependsOnMethods= {"BookFlight_RoundTrip_TestCase1"})
    public void BookFlight_RoundTrip_TestCase2() 
    {
	    System.out.println("TestCase2");
    }
    @BeforeTest
	public void Beforetesttestcase1() 
    {
		System.out.println("Ratnam from ponugupadu");
	}
    @Test
    public void BookFlight_OneWay_TestCase3() 
    {
	    System.out.println("TestCase3");
    }
    @AfterTest
	public void Aftertesttestcase1() {
		System.out.println("joshi from guntur");
	}
   @Test
   public void BookFlight_OneWay_TestCase4() 
   {
	    System.out.println("TestCase4");
   }
}
