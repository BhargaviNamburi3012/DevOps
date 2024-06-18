
//5. Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location


package com.WebDriverAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A05Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot,new File("D:\\SwiggyScreenShot.jpeg"));
		System.out.println("Please find the Screenshot in D:\\SwiggyScreenShot.jpeg Location");
		driver.close();

	}

}
