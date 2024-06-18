package com.TestNGDemos;


/*concept for using this:
 we will be using Xpath everytime from the websites in the script,Xpath may change later,
 and we have to update that old xpath with new xpath everytime in the script,
 instead of changing the xpath everytime,copy it in properties file and use it ,so that we no need to change the xpath everytime.
 with the help of properties file we change only once in file.
 

 */

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D08KeywordDrivenFramework {
	  WebDriver driver;
	  File file;
	  FileInputStream fis;
	  Properties prop;
  @Test
  public void login() {
	  
	    driver.findElement(By.id(prop.getProperty("emailTxtBoxID"))).sendKeys("8501036779");
		driver.findElement(By.name(prop.getProperty("passwordTxtBoxName"))).sendKeys("Teju123");
		driver.findElement(By.xpath(prop.getProperty("submitBtnXPath"))).click();
  }
  @BeforeTest
  public void beforeTest() throws IOException
  {
	//we get the path 
	file=new File("D:\\Bhargavi_Selenium_Demos\\SeleniumAutomationProject\\src\\com\\TestNGDemos\\MyData.properties");
	//FileInputStream will read the data from the properties file
	fis=new FileInputStream(file);
	//To load the file first we are creating the object 
	prop=new Properties();
	//With the help of object we are loading the data 
	prop.load(fis);
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//way to get the Url from the properties file.
	driver.get(prop.getProperty("url"));
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
