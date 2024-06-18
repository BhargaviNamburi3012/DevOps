package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*================================
Synchronization
================================
Process of adjusting speed of tool with speed of application

1. Thread.Sleep()
	a. It is taking mandatory delay
	b. It is applicable to Single statement only*/

public class D21Synchronization_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
        
		// to disable popups from browser
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//from
		/*driver.findElement(By.id("src")).sendKeys("Bang");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]")).click();
		//To
		driver.findElement(By.id("dest")).sendKeys("Chen");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]")).click();
		//date
		//driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		//driver.findElement(By.xpath("/html/body")).click();
		
	    //search
		driver.findElement(By.id("search_button")).click();
		//result
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText());
		driver.close();*/
		
		driver.findElement(By.id("src")).sendKeys("Kolh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		//To
		driver.findElement(By.id("dest")).sendKeys("Chen");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		//Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[2]/span[1]")).click();
		//Search Bus
		driver.findElement(By.id("search_button")).click();
		//Result
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"29948242\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();

	}

}
