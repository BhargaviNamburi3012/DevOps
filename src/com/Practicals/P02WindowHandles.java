package com.Practicals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class P02WindowHandles {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable notifications-");
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://omayo.blogspot.com/");
	   String s1 = driver.getTitle();
	   System.out.println(s1);
	    
	    //captures first window
	String firstWindow=driver.getWindowHandle();
	System.out.println(firstWindow);
	
	driver.findElement(By.linkText("Open a popup window")).click();
	
	//captures both windows
	Set<String> windows = driver.getWindowHandles();
	
	//iterating through windows
	for(String s:windows)
	{
		driver.switchTo().window(s);
		if(driver.getTitle().equals("New Window"))
		{
			System.out.println("switched to second window");
			Thread.sleep(6000);
			driver.close();
		}
	}
	
//	driver.switchTo().window(firstWindow);
//	
//	String exp=driver.getTitle();
//	System.out.println(s);
//	Assert.assertTrue(false)
	
	
	
	
	//driver.switchTo().window("handle");
		//driver.close();
		

	}

}
