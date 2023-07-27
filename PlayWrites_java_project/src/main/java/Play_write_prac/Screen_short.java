package Play_write_prac;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class Screen_short {

	public static void main (String[]args) {
		
	
	Playwright pw=Playwright.create();
	Browser bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page pg=bw.newPage();
	pg.navigate("https://www.amazon.in/");
	
	pg.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\PlayWrite\\img.png")));
	pg.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\PlayWrite\\Fullimg.png")).setFullPage(true));
	}
}
