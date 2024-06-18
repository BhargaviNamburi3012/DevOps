package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03CheckTitle {

	public static void main(String[] args) 
	{
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/downloads/");
	  String title=driver.getTitle();
	  System.out.println("Title: "+title);
	  if(title.contains("selenium"))
	  {
		  System.out.println("Test is pass");
	  }
	  else
	  {
		  System.out.println("Test is fail");
	  }
	  driver.close();

	}

}
