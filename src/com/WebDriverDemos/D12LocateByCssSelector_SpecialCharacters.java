package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  b. Using Special Characters
		i. ^ => Starts With
			tagName[attribute$="value"]
		ii. $ => Ends With
		iii. * => Contains
 */
public class D12LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//i. ^ => Starts With
		driver.findElement(By.cssSelector("input[name^=\"em\"]")).sendKeys("test@gmail.com");
		//ii. $ => Ends With
        driver.findElement(By.cssSelector("input[type$=\"word\"]")).sendKeys("test123");
        //iii. * => Contains middle value
        driver.findElement(By.cssSelector("button[data-testid*=\"_login_\"")).click();

	}

}
