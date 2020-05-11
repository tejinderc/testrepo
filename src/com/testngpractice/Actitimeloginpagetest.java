package com.testngpractice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actitimeloginpagetest {

		WebDriver driver;
		
		@BeforeClass
		public void intro() {
			System.out.println("Testng practice");
		}
		
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://localhost/login.do");
			
		}
		
		@Test
		public void verifytitle() { 
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "actiTIME - Login", "Title mismatch");
		}
		
		@Test
		public void verifyactimetext() {
		   Boolean text = driver.findElement(By.xpath("//*[text()='actiTIME 2016.1']")).isDisplayed();
		    System.out.println(text);
		
		}
		
		 @AfterMethod
		 public void teardown() {
			driver.close();
		 }
		 
		 
		 @AfterClass
		 public void testcomplete() {
			 System.out.println("first testbatch successfull");
		 }
		 
		 
		 
	}