package cucumber_orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Orange_HRM_Login_page extends OrangeHRM_Driver_Class
{
	//x path
	static By Loginpage=By.xpath("//h5[text()='Login']");
	static By Username=By.xpath("//input[@name='username']");
	static By Password=By.xpath("//input[@name='password']");
	static By Loginbutton=By.xpath("//button[text()=' Login ']");
	static By Dashboard_Homepage=By.xpath("//img[@alt='client brand banner']");
	
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
	
	

}
