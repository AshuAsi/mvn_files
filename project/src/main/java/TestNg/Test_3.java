package TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_3 
{
	@BeforeTest
	public void BeforeMethod()
	{
	System.out.println("Before method Test_class_3");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method Test_class_3");
	}
	@Test 
	public void Quartz() 
	{
	System.out.println("Quartz,Test_class_3");
	}
	@Test (priority=2)
	public void Speedo() 
	{
		System.out.println("Speedo,Test_class_3");
		
	}
	@Test (groups="smoke")
	public void travelling() 
	{
		System.out.println("travelling,Test_class_3");
	}
	@Test (groups="smoke")
	public void bags() 
	{
		System.out.println("bags,Test_class_3");
	}
	@Test
	public void bottle() 
	{
		System.out.println("bottle,Test_class_3");
	}
	@Test
	public void caps() 
	{
		System.out.println("caps,Test_class_3");
	}
}
