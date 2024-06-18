
//2. Implement a Page Object Model for a login page using WebDriver.

package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrangeHRMClass {
	WebDriver pomDriver;

	public OrangeHRMClass(WebDriver d) {
		this.pomDriver = d;
	}
	
	public void setUserName(String un)
	{
		
		pomDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(un);
		
	}
	public void setPassword(String ps)
	{
		pomDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys(ps);
	}
	public void Login()
	{
		pomDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
	}
	public void showMessage()
	{
		System.out.println(pomDriver.findElement(By.tagName("p")).getText());
	}
	public String getMessage()
	{
		return pomDriver.findElement(By.tagName("p")).getText();
	}
	
}
