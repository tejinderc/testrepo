import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.get("http://uitestpractice.com/Students/Contact");
		   driver.findElement(By.linkText("This is a Ajax link")).click();
		   
		   
		   FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				   .withTimeout(30,TimeUnit.SECONDS)
				   .pollingEvery(5,TimeUnit.SECONDS)
				   .ignoring(NoSuchElementException.class);
		   
		   //Webelement ele = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));
		   String cont = driver.findElement(By.className("ContactUs")).getText();
		  System.out.println(cont);
				   
				   
		   

	}

}
