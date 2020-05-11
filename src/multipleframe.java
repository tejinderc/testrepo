import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleframe {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//img[@class='lazyloading']")).click();
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement frame1 = driver.findElement(By.id("IF1"));
		
		driver.switchTo().frame(frame1);
		Thread.sleep(6000);
		String txt = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[contains(@class,'menu-text')][contains(text(),'ISTQB Exam Sample Question Paper')]")).getText();
		System.out.println(txt);
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.close();
		

	}

}
