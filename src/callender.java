import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class callender {

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
		  Thread.sleep(15000);
		
          driver.findElement(By.xpath("//td[@class='x-btn-center']")).click();
          Thread.sleep(7000);
          //driver.findElement(By.xpath("//td[@class='x-date-active']//span[contains(text(),'30')]")).click();
          //Thread.sleep(22000);
          driver.findElement(By.xpath("//tr[@id='ext-gen68']")).click();
          
          //driver.close();
          
          
	}

}
