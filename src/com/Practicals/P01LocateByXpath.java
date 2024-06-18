package com.Practicals;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class P01LocateByXpath {

	public static void main(String[] args)
	{
		//for permission pop ups-notification popup
		ChromeOptions op=new ChromeOptions();
		op.addArguments("disable-notifications");
		
		//for-location popup
		//op.addArguments("disable-geolocation");
		
		//for microphone popup
		//op.addArguments("disable-media-stream");
		
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 

      
		driver.get("https://www.redbus.in/");
	   
		driver.findElement(By.id("src")).sendKeys("kol");
		 
		driver.findElement(By.xpath("//div[@role='button']/ul[1]/li[1]")).click();
		driver.findElement(By.id("dest")).sendKeys("chen");
		driver.findElement(By.xpath("//div[@role='button' and @tabindex='2']/ul/li[1]")).click();
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']//div//text")).click();
		driver.findElement(By.id("search_button")).click();
		
        
        driver.close();

	}

}
