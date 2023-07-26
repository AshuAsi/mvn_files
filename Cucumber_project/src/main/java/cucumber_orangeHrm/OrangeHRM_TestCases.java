package cucumber_orangeHrm;


public class OrangeHRM_TestCases extends OrangeHRM_Driver_Class
{
	public static void navigate_to_the_application_Tc_01() throws Exception
	{
		OrangeHRM_Driver_Class.WebDriver();
		OrangeHRM_validations.loginpage(Orange_HRM_Login_page.login_page());
	}
      
	public static void Valid_Credentials_Tc_02() throws Exception
	{
		navigate_to_the_application_Tc_01();
		
		Orange_HRM_Login_page.username_keys("Admin");
		Orange_HRM_Login_page.password_keys("admin123");
		OrangeHRM_validations.EntertedUsername("Admin");
		OrangeHRM_validations.enetredpassword("admin123");
		Orange_HRM_Login_page.loginbutton_keys();
		OrangeHRM_validations.Dashboard_Homepage_(Orange_HRM_Login_page.Dashboard_home_page());	
	}
	
	

}
