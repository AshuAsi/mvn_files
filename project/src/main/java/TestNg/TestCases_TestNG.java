package TestNg;

import org.testng.annotations.Test;

import orange_hrm_pages.Validations;
import orange_hrm_pages.Xpath_class;

public class TestCases_TestNG extends Driver_class_testng 
	{
	@Test
		public static void navigate_to_the_application_Tc_01() throws Exception
		{
		Driver_class_testng.WebDriver();
		Validations_TestNG.loginpage(Xpath_class.login_page());
		}
	@Test 
		public static void Valid_Credentials_Tc_02() throws Exception
		{
			
			
			Xpath_class.username_keys("Admin");
			Xpath_class.password_keys("admin123");
			Validations_TestNG.EntertedUsername("Admin");
			Validations_TestNG.enetredpassword("admin123");
			Xpath_class.loginbutton_keys();
			Validations_TestNG.Dashboard_Homepage_(Xpath_class.Dashboard_home_page());	
		}
	@Test
		public static void invalid_Credentials_Tc_03() throws Exception
		{ 
		
			
			
			Xpath_class.username_keys("Admi");
			Xpath_class.password_keys("admin128");
			Validations_TestNG.EntertedUsername("Admi");
			Validations_TestNG.enetredpassword("admin128");
			Xpath_class.loginbutton_keys();
			Validations_TestNG.Invalid_userValidpswd(Xpath_class.Invalid_Credentials());	
		}
	@Test
		public static void valid_userName_and_invalid_pswd_Tc_04() throws Exception 
		
		{
			
			Xpath_class.password_keys("admin124");
			Validations_TestNG.EntertedUsername("Admin");
			Validations_TestNG.enetredpassword("admin124");
			Xpath_class.loginbutton_keys();
			Validations_TestNG.NullUser_ValidPswd(Xpath_class.valid_user_invalid_pswd());	
		}
	@Test
		public static void invalid_user_valid_pswd_Tc_05() throws Exception
		{
			
			
			Xpath_class.username_keys("Admi");
			Xpath_class.password_keys("admin123");
			Validations_TestNG.EntertedUsername("Admi");
			Validations_TestNG.enetredpassword("admin123");
			Xpath_class.loginbutton_keys();
			Validations_TestNG.Invaliduser_Invalidpswd(Xpath_class.Invalid_Credentials());	
		}
	@Test
		public static void empty_user_valid_pswd_Tc_06() throws Exception
		{
			

			Xpath_class.password_keys("admin123");
			Validations_TestNG.enetredpassword("admin123");
			Xpath_class.loginbutton_keys();
			Validations_TestNG.ValiduserInvalidpswd(Xpath_class.Empty_User_ValidPswd());	
		}
	@Test
		public static void valid_user_empty_pswd_txbox_Tc_07() throws Exception
		{
			
			
			Xpath_class.username_keys("Admin");
			Validations_TestNG.EntertedUsername("Admin");
			Xpath_class.loginbutton_keys();
			Validations_TestNG.ValiduserNullpswd(Xpath_class.valid_user_Empty_pswd());	
		}
	@Test
		public static void empty_user_txbox_empty_pswd_Tc_08() throws Exception
		{
			
			
			Xpath_class.loginbutton_keys();
			Validations_TestNG.Empty_username_Empty_password(Xpath_class.Empty_User_EmptyPswd());	
		}
		
}
