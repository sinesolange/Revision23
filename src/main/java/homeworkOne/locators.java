package homeworkOne;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	WebDriver driver;
	
	 @Before
	 
	 public void  LaunchBrowser() {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sosos\\Desktop\\eclipsewspace\\Revions\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.objectspy.space/");
		 driver.manage().window().maximize();
		 
	 }
	 @Test
	 
	public void Test() throws InterruptedException {
		 
		driver.findElement(By.id("sex-0")).click();
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input#exp-1")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@ id = 'sex-0']")).click();
		 
		 driver.findElement(By.xpath("//Strong[contains(text(), 'Link Test : New Page')]")).click();
		
		 
		 
		 
		
	}
	@After
	public void TearDown() {
		
	}
	
}
