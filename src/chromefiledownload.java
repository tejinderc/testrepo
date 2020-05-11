import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromefiledownload {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 
         // donloading in downloadfolder only
          
          String downlodpath = "E:\\Movies";
          
          HashMap<String, Object> chromePref = new HashMap<String, Object>();
          chromePref.put("profile.download_content_settings.popups", 0);
          chromePref.put("download.default.directory", downlodpath);
          
          ChromeOptions options = new ChromeOptions();
          options.setExperimentalOption("prefs", chromePref);
          
          System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		   
          driver = new ChromeDriver(options); 
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
          driver.get("http://demo.automationtesting.in/FileDownload.html");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("sample download");
          Thread.sleep(4000);
          driver.findElement(By.xpath("//button[@id='createTxt']")).click();
   	      Thread.sleep(6000);
   	      driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
   	      Thread.sleep(6000);
          driver.close();
	}

}
