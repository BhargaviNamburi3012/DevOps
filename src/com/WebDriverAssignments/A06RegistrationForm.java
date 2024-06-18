//4. Implement a test case using WebDriver to validate the functionality of a registration form.

package com.WebDriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06RegistrationForm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://eroomrent.in/ownerreg.php");
		driver.findElement(By.xpath("//input[@id='txtfname']")).sendKeys("Namburi Bhargavi");
		driver.findElement(By.xpath("//input[@id='txtmobile1']")).sendKeys("6303397286");
		driver.findElement(By.xpath("//input[@id='txtpass']")).sendKeys("nambu123");
		driver.findElement(By.xpath("//input[@id='txtcpass']")).sendKeys("nambu123");
		driver.findElement(By.xpath("//input[@name='txtEmail']")).sendKeys("bhargavinamburi3012@gmail.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println("Test pass");
		

	}

}
