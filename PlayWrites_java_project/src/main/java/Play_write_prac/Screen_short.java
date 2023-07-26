package Play_write_prac;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Screen_short {

	public static void main(String[] args) 
	{
		  try (Playwright playwright = Playwright.create()) {
	            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	            Page page = browser.newPage();

	            page.navigate("https://www.google.com");
	           

	            page.fill("//textarea[@class='gLFyf']", "facebook.com");
	            page.click("//div[@jsname='VlcLAe']//input[@value='Google Search']");
	          

	            page.click("//h3[text()='Facebook - log in or sign up']");
	            

	            page.fill("//input[@class='inputtext _55r1 _6luy']", "9133786935");
	            page.fill("//input[@class='inputtext _55r1 _6luy _9npi']", "asifasif");

	            page.click("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']");
	         

	            String screenshotPath = "C:\\screenshot\\Example.png";
	            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(screenshotPath)));

	       
	        }
	    }

	}


