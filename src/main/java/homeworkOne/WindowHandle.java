package homeworkOne;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	WebDriver driver;
	
	@Test
	public void handlePopUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sosos\\Desktop\\eclipsewspace\\Revions\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.get("https://www.yahoo.com");
	
	Thread.sleep(2000);
	
	driver.getTitle();
	driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Xpath");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='rapid-noclick-resp _yb_1syj2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
	
	for (String i :driver.getWindowHandles() ) {
		driver.switchTo().window(i);
		
	}
	driver.findElement(By.linkText("CSS")).click();
	driver.findElement(By.linkText("SQL")).click();
	}
}

	
	
	


