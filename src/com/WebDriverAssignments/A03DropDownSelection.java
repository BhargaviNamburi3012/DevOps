
//3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.

package com.WebDriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class A03DropDownSelection {

	public static void main(String[] args) {
		//ChromeOptions op=new ChromeOptions();
		//op.addArguments("--disable notifications-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement Element=driver.findElement(By.id("option"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Select optn=new Select(Element);
		optn.selectByValue("option 2");
		System.out.println("selected option is : "+ optn.getFirstSelectedOption().getText());
        //driver.close();
		System.out.println("Test pass");
	}

}
