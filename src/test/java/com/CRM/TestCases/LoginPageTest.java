package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
	
  
  @Test
  public void validateLogin()
  {
	  String nextPageurl=lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(nextPageurl.contains("customers"),"Test Fail: Login Fails!");
	  System.out.println("Test Pass: Login Completed!");
	  
  }
}
