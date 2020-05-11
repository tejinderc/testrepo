import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
    
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable");	
	driver.switchTo().frame(0);
	// switch to frame
	
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act = new Actions(driver);
	
    //act.clickAndHold(source).moveToElement(target).release().build().perform();
	// Both Method works
	Thread.sleep(8000);
	act.dragAndDrop(source, target).build().perform();
	
	Thread.sleep(8000);
	driver.close();	
		
	}

}
