

//Reading and Writing data from and to Excel

package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D12LoginToOHRM_DDF {
	String fPath = "D:\\STAR AGILE\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int totalRows, totalCells, i, j, index = 0;
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;

	
	@Test(dataProvider = "getLoginData")
	public void login(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		actUrl = driver.getCurrentUrl();
	}

	@AfterMethod
	public void afterMethod() {
		row = sheet.getRow(index);
		cell = row.getCell(2);
		
		if (expUrl.equals(actUrl)) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test Case Pass");
			cell.setCellValue("Pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
			cell.setCellValue("Fail");
		}
		index++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		totalRows = sheet.getPhysicalNumberOfRows();
		String[][] loginData = new String[totalRows][2];
		
		for(i = 0; i < totalRows; i++)
		{
			row = sheet.getRow(i);
			for(j = 0; j < 2; j++)
			{
				cell = row.getCell(j);
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		
		return loginData;
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		fos = new FileOutputStream(file);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
		driver.close();
	}
}
