package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 
XPath
===========================
XML Path
1. Absolute XPath:

  example:   Pattankodoli Bus Stand -> Take Right Turn -> Water Tank -> Hupare Nagar 9th Lane -> Ankush's Home
html

->Always start with word html
->Ignore head
->Ignore side arrow tags eg:<div>innertext</div>


2. Relative XPath:
 */

public class D13LocateByXPath_Absolute {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("teju123");
        driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();
	}

}
