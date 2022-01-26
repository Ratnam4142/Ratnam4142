package basicTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EX2 
{
	@AfterMethod
	public void method1()
	{
		System.out.println("Method1");
		Reporter.log("TestNG Framework");
	}
	@BeforeMethod
	public void method2()
	{
		System.out.println("Method2");
		Reporter.log("TestNG Framework");
	}
	@Test(priority=2)
	public void method3()
	{
		System.out.println("Method3");
		Reporter.log("TestNG Framework");
	}
	
	@Test(priority=1)
	public void method4()
	{
		System.out.println("Method4");
		Reporter.log("TestNG Framework");
	}
}
