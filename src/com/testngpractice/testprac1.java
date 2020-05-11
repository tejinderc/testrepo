package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testprac1 {
	
	
	@BeforeClass
	public void start() {
		System.out.println("Start : This is before  class");
		
	}
	
	@BeforeMethod
	public void beforetest() {
		System.out.println("Before Test method");
	}
	
	@Test
	public void test1() {
	
	System.out.println("This is Test method");
	
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test 2 method");
	}
	
	@AfterMethod
	public void aftertest() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is after class");
	}
	
	
	
}
