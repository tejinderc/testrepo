
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class screenshot {
      static WebDriver driver;
      
      
	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TJ\\\\Desktop\\\\Eclipse Workplace\\\\Drivers\\\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.get("https://bluehost.com");
		    pageScreenshot("bluehost_homepage");
		    Thread.sleep(5000);
		    driver.close();
		    
	}          
                  public static void pageScreenshot(String filename) throws IOException
                  {
                	File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                	//taking file object from takescreenshot out
                	
                	FileUtils.copyFile(f, new File("C:\\Users\\TJ\\Downloads/"+filename+".jpg"));
                	
                	  
                  }
                	  
                    
	}


