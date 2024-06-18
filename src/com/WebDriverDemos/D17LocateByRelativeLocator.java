package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D17LocateByRelativeLocator {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//we can give any attribute,either name,id or className etc.
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("passContainer"))).sendKeys("test@123");

	}

}
