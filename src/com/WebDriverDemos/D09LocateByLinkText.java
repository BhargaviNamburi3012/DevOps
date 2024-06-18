package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class D09LocateByLinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//for linktext we have to select the inner text which is present in <a>Innertext</a> in inspecting window
		WebElement lnktxt=driver.findElement(By.linkText("Gmail"));
		lnktxt.click();

	}

}
