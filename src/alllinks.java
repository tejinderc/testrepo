import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinks {

	private static int i;

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
		  Thread.sleep(1100);
		  
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  int si = links.size();
		  System.out.println("Number of Links : " + si);
		  System.out.println("---------- Links Are -----------");
		  for (i=0;i<si;i++)
		  {
			  WebElement printlinks = links.get(i);
			  String textlinks = printlinks.getText();
			  Thread.sleep(1200);
			  System.out.println(textlinks);
		  }
		  
		 driver.close();		
     
	}

}
