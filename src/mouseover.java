import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseover {
		
		public static void main(String[] args) throws InterruptedException {

			   System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   driver.get("http://localhost/login.do");
			      System.out.println("Title is :- " + driver.getTitle());   
			   driver.findElement(By.id("username")).sendKeys("admin");
			   Thread.sleep(10000);
			   driver.findElement(By.name("pwd")).sendKeys("manager");
			   Thread.sleep(10000);
			   driver.findElement(By.id("loginButton")).click();
			   Thread.sleep(10000);	
			   
			   driver.findElement(By.xpath("//div[contains(@class,'popup_menu_icon warning_icon')]")).click();
			   Thread.sleep(6000);
			   driver.findElement(By.xpath("//a[contains(text(),'Licenses')]")).click();
		       Thread.sleep(10000);
		       driver.navigate().back();
		       Thread.sleep(10000);
		       
		 driver.close();
	}

}
