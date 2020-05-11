import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltopage {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.get("http://ipage.com");
	   Thread.sleep(1100);
	   String title1 = driver.getTitle();
	   System.out.println(title1);
	   
	   String att = driver.findElement(By.xpath("//div[@class='text-center']//a[@class='btn btn-lg btn-primary'][contains(text(),'Get Started Now')]")).getText();
	   System.out.println(att);
	   JavascriptExecutor js = (JavascriptExecutor)driver;  
       js.executeScript("scrollBy(0, 2500)");  
	   Thread.sleep(7000);
	   driver.close();
}
}