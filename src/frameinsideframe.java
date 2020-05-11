import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameinsideframe {
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		    
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Register.html");
			
			Actions action =  new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();
			
			driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
			
			String Title = driver.getTitle();
			System.out.println(Title);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			Thread.sleep(3000);
			
			List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
			System.out.println(iframes.size());
			
			WebElement multipleframe = driver.findElement(By.xpath("//iframe[contains(@src,'MultipleFrames.html')]"));
			driver.switchTo().frame(multipleframe);
			Thread.sleep(5000);
			WebElement singleframe = driver.findElement(By.xpath("//iframe[contains(@src,'SingleFrame.html')]"));
			driver.switchTo().frame(singleframe);
			Thread.sleep(9000);
			driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("style");
			
			Thread.sleep(8000);
			System.out.println("Successfully entered text in text box inside the frame");
			driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
