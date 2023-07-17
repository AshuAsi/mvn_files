package orange_hrm_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath_class extends Driver_class
{
	static By Loginpage=By.xpath("//h5[text()='Login']");
	static By Username=By.xpath("//input[@name='username']");
	static By Password=By.xpath("//input[@name='password']");
	static By Loginbutton=By.xpath("//button[text()=' Login ']");
	static By Dashboard_Homepage=By.xpath("//img[@alt='client brand banner']");
	static By Invalid_credentials=By.xpath("//p[text()='Invalid credentials']");
	static By Empty_UsernameValidPass=By.xpath("//span[text()='Required']");
	static By validuser_invalidpswd=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	static By valid_user_emptyPswd=By.xpath("//span[text()='Required']");
	static By empty_user_empty_pswd=By.xpath("//span[text()='Required']");

	public static WebElement login_page()
	{
		WebElement login_page=d.findElement(Loginpage);

		return login_page;
	}

	public static WebElement User_name ()
	{
		WebElement user_name=d.findElement(Username);
		return user_name ;
	}
	public static  WebElement Pass_word() 
	{
		WebElement pass_word=d.findElement(Password);
		return pass_word ;
	}
	public static WebElement Login_button() 
	{
		WebElement Login_button=d.findElement(Loginbutton);
		return Login_button ;
	}
	public static WebElement Dashboard_home_page() 
	{
		WebElement Dashboard_home_page=d.findElement(Dashboard_Homepage);
		return Dashboard_home_page;
	}
	public static WebElement  Invalid_Credentials () 
	{
		WebElement invalid_creditials=d.findElement(Invalid_credentials);
		return invalid_creditials;
	}
	public static WebElement Empty_User_ValidPswd ()
	{
		WebElement nulluser=d.findElement(Empty_UsernameValidPass);
		return nulluser;
	}
	public static void username_keys(String username) 
	{
		User_name().click();
		User_name().sendKeys(username);
	}
	public static void password_keys(String Password) 
	{
		Pass_word().click();
		Pass_word().sendKeys(Password);
	}
	public static void loginbutton_keys() 
	{
		Login_button().click();
	}
	public static  WebElement valid_user_invalid_pswd() 
	{
		WebElement valid_user_invalid_pswd=d.findElement(validuser_invalidpswd);
		return valid_user_invalid_pswd;
	}
	public static WebElement valid_user_Empty_pswd() 
	{
		WebElement valid_user_Empty_pswd=d.findElement(valid_user_emptyPswd);
		return valid_user_Empty_pswd;
	}
	public static WebElement Empty_User_EmptyPswd()
	{
		WebElement Empty_user_empty_pswd=d.findElement(empty_user_empty_pswd);
		return Empty_user_empty_pswd;
	}

}
