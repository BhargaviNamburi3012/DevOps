package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// it is running the methods in Alphabetical format
//if we set the priority,then it will run according to the methods which we have written.
//If we give the same priority,then it will run in alphabetical order.

public class D02MultipleTests {
  @Test(priority=-1)
  public void openFlipkart()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.flipkart.com/");
	  System.out.println("Title is : "+driver.getTitle());
	  driver.close();
  }
  @Test(priority=2)
  public void openAmazon()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.com/");
	  System.out.println("Title is : "+driver.getTitle());
	  driver.close();
  }
  @Test(priority=3)
  public void openMyntra()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.myntra.com/");
	  System.out.println("Title is : "+driver.getTitle());
	  driver.close();
  }
}
