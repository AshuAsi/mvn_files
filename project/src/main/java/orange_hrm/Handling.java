package orange_hrm;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver handling=new ChromeDriver();
		handling.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		handling.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		handling.manage().window().maximize();
		By Handling_xpath=By.xpath("//a[text()='OrangeHRM, Inc']");
		String parent=handling.getWindowHandle();
		WebElement login=handling.findElement(Handling_xpath);
		login.click();
		Set<String>windows=handling.getWindowHandles();
		for(String child:windows)
		{
			if(!parent.equals(child)) 
			{
				handling.switchTo().window(child);
				By Email_xpath= By.xpath("//div[@class='middleColumn']//input[@id='Form_submitForm_EmailHomePage']");
				WebElement Emailxpath= handling.findElement(Email_xpath);
				Emailxpath.click();
				Thread.sleep(3000);
				Emailxpath.sendKeys("asifashfaq36@gmail.com");
				Thread.sleep(3000);
				//handling.close();
			}
		handling.switchTo().window(parent);
		}
		By User_name=By.xpath("//input[@name='username']");
		WebElement username=handling.findElement(User_name);
		username.click();
		Thread.sleep(3000);
		username.sendKeys("Admin");
		Thread.sleep(3000);
	
		By pass_word=By.xpath("//input[@name='password']");
		WebElement password=handling.findElement(pass_word);
		password.click();
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		
		 By logi=By.xpath("//button[text()=' Login ']");
		  WebElement l=handling.findElement(logi);
		  l.click();
		  Thread.sleep(3000);
		
		By qu_button=By.xpath("//i[@class='oxd-icon bi-question-lg']");
		WebElement qumarkbutton=handling.findElement(qu_button);
		qumarkbutton.click();
		Thread.sleep(3000);
	}
	}


