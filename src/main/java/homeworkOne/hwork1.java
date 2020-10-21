package homeworkOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class hwork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sosos\\Desktop\\eclipsewspace\\Revions\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://igihe.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	}

}
