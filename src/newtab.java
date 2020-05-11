import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		 
		
//		By using java script we can open new tab.Tested in chrome driver and firefox browsers
		JavascriptExecutor jse= ((JavascriptExecutor) driver);
		jse.executeScript("window.open()");
		
		Thread.sleep(5000);
		
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
