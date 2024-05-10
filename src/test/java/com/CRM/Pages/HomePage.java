package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//Encapsulation =Indentification(Locators) + Actions
	
	
		private WebDriver driver;//instance
		
		//intialize driver
		public HomePage(WebDriver driver)//base class driver local
		{
			this.driver=driver;
		}
		
		//locators
		private By link=By.linkText("Sign In");
		
		
		//Method
		public String getAppTitle()
		{
			return driver.getTitle();
		}
		
		
		public String getAppUrl()
		{
			return driver.getCurrentUrl();
		}
		
		
		public String getSignIn()
		{
			//Utility.capture(driver);
		driver.findElement(link).click();
		   // Utility.capture(driver);
		return driver.getCurrentUrl();//login
		}
}
