package TestNg;

import org.openqa.selenium.WebElement;

import orange_hrm_pages.Xpath_class;

public class Validations_TestNG extends Driver_class_testng
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
			public static void Invalid_userValidpswd(WebElement Invalid_user_Valid_pswd) throws Exception
			{
				if(!(Invalid_user_Valid_pswd.isDisplayed()))
				{
					throw new Exception("Invalid credentials is not dispalyed");
				}
				else
				{
					System.out.println("Invalid credentials is displayed");
				}
			}
			public static void NullUser_ValidPswd(WebElement Null_User_Valid_Pswd) throws Exception
			{
				if(!(Null_User_Valid_Pswd.isDisplayed()))
				{
					throw new Exception("Username is not required");
				}
				else
				{
					System.out.println("Username is required");
				}
			}
			public static void Invaliduser_Invalidpswd(WebElement Invalid_user_Invalid_pswd) throws Exception
			{
				if(!(Invalid_user_Invalid_pswd.isDisplayed()))
				{
					throw new Exception("Invalid credentials is not dispalyed");
				}
				else
				{
					System.out.println("Invalid credentials is displayed");
				}
			}
			public static void ValiduserInvalidpswd(WebElement Valid_user_Invalid_pswd) throws Exception
			{
				if(!(Valid_user_Invalid_pswd.isDisplayed()))
				{
					throw new Exception("Invalid credentials is not dispalyed");
				}
				else
				{
					System.out.println("Invalid credentials is displayed");
				}
			}
			public static void ValiduserNullpswd(WebElement Valid_userNullpass) throws Exception
			{
				if(!(Valid_userNullpass.isDisplayed()))
				{
					throw new Exception("Password is not required");
				}
				else
				{
					System.out.println("Password is required");
				}
			}
			
			public static void valid_username_invalid_password(WebElement valid_user_invalid_pswd) throws Exception 
			{
				if (!(valid_user_invalid_pswd.isDisplayed())) 
				{
					throw new Exception("Enter valid password");
				}
				else
				{
					System.out.println("password is required");
				}
			}
			public static void valid_username_Empty_password(WebElement valid_username_Empty_password) throws Exception 
			{
				if(!(valid_username_Empty_password.isDisplayed())) 
				{
					throw new Exception ("required");
				}
				else
				{
					System.out.println("Enter password");
				}
			}
			public static void Empty_username_Empty_password(WebElement Empty_username_Empty_password) throws Exception 
			{
				if(!(Empty_username_Empty_password.isDisplayed()))
				{
					throw new Exception ("Enter username and password"); 
				}
				else
				{
					System.out.println("required username and password");
				}
	}
	}


