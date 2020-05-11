import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Java script alert  confirmation pop up  example 

public class createtask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.get("http://localhost/login.do");
		   Thread.sleep(1100);
		   
		   String actualtext = "Please identify yourself";
		   String expectedtext = driver.findElement(By.xpath("//td[@id='headerContainer']")).getText();
		   
		   if (actualtext.equals(expectedtext))
		   {
			   System.out.println("Page verified");
		   }
		   else
		   {
			   System.out.println("Page verification failed");
		   }
		
		   Thread.sleep(1100);
		   
		  WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		  WebElement pwd  = driver.findElement(By.xpath("//input[@type='password']"));
		  WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		  user.sendKeys("user");
		  Thread.sleep(1100);
		  pwd.sendKeys("user");
		  Thread.sleep(1100);
		  login.click();
		  Thread.sleep(7000);
		  driver.findElement(By.xpath("//img[@style='display:block']")).click();
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("testmangerlenovo");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//table[contains(@class,'createTasksTable hideEstimate')]//tr[2]//td[1]//input[1]")).sendKeys("lenovotest");
		 driver.findElement(By.xpath("//table[contains(@class,'createTasksTable hideEstimate')]//tr[3]//td[1]//input[1]")).sendKeys("newlenovo");
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//img[@id='closeCreateTasksPopupButton']")).click();
		 Thread.sleep(6000);
		 
		 String alttxt = driver.switchTo().alert().getText();
		 System.out.println(alttxt);
		 // Getting and printing text of confirmation pop up
		 Thread.sleep(6000);
		 
		 driver.switchTo().alert().accept();
		 //Clicking on OK button of confirmation pop up
		 Thread.sleep(6000);
		 
         driver.close();		
     
	}

}
