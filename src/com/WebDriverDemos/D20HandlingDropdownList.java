package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * ===================================
Handling Dropdown list
===================================
1. Display selected country
2. Display total no of countries
3. Display list of all the countries
4. Select Spain from the list
5. Display selected country

Select class => Used to handle drop down list. (The control should have select tag)

Methods:
1. getFirstSelectedOption() => Return selected option from drplist (WebElement)
2. getOptions() => Returns list of all the elements in drop down list (List<WebElement>)
3. selectByVisibleText() =>
4. selectByValue() => 
5. selectByIndex() => 
 */

public class D20HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement drplist=driver.findElement(By.id("country"));
		Select countries=new Select(drplist);
		System.out.println("selected country: "+countries.getFirstSelectedOption().getText());
		List<WebElement> countryList=countries.getOptions();
		System.out.println("Total Country list is: "+countryList.size());
		/*int i=0;
		for(WebElement c:countryList)
		{
			System.out.println(i+"."+c.getText());
			i++;
		}*/
		countries.selectByVisibleText("Spain");
		//countries.selectByValue("196");
		//countries.selectByIndex(193);
		//System.out.println("selected country is: "+countries.getFirstSelectedOption().getText());

	}

}
