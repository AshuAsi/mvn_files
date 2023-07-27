package Play_write_prac;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Maximise {

	public static void main(String[] args) 
	{
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int) screensize.getWidth();
		int height=(int) screensize.getHeight();
		System.out.println(width+":"+height);

		Playwright pw=Playwright.create();
		Browser bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context=bw.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		BrowserContext context1=bw.newContext(new Browser.NewContextOptions().setViewportSize(560, 678));
		Page pg=context.newPage();
		Page pg1=context1.newPage();
		pg.navigate("https://www.amazon.in/");
		pg1.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


}
