package PracticeSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wize\\eclipse-workspace-Practice2019\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
		
		driver.get("https://classic.crmpro.com");
		
		driver.findElement(By.name("username")).sendKeys("AliBaba7");
		driver.findElement(By.name("password")).sendKeys("ZCRMPROz");
		
		Thread.sleep(5000);
		
//To handle chat pop-up box
		driver.switchTo().frame("intercom-borderless-frame");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
		driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
		
		driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();

////To handle frame inside a page
//		driver.switchTo().frame("mainpanel");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[contains(@text(),'Contacts')]")).click();
		
	}

}
