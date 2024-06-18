package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16LocateByTagName {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		//System.out.println("First link of total links: "+links.get(0).getText());
		// or
		/*for(WebElement w:links)
		{
			System.out.println(w.getText());
			//9885378460
		}*/
        driver.close();
	}

}
