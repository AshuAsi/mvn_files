package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_class_testng 
{
	public static WebDriver d;
	public static void WebDriver() 
	{
		d=new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		d.manage().window().maximize();
	}

}
