package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpLoadPopUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wize\\eclipse-workspace-Practice2019\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://html.com/input-type-file/");
		
//Instead of clicking the "Choose File OR Browse" button...use ".sendkeys" with file path
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Wize\\Documents\\TestFile.txt");
		
		
	}

}
