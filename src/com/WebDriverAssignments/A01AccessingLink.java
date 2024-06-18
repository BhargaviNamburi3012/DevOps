
//1. Write a WebDriver script to navigate to a website and click on a specific link.

package com.WebDriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A01AccessingLink {

	public static void main(String[] args) 
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable notifications-");
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		WebElement lnktxt=driver.findElement(By.linkText("Customer Care"));
		lnktxt.click();
		System.out.println("Test pass..!");

	}

}
