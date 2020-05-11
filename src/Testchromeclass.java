import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testchromeclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TJ\\\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ipage.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
