import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluehostmouseover {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   driver.get("http://bluehost.com");
			   Thread.sleep(1100);
			   String title1 = driver.getTitle();
			   System.out.println(title1);
			  Thread.sleep(8000);
			   
			  WebElement hosting = driver.findElement(By.xpath("//ul[@id='standard-nav']//li[8]"));
			  
			  Actions act = new Actions(driver);
			  act.moveToElement(hosting).perform();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu dropdown-menu-right']//li//a[contains(text(),'VPS Hosting')]")).click();
			  WebElement button = driver.findElement(By.xpath("//a[contains(@class,'btn-lg')]"));
			  act.contextClick(button).perform();
			  Thread.sleep(8000);
			  String title2 = driver.getTitle();
			  System.out.println(title2);
			  act.moveToElement(button).sendKeys(Keys.ENTER).perform();
			   Thread.sleep(8000);
			   String title3 = driver.getTitle();
				  System.out.println(title3);
			   driver.close();
	}

}
