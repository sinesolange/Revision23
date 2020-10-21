package homeworkOne;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUp {

	@Test
	public void handlePopUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sosos\\Desktop\\eclipsewspace\\Revions\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	// Go to Rediff Site
	// Click on the go button
	// Close the popup
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@name='FormName']/following-sibling::div/descendant::input[@value='Go']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	}
}
