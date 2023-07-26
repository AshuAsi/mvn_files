package cucumber_orangeHrm;

import org.openqa.selenium.WebElement;


public class OrangeHRM_validations extends  OrangeHRM_Driver_Class  
{
	public static void loginpage(WebElement login) throws Exception
	{
		if(!(login.isDisplayed()))
		{
			throw new Exception("login page not displayed ") ;
		}
		else
		{
			System.out.println("login page is displayed");
		}
	
	}
	
	public static void EntertedUsername(String Username)throws Exception
	{
		if(!(Username.equals(Orange_HRM_Login_page.User_name().getAttribute("value"))))
		{
			throw new Exception("Enterted username is not displayed");
			
		}
		else
		{
			System.out.println("Entered username is displayed");
			
		}
	}
		public static void enetredpassword(String password) throws Exception
		{
			if(!(password.equals(Orange_HRM_Login_page.Pass_word().getAttribute("value"))))
			{
				throw new Exception("Entered password is not displyed");
			}
			else
			{
				System.out.println("Entered password is displayed");
			}

		}
		public static void Dashboard_Homepage_(WebElement homepage) throws Exception
		{
			if(!(homepage.isDisplayed()))
			{
				throw new Exception("Home page is not dispalyed");
			}
			else
			{
				System.out.println("Home page is displayed");
			}
		}
}
