package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;
	
	//intialize driver
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	
	//locators
	private By email=By.id("email-id");
	private By pwd=By.id("password");
	private By btn=By.id("submit-id");
	
	
	
	//method
	public String doLogin(String em,String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(ps);
		//Utility.capture(driver);
		driver.findElement(btn).click();
		//Utility.capture(driver);
		return driver.getCurrentUrl();
	}
}
