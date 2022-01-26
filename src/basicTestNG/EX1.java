package basicTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EX1 {
	@AfterClass
	public void method1()
	{
		System.out.println("Method1");
	}
	@BeforeClass
	public void method2()
	{
		System.out.println("Method2");
	}
	//ppppppppppppp---
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
