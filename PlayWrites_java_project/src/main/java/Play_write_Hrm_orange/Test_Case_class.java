package Play_write_Hrm_orange;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Case_class extends  Browser_class_driver
{
	
	@BeforeMethod
	public void open_page()
	
	{
		
		Browser_class_driver.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
		String act_url="https://tutorialsninja.com/demo/index.php?route=account/login";
	assertEquals(act_url,Browser_class_driver.p.url(),"incorrect url");
		
		System.out.println("testcase1 passesd");

	}
	
	@Test
public void valid_credentials()
{
xpath_class.enter_email("asifashfaq36@gmail.com");
String act_email="asifashfaq36@gmail.com";
assertEquals(act_email,xpath_class.email().inputValue(),"invalid mailid");
	
xpath_class.enter_pass("selfe1304@");
String act_password="selfe1304@";
assertEquals(act_password,xpath_class.password().inputValue(),"invalid password");


xpath_class.login_click();
assertTrue(xpath_class.login_msg().isVisible(),"daashboard page opened");
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
	

