package orange_hrm_pages;

public class Test_cases extends Driver_class 
{
	public static void navigate_to_the_application_Tc_01() throws Exception
	{
		Driver_class.WebDriver();
		
		Validations.loginpage(Xpath_class.login_page());
		Driver_class.close();
	}
      
	public static void Valid_Credentials_Tc_02() throws Exception
	{
		navigate_to_the_application_Tc_01();
		
		Xpath_class.username_keys("Admin");
		Xpath_class.password_keys("admin123");
		Validations.EntertedUsername("Admin");
		Validations.enetredpassword("admin123");
		Xpath_class.loginbutton_keys();
		Validations.Dashboard_Homepage_(Xpath_class.Dashboard_home_page());	
	}
	
	

}
