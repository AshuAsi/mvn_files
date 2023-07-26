package Play_write_prac;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Practice_sesion_1 {

	public static void main(String[] args) 
	{
		Playwright pw = Playwright.create();//(obj create)
		Browser bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); //webdriver
		Page p=bw.newPage();
		
		p.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Locator user=p.locator("//input[@name='username']");
		user.type("Admin");
		
			Locator password=p.locator("//input[@name='password']");//webelement 
		password.type("admin123");//typemeans sendkeys
		
		Locator login=p.locator("//button[@type='submit']");
	
		login.click();

	}

}
