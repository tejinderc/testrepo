import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginnew 
   {
   public static void main(String[] args) throws InterruptedException 
   {

	   System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://localhost/login.do");
	      System.out.println("Title is :- " + driver.getTitle());   
		  Thread.sleep(10000);
		  
	   String actualtitle = "actiTIME - Login";
	   String expectedtitle = driver.getTitle();
	      Thread.sleep(10000);
	   if (actualtitle.equals(expectedtitle))
	      {
		  System.out.println("Title pass");
	      }
	   else
	      {
		  System.out.println("Title failed");   
	      }
	   
	   driver.findElement(By.id("username")).sendKeys("user");
	      Thread.sleep(10000);
	   driver.findElement(By.name("pwd")).sendKeys("user");
		  Thread.sleep(10000);
	   driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(10000);
		  System.out.println("Title is :- " + driver.getTitle());
		  
	   String actualtext = "Enter Time-Track";
	   String expectedtext = driver.findElement(By.className("pagetitle")).getText();
		  Thread.sleep(10000); 
	      System.out.println(expectedtext);
	      Thread.sleep(10000);
	   if (actualtext.equals(expectedtext))
	      {
	      System.out.println("Text verfied pass");
	      }
	      else
		  {
		  System.out.println("Text verified failed");   
		   }	  
	   driver.close();
   }  	
}