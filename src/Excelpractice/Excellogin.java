package Excelpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excellogin {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Login To Actitime By Data Driven");
		Excellogin e = new Excellogin();
		e.actitimelogin();
	}

	public void actitimelogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://vtdemo.sachinpai.com/");
		Thread.sleep(10000);

		excel2 ex = new excel2("C:\\Users\\TJ\\Desktop\\Book1.xlsx", "created");
		int lrow = ex.lastrow("created");
		System.out.println(lrow);

		for(int i=0;i<=lrow;i++) {
			String UN = ex.celldata("created", i, 0);
			String PW = ex.celldata("created", i, 1);	

			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(UN);		
//			Thread.sleep(3000);
			WebElement PSW = driver.findElement(By.id("password"));
//			Thread.sleep(3000);
			PSW.sendKeys(PW);
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
			username.clear();
			PSW.clear();
//			Thread.sleep(10000);
		}
//		System.out.println(driver.getTitle());
//		Thread.sleep(10000);
//		String actualtext = "Dashboard";
//		String expectedtext = driver.findElement(By.className("pagetitle")).getText();
//		Thread.sleep(10000); 
//		System.out.println(expectedtext);
//		Thread.sleep(10000);
//		if (actualtext.equals(expectedtext))
//		{
//			System.out.println("Text verfied pass");
//		}
//		else
//		{
//			System.out.println("Text verified failed");   
		}	  
//		driver.close();
	}	
//}