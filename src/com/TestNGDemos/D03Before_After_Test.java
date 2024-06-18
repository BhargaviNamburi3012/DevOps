package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * =======================
Annotations in TestNG
=======================
1. @Test => Only this method is treated as Test Case
2. @BeforeTest => This is the method that executes ONLY ONCE BEFORE EXECUTING 1ST TEST CASE
3. @AfterTest => This is the method that executes ONLY ONCE AFTER EXECUTING LAST TEST CASE
 */

public class D03Before_After_Test 
{
	WebDriver driver;
  @BeforeTest
  public void openBrowser()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Browser opened");
  }
  @AfterTest
  public void closeBrowser()
  {
	  driver.close();
	  System.out.println("Browser closed");
  }
	
  @Test(priority=1)
  public void openFlipkart()
  {
	  
	  driver.get("https://www.flipkart.com/");
	  System.out.println("Title is : "+driver.getTitle());
	  
  }
  @Test(priority=2)
  public void openAmazon()
  {
	  
	  driver.get("https://www.amazon.com/");
	  System.out.println("Title is : "+driver.getTitle());
	  
  }
  @Test(priority=3)
  public void openMyntra()
  {
	  
	  driver.get("https://www.myntra.com/");
	  System.out.println("Title is : "+driver.getTitle());
	 
  }
}
