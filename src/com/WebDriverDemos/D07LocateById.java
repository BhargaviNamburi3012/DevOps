package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateById {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("namburibhargavi97@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("test@123");
		//WebElement lgin = driver.findElement(By.id("u_0_5_R/"));//NoSuchElementException
		WebElement lgin = driver.findElement(By.name("login"));
		lgin.click();

	}

}
