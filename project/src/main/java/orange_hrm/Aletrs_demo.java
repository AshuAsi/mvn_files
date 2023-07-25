package orange_hrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aletrs_demo {

	public static void main(String[] args)
	{
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		d.get("https://demoqa.com/alerts");
//		By by_ele = By.xpath("//button[@id=\"alertButton\"]");
//		WebElement ele = d.findElement(by_ele);
//		ele.click();
//		By by_On = By.xpath("//button[@id=\"timerAlertButton\"]");
//		WebElement button=d.findElement(by_On);
//		button.click();
//    	System.out.println(d.switchTo().alert().getText());
//		d.switchTo().alert().accept();
    	
//    	By comform = By.xpath("//button[@id=\"confirmButton\"]");
//    	WebElement box=d.findElement(comform);
//    	box.click();
//    	System.out.println(d.switchTo().alert().getText());
//		d.switchTo().alert().accept();
//    	
    	By cancel=By.xpath("//span[@id=\"confirmResult\"]");
    	WebElement Boi=d.findElement(cancel);
    	Boi.click();
    	System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
    	
    	
	}

}
