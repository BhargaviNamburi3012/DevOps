package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13POMOrangeOHRMClient {
	WebDriver driver;
	OrangeHRMClass n1;
	
  @Test
  public void login() throws InterruptedException {
	  
	    n1.setUserName("Admin");
		n1.setPassword("admin123");
		n1.Login();
		Thread.sleep(5000);
		//n1.showMessage();
		System.out.println(n1.getMessage());
		Assert.assertFalse(n1.getMessage().contains("Invalid"));
  }
  @BeforeTest
  public void beforeTest() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		n1=new OrangeHRMClass(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
