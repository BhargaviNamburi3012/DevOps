package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * for multiple controls we have to provide the common attribute in cssSelector
 * ->we use findelements method and the return type is list of webelement
 */
public class D15LocateMultipleControls {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f");
		List<WebElement> txtboxes=driver.findElements(By.cssSelector("input[class=\"form-control\"]"));
        txtboxes.get(0).sendKeys("test@123");
        txtboxes.get(1).sendKeys("test123");
        driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
	}

}
