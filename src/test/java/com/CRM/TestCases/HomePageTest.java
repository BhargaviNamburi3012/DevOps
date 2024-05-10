package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
  
  @Test(priority=1)
  public void validateURL()
  {
	  //HomePage hp=new HomePage(driver);
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail: Url NOt Matched!");
	  System.out.println("Test Pass: URL matched!");
}
  
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer Service"),"Test Fail: Title is not mnatched!");
	  System.out.println("Test Pass: Title matched!");

  }
  
  @Test(priority=3)
  public void validateSignIn()
  {
	  String actUrl=hp.getSignIn();
	  Assert.assertTrue(actUrl.contains("login"),"Test Fail: User is not navigated on Login page!");
	  System.out.println("Test Pass: USer navigated in Login page!");
  }
}
