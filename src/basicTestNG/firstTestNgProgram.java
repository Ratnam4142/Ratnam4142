
package basicTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstTestNgProgram {
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
	@Test
	public void method3()
	{
		System.out.println("Method3");
		Reporter.log("TestNG Framework");
	}
	@Test
	public void method4()
	{
		System.out.println("Method4");
		Reporter.log("TestNG Framework");
	}

}
