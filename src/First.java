import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;    
  
public class First {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("http://www.youtube.com/"); 
	System.out.println("Title is :-"+d.getTitle());
	d.findElement(By.id("search")).sendKeys("wwe");
	Thread.sleep(19000);
	d.findElement(By.id("search-icon-legacy")).click();
    d.close();
}
}
