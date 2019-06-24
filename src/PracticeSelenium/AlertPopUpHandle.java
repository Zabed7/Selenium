package PracticeSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Wize\\eclipse-workspace-Practice2019\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		//System.out.println(alert.getText()); // prints the 'alert text'

// Validating the test
		String text = alert.getText();
		if (text.equals("Please enter a valid user nam")) {
			System.out.println("Correct alert message");
		} else {
			System.out.println("In-correct alert message");
		}

		alert.accept(); // to click on 'Ok' button

		// alert.dismiss(); // to click on 'Cancel' button

	}

}
