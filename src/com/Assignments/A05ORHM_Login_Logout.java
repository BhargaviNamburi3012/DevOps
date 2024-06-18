package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*public class A05ORHM_Login_Logout {
	 WebDriver driver;
	 String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
  
  @BeforeTest
  public void openBrowser()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  System.out.println("Browser opened");
  }
  @AfterTest
  public void closeBrowser()
  {
	  driver.close();
	  System.out.println("Browser closed");
  }
  @Test
  public void loginToOHRM1() 
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  actUrl=driver.getCurrentUrl();
	  if(expUrl.equals(actUrl))
	  {
		  driver.findElement(By.xpath("i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		  driver.findElement(By.partialLinkText("Log")).click();
		  System.out.println("Test case pass");
	  }
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText());
      }
  }
  @Test
  public void loginToOHRM2() 
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("bhargavi");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("bhargavi123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  actUrl=driver.getCurrentUrl();
	  if(expUrl.equals(actUrl))
	  {
		  driver.findElement(By.xpath("i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		  driver.findElement(By.partialLinkText("Log")).click();
	  }
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText());
		
  }
  
}
}*/
public class A05ORHM_Login_Logout  {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;

	@Test
	public void loginToOHRM1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		actUrl = driver.getCurrentUrl();

		if (expUrl.equals(actUrl)) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
	}

	@Test
	public void loginToOHRM2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("spandana");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("spandana123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		actUrl = driver.getCurrentUrl();

		if (expUrl.equals(actUrl)) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
