package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class actimitmelogintest {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}

	@Test(priority=0)
	public void logintest() throws InterruptedException {
		Thread.sleep(5000);
		Boolean content = driver.findElement(By.id("enterTTMainContent")).isDisplayed();
		System.out.println("Login successfull" +content);
	}

	@Test(priority=1)
	public void verifyentertimepage() throws InterruptedException {
		Thread.sleep(5000);
		Boolean search = driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).isDisplayed();
		System.out.println("Enter time page verified " +search);
	}

	@Test(priority=2)
	public void verifydate() {
		Boolean date = driver.findElement(By.xpath("//button[@id ='ext-gen23']")).isDisplayed();
		System.out.println("Verified Date " +date);
		String text = driver.findElement(By.xpath("//button[@id ='ext-gen23']")).getText();
		System.out.println(text);
	}

	@Test(priority=3)
	public void displaycallender() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id ='ext-gen23']")).click();
		Thread.sleep(5000);
		Boolean callander = driver.findElement(By.xpath("//a[contains(text(),'current week')]")).isDisplayed();
		System.out.println("Callender verified " +callander);
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.close();

	}	











}
