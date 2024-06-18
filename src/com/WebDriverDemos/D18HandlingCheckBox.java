package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//-> isSelected() method is to check whether the checkbox or RadioButton is selected or not and the return type is boolean.

public class D18HandlingCheckBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//driver.findElement(By.cssSelector("input[name^=\"chk\"]")).click();
		WebElement altmail=driver.findElement(By.cssSelector("input[name^=\"chk\"]"));
		System.out.println("Before clicking");
		System.out.println("Selected : "+altmail.isSelected());
		System.out.println("visible : "+altmail.isDisplayed());
		System.out.println("Enabled : "+altmail.isEnabled());
        if(altmail.isSelected()==false)
        {
        	altmail.click();
        }
        System.out.println("After clicking");
		System.out.println("Selected : "+altmail.isSelected());
		System.out.println("visible : "+altmail.isDisplayed());
		System.out.println("Enabled : "+altmail.isEnabled());
        
	}

}
