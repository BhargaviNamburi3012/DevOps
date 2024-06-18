package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 2. Relative XPath:Always starts with //tagname[@attribute]
 * ->if we rightclick on code in inspection window, we can copy both absolute xpath(full xpath) and relative xpath(xpath)
 * ->If we copy relative xpath it always shows id,which will not work,bcoz id changes everytime.
 */


public class D14LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("test123");
        driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
       // driver.findElement(By.xpath("//*[@id=\"u_0_5_MU\"]")).click();
	}

}
