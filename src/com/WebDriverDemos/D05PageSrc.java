package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05PageSrc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String pgsrc=driver.getPageSource();
		System.out.println("Pagesource is: "+pgsrc);
		driver.close();

	}

}
