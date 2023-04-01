package Tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGgrouping {
	@Test (groups = {"TestApplication1", "RegressionTest", "UAtest"})
	public void method1()
	{
		System.out.println("Output for Method1");
		Assert.assertEquals(10, 10);
	}
	@Test (groups = {"TestApplication2", "SmokeTest"})
	public void method2()
	{
		System.out.println("Output for Method2");
	
	}
	@Test (groups = {"IntegrationTest", "TestApplication3", "RegressionTest"})
	public void method3()
	{
		System.out.println("Output for Method3");
		
	}
	@Test (groups = {"UAtest", "SmokeTest"})
	public void method4()
	{
		System.out.println("Output for Method4");
	
	}
	@Test (groups = {"RegressionTest", "SmokeTest"})
	public void method5()
	{
		System.out.println("Output for Method5");
		
	}
}
