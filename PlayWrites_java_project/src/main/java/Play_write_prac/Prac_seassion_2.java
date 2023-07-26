package Play_write_prac;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Prac_seassion_2 {

	public static void main(String[] args)
	{
		Playwright  pw = Playwright.create();
		Browser bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page p=bw.newPage();
		p.navigate("https://www.google.com/");
		Locator search= p.locator("//textarea[@type='search']");
		search.type("Flipkart");
		Locator Ck=p.locator("//div[@jsname='VlcLAe']//input[@role='button']");
		Ck.click();
		Locator ClickOnFllipkart=p.locator("//div[@class='eKjLze']//h3[text()='Flipkart']");
		ClickOnFllipkart.click();
		Locator log=p.locator("//button[@class='_2KpZ6l _2doB4z']");
		log.click();
//		Locator mobil=p.locator("//div[text()='Mobiles']");
//		mobil.click();
		Locator offer=p.locator("//div[text()='Top Offers']");
		offer.click();

	}

}
