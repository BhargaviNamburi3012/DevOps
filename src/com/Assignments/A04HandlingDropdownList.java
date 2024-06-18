package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A04HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement daydrpdown=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[1]"));
		Select day=new Select(daydrpdown);
		day.selectByVisibleText("30");
		WebElement monthdrpdown=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[2]"));
	    Select month=new Select(monthdrpdown);
	    month.selectByVisibleText("DEC");
	    WebElement yeardrpdown=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[3]"));
	    Select year=new Select(yeardrpdown);
	    year.selectByVisibleText("1997");
	    //System.out.println("My Birthdate is: "+day.selectByVisibleText("30")+"-"+ month.selectByVisibleText("DEC")+"-"+ year.selectByVisibleText("1997"));
	
	}
	

}
