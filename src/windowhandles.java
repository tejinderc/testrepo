import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.out.println("Window handles examples");
	
    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TJ\\\\Desktop\\\\Eclipse Workplace\\\\Drivers\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("https://www.irctc.co.in/nget/train-search");
    String currenturl = "https://www.irctc.co.in/nget/train-search";
    String expectedurl = driver.getCurrentUrl();
    if (currenturl.equals(expectedurl))
    {
    	System.out.println("Irctc Home Page Verification passed ");
    }
    else
    {
    	System.out.println("Irctc Home Page Verification Failed");
    }
    driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
    Thread.sleep(6000);
    
    Set<String> handles = driver.getWindowHandles();
    Iterator<String> it = handles.iterator();
    String irctc = it.next(); 
    String flight = it.next();
 
    System.out.println(irctc);
    System.out.println(flight);
     
     driver.switchTo().window(flight);
     Thread.sleep(8000);
     driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
     Thread.sleep(8000);
     driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
     Thread.sleep(8000);
     driver.close();
     
     driver.switchTo().window(irctc);
     Thread.sleep(6000);
     
     driver.switchTo().window(irctc);
     driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("Bangalore");
     Thread.sleep(6000);
     driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("CHANDIGARH - CDG");
     Thread.sleep(6000);
     driver.findElement(By.xpath("//button[contains(text(),'Find trains')]")).click();
     screenshot.pageScreenshot(irctc);
     driver.close();
     
	}

	}