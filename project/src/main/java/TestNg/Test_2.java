package TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_2 
{
	@BeforeTest
	public void BeforeMethod()
	{
	System.out.println("Before method Test_class_2");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method Test_class_2");
	}
	@Test
	public void m() 
	{
	System.out.println("m ,Test_class_2");
	}
	@Test
	public void m1() 
	{
		System.out.println("m1,Test_class_2");
		
	}
	@Test
	public void m2() 
	{
		System.out.println("m2,Test_class_2");
	}
	@Test
	public void m3() 
	{
		System.out.println("m3,Test_class_2");
	}
	@Test
	public void m4() 
	{
		System.out.println("m4,Test_class_2");
	}
	@Test
	public void m5() 
	{
		System.out.println("m5,Test_class_2");
	}
}
