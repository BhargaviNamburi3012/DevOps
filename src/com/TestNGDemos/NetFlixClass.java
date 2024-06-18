package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NetFlixClass {
	WebDriver pomDriver;

	public NetFlixClass(WebDriver d) {
		this.pomDriver = d;
	}
	
	public void setUserName(String un)
	{
		pomDriver.findElement(By.xpath("//*[@id=\":r0:\"]")).sendKeys(un);
	}
	public void setPassword(String ps)
	{
		pomDriver.findElement(By.xpath("//*[@id=\":r3:\"]")).sendKeys(ps);
	}
	public void signIn()
	{
		pomDriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/form/button[1]")).click();
	}
	public void showMessage()
	{
		System.out.println(pomDriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/header/div/div/div")).getText());
	}
	public String getMessage()
	{
		return pomDriver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/header/div/div/div")).getText();
	}
}
