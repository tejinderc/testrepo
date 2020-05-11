import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class filedownload {

	public static void main(String[] args) throws InterruptedException {
		
		//Downloading only in download folder
		String filepath = "\"E:\\Movies\"";
		
		FirefoxOptions  options = new FirefoxOptions();
		options.addPreference("browser.download.folderlist", 2);
		options.addPreference("browser.helperApps.alwaysAsk.force", false);
		options.addPreference("browser.download.dir", filepath);
		options.addPreference("browser.download.defaultFolder", filepath);
		options.addPreference("browser.download.manager.showWhenStarting", false);
		options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		

       System.setProperty("webdriver.gecko.driver", "C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver(options);
      
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.toolsqa.com/automation-practice-form");
		
       driver.findElement(By.xpath("//a[contains(text(),'Selenium Automation Hybrid Framework')]")).click();
	   Thread.sleep(6000);
	   driver.close();
		
	}

}
