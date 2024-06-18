package com.Practicals;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/*
 * HYR Tutorials
 * -----------------------
 * contentSettings.put("notifications", 1);
 * -----------------------------------------------
 * for different type of popups just change only above line in the script
 * 0-default(ask)
 * 1-Allow
 * 2-Block
 * 
 */
public class P03PermissionPopups {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		HashMap<String,Integer> contentSettings=new HashMap<String,Integer>();
		HashMap<String,Object> profile=new HashMap<String,Object>();
		HashMap<String,Object> prefs=new HashMap<String,Object>();
		
		contentSettings.put("notifications", 1);
		profile.put("managed_default_content_settings",contentSettings );
		prefs.put("profile",profile);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		/*
		 * //for permission pop ups-notification popup
		ChromeOptions op=new ChromeOptions();
		op.addArguments("disable-notifications");
		
		//for-location popup
		//op.addArguments("disable-geolocation");
		
		//for microphone popup
		//op.addArguments("disable-media-stream");
		
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 

      
		driver.get("https://www.redbus.in/");*/
		 
		
		
		
		
		
	}

}
