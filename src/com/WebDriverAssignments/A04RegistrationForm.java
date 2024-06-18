package com.WebDriverAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class A04RegistrationForm {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable notifications-");
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver; 
		Object Element = null;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		//js.executeScript(“arguments[0].scrollIntoView();”, WebElement);
		//js.executeScript(arguments[0].scrollIntoView();”, element);
		//Object window;
		//js.executeScript(“((Object) window).scrollBy(40,3000)”);*/
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Namburi");
		driver.findElement(By.id("lastName")).sendKeys("Bhargavi");
		driver.findElement(By.id("userEmail")).sendKeys("bhargavinamburi97@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement femaleRadiobtn=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		femaleRadiobtn.click();
		driver.findElement(By.id("userNumber")).sendKeys("9848485084");
		
		/*driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month.selectByVisibleText("December");
		Thread.sleep(3000);
		int date  = 30;
		driver.findElement(By.xpath("//div[@class='react-datepicker__week']/div[contains(text(),"+date+")]")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[@value='1997']"));*/
		
		//driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Automation Testing");
		Thread.sleep(3000);
		WebElement chkbox=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		if(chkbox.isSelected()==false)
		{
			chkbox.click();
	    }
		Thread.sleep(1000);
		/*WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
		upload.click();
		upload.sendKeys("C:\\Users\\bharg\\OneDrive\\Pictures\\Screenshots\\Screenshot (5).png");*/
		driver.findElement(By.id("currentAddress")).sendKeys("khammam");
		WebElement stateListdrpdown=driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		stateListdrpdown.click();
	
		
		
		
		
		
		

	}

}
