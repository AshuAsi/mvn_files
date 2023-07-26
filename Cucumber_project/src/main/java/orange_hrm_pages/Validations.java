package orange_hrm_pages;

import org.openqa.selenium.WebElement;

public class Validations extends Driver_class
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
		if(!(Username.equals(Xpath_class.User_name().getAttribute("value"))))
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
			if(!(password.equals(Xpath_class.Pass_word().getAttribute("value"))))
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
