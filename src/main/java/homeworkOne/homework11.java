package homeworkOne;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\sosos\\Desktop\\eclipsewspace\\Revions\\Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);

	}

}
