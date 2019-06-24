package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wize\\eclipse-workspace-Practice2019\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
// Get the webpage title
		String title = driver.getTitle(); 
		
// Print webpage title
		System.out.println(title);
		
// Validation point
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is wrong");
		}
		
//********************************************
		System.out.println(" ");
		
		System.out.println(driver.getCurrentUrl());
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if(url.equals("https://www.google.com/?gws_rd=ssl")) {
			System.out.println("URL is correct");
		}else {
			System.out.println("URL is wrong");
		}

		//driver.close();
	}

}
