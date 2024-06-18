package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*4. CssSelector: If there is no name,id,className in inspection window or dom then we can choose any attribute with value or we can choose two attributes with value also.
      a. Using Attribute
                syntax:tagName[attribute="value"]or tagName[attribute="value"][attrubute2="value']
                example:input[data-testid="royal_email"]
                points to remember:Inspect-select attribute with value-copy-click ctrl+f-code will be highlighted with yellow and in cntrl+f it will show 1of1.
                */

public class D11LocateByCssSelector_Attribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]")).sendKeys("test@gmail.com");
        //driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("test123");
        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("test123");
        driver.findElement(By.cssSelector("button[value=\"1\"]")).click();
	}

}
