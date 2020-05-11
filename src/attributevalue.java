import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributevalue {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("http://localhost/login.do");
		      System.out.println("Title is :- " + driver.getTitle());   
		   driver.findElement(By.id("username")).sendKeys("user");
		   Thread.sleep(10000);
		   driver.findElement(By.name("pwd")).sendKeys("user");
		   Thread.sleep(10000);
		   driver.findElement(By.id("loginButton")).click();
		   Thread.sleep(10000);
			  System.out.println("Title is :- " + driver.getTitle());
			  
			String attvalue = driver.findElement(By.xpath("//span[@id='sortByCustomerNameLink']")).getAttribute("class") ;
			System.out.println("class attribute value is : " + attvalue);
			  
			  driver.close();
           }	
		      
      }	
			

