package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

/*In this Page Object Model, we create two seperate classes ,one is for methods, 
  and the other class we write the logic to run the testcase.
 */
public class D09POMClient {
	WebDriver driver;
	NetFlixClass n1;
  @Test
  public void login() throws InterruptedException {
	  
	    n1.setUserName("6303397286");
		n1.setPassword("12345678");
		n1.signIn();
		Thread.sleep(5000);
		//n1.showMessage();
		System.out.println(n1.getMessage());
		
		Assert.assertTrue(n1.getMessage().contains("Sorry"));
  }
  @BeforeTest
  public void beforeTest() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.netflix.com/login");
		
		n1=new NetFlixClass(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
/*public class D09POMClient {
	WebDriver driver;
	NetFlixClass n1;
	
	@Test
	public void login() throws InterruptedException {
		n1.setUserName("9890742718");
		n1.setPassword("122222222");
		n1.signIn();
		Thread.sleep(5000);
		//n1.showMessage();
		System.out.println(n1.getMessage());
		
		Assert.assertTrue(n1.getMessage().contains("Sorry"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.netflix.com/login");
		
		n1 = new NetFlixClass(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}*/
	
