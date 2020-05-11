import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadsample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		   driver.get("https://filebin.net");
		   Thread.sleep(12000);
		  
          driver.findElement(By.xpath("//input[@id='fileField']")).sendKeys("C:\\Users\\TJ\\Desktop\\samplefor upload.txt");
          Thread.sleep(3000);
          driver.close();
          
          
	}

}
